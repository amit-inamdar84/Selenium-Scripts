package com.rest;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.helper.testdata.DataProviderClass;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

public class RequestSpec {
	RequestSpecification  requestSpecification;
	
	@BeforeClass()
	public void beforeClass() throws IOException{
		//Here creating reference of RequestSpecification means creating object of class that is implementing RequestSpecification interface
	    requestSpecification = given().//Instead of given(), we can use with()
				baseUri("https://api.postman.com").
		        header("X-Api-Key", "Provide API Key here");
	}

	@Test
	public void understanding_reqspec(){
		Response reponse = requestSpecification.get("/workspaces/").then().log().all().extract().response();
		Assert.assertEquals(reponse.statusCode(), 200);
	}
	
	@Test
	public void validate_resp_body(){
		Response reponse = requestSpecification.get("/workspaces/").then().log().all().extract().response();
		Assert.assertEquals(reponse.path("workspaces[0].name").toString(), equalTo("Test2"));
	}


}
