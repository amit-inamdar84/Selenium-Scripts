package com.rest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExtractSingleFieldFromResponse {
	
	@DataProvider(name = "GetKey")
	public Object[] getAPIKey() throws IOException{
		File file = new File("D:/Git/Rest-Assured/src/main/java/com/helper/configFile/config.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties OR = new Properties();
		OR.load(fis);
		//Object[] data = new Object[]{OR.getProperty("APIKey")};This is alternative way to convert String to Object array.
		Object[] data = new Object[1];//Declaring object array of size 1
		data[0] = OR.getProperty("APIKey");//Storing string type data in 0th position of Object array.
		return data;
	}
	
	@Test(dataProvider = "GetKey")
	public void extract_single_value_from_response(String apiKey){
		Response response = given().
		        baseUri("https://api.postman.com").
		        header("X-Api-Key", apiKey).
		when().
		        get("/workspaces/").
		then().
		        assertThat().
		        statusCode(200).
		        extract().
		        response();
//There are multiple ways to extract single field value from response. They are listed below.
		//Option1: On reference of Response interface call method path() which accepts json path as argument and returns value.
		System.out.println("Response: "+response.path("workspaces[0].name"));
		//Option2: Create an object of JsonPath class constructor JsonPath(String). On the object reference call method .getString
		//and pass Json Path as argument.
		JsonPath jsonPath = new JsonPath(response.getBody().asString());//Constructor argument is response body as string.
		System.out.println("Response: "+jsonPath.getString("workspaces[0].name"));
		//Option3: Call static method .from of JsonPath class that accepts response as string and returns JsonPath object. On that call
		//.getString() method same like in option2 above.
		System.out.println("Response: "+JsonPath.from(response.asString()).getString("workspaces[0].name"));
		System.out.println("------------------------------------------------------------------------------------------");
		
		//Hamcrest assertions - Visible only after importing import static org.hamcrest.MatcherAssert.assertThat;
		//Or should add maven dependency
		assertThat(jsonPath.getString("workspaces[0].name"), equalTo("Test2"));
		
		//TestNG assertion
		Assert.assertEquals(jsonPath.getString("workspaces[0].name"), "Test2");
		
	}





}
