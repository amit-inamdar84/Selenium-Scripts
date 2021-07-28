package com.rest;

import static io.restassured.RestAssured.given;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.config.LogConfig;
import io.restassured.config.RestAssuredConfig;

public class Logging {

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
	public void logging_request_response(String apiKey){
		Set<String> headers = new HashSet<String>();//Storing all headers in collection
		headers.add("X-Api-Key");
		headers.add("Accept");
		given().
		        baseUri("https://api.postman.com").
		        header("X-Api-Key", apiKey).
		        //log().all().//Logging request. all() will log everything i.e. headers, cookies, parameters,  body etc.
		        //log().headers(). // Logs only headers
		        //Use below config code to avoid multiple log().ifValidationFails() statements.
		        //config(RestAssuredConfig.config().logConfig(LogConfig.logConfig().enableLoggingOfRequestAndResponseIfValidationFails())).
		        //config(RestAssuredConfig.config().logConfig(LogConfig.logConfig().blacklistHeader("X-Api-Key"))).//To avoid printing header values.
		        config(RestAssuredConfig.config().logConfig(LogConfig.logConfig().blacklistHeaders(headers))).//Another method for header blacklisting.
		        log().all().
		when().
		        get("/workspaces/").
		then().
		        //log().all().//Logging response. all() will log everything i.e. headers, cookies, parameters, body etc.
		        //log().ifError().//logs only if there is an error in response.
		        //log().ifValidationFails().//logs only if status code validation fails.
		        assertThat().
		        statusCode(200);
	}









}
