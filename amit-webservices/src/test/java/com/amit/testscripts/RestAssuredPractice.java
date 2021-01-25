package com.amit.testscripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPractice {
	@Test
	public void practiceRestMethods(){
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		//Response response = requestSpecification.get("https://reqres.in/api/users?page=2")
				//.then().body("data.id", equalTo(5));
	}

}
