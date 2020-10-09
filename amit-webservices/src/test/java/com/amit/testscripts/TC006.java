package com.amit.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.amit.response.pojoclass.GetUserDetails;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

//Draft test case. Deleted resource should be accessed using GET call and confirmed. As we cannot really delete a resource on this server need to see
//how we can verify using Assert.
public class TC006 {
	@Test
	public void delete(){
		Gson gson = new GsonBuilder().create();
		GetUserDetails userDetails;
		String url = "https://jsonplaceholder.typicode.com/todos/1";
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.delete(url);
		if(response.getStatusCode() == 200){
			System.out.println("Printing response: " + response.asString());
			userDetails = gson.fromJson(response.asString(), GetUserDetails.class);
			Assert.assertEquals("Actual result", "Expected result");
		}
		
		else{//If response code is not correct fail the test case.
			Assert.assertEquals(response.getStatusCode() == 200, true);
		}
	}

}
