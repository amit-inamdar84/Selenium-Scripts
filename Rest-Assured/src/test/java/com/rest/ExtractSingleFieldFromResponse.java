package com.rest;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class ExtractSingleFieldFromResponse {
	@Test
	public void extract_single_value_from_response(){
		Response response = given().
		        baseUri("https://api.postman.com").
		        header("X-Api-Key", "PMAK-60de07fe8fb00c00420c921c-3f1db985cf81176141543b003c6ec9e61d").
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
	}





}
