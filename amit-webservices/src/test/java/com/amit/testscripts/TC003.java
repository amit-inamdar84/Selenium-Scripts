package com.amit.testscripts;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC003 {
	@Test
	public void loginAuthentication(){
		RequestSpecification requestSpecification = RestAssured.given().auth().form("amit.inamdar84@gmail.com", "Screener_3007");
		Response response = requestSpecification.get("https://www.screener.in/dash/");
		System.out.println(response.body().asString());
		//JSONObject obj = new JSONObject(response);
		//String auth = obj.getString("csrftoken");
		//System.out.println(auth);
	}

}
