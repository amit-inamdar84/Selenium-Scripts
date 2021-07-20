package com.rest;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class ExtractResponse {
	@Test
	public void extract_response(){
		Response response = given().
		        baseUri("https://api.postman.com").
		        header("X-Api-Key", "PMAK-60de07fe8fb00c00420c921c-3f1db985cf81176141543b003c6ec9e61d").
		when().
		        get("/workspaces/").
		then().
		        assertThat().
		        statusCode(200).
		        extract().
		        response();//Returns the entire response as an object and stores in reference of Response interface.
		System.out.println("Response: "+response.asString());
	}



}
