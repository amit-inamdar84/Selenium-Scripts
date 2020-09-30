package com.amit.testscripts;

import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.FormAuthConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC003 {

	@DataProvider(name = "credentials")
	public Object[][] credentials() {
		Object[][] result = new Object[1][1];
		result[0][0] = "{\"email\": \"eve.holt@reqres.in\",\"password\": \"cityslicka\"}";
		return result;
	}

	@Test(description = "Form based authentication")
	public void loginAuthentication() {
		RequestSpecification requestSpecification = RestAssured.given().auth().form("amit.inamdar84@gmail.com","Test", new FormAuthConfig("/session", "login", "password"));
		Response response = requestSpecification.get("https://github.com/session");//Not redirecting to the required page. Need to check.
		System.out.println(response.getStatusCode());
		System.out.println(response.body().asString());
		//JSONObject obj = new JSONObject(response);
		//String auth = obj.getString("authenticity_token");
		//System.out.println(auth);
	}

	//@Test(dataProvider = "credentials")
	public void loginAuthentication1(String json) {
		RequestSpecification requestSpecification = RestAssured.given().body(json);
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.post("https://reqres.in/api/login");
		System.out.println(response.body().asString());
	}
}
