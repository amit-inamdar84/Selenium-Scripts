package notes;
//Can use this file for practicing the flow of api requests without framework.
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amit.response.pojoclass.GetTodos;
import com.amit.response.pojoclass.GetUserDetails;
import com.amit.utils.EndpointURL;
import com.amit.utils.URL;
import com.amit.webservices.methods.Webservices;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class InterviewPractice {

	@Test
	public void get() {
		// GET API request
		// Create instance of GsonBuilder and store it in variable of Gson class
		Gson gson = new GsonBuilder().create();
		// Create reference of pojo class of array type as json data is in the
		// form of array
		GetTodos[] getTodos;
		String url = "https://jsonplaceholder.typicode.com/todos";
		// Invoke static method given() from RestAssured class which will start
		// building the request part
		// Store in a variable of type RequestSpecification which is a
		// interface.
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		// RequestSpecification interface extends RequestSenderOptions
		// interface. So call its unimplemented get method on reference of
		// requestSpecification and pass url.
		// Store response in variable of interface type Response.
		Response response = requestSpecification.get(url);
		if (response.getStatusCode() == 200) {
			// This method deserializes(convert byte stream to actual Java
			// object in memory) the specified Json into an object of the
			// specified class. Basically initializes pojo class members.
			// This method .fromJson from Gson class takes 2 arguments - json
			// data and class.
			getTodos = gson.fromJson(response.getBody().asString(), GetTodos[].class);
			// Actual result can be accessed from response pojo class -
			// getTodos[0].getUserId();
			// Expected result can be taken from DB.
			Assert.assertEquals("Actual result", "Expected result");
		}
		
		else {//Fail the test case if response is not as expected.
			Assert.assertEquals(response.getStatusCode() == 200, true);
		}
	}

	@Test
	public void post(String stringJSON) {
		// Post API Request
		Gson gson = new GsonBuilder().create();
		GetTodos getTodos;
		String url = "https://jsonplaceholder.typicode.com/todos";
		//Invoke static method given() from RestAssured class which will start
		// building the request part. RestAssured.given() return type is RequestSpecification. So call .body method of RequestSpecification
		//to supply json payload.
		RequestSpecification requestSpecification = RestAssured.given().body(stringJSON);
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.post(url);
		if (response.getStatusCode() == 201) {
			getTodos = gson.fromJson(response.asString(), GetTodos.class);
			// Actual result can be accessed from response pojo class -
			// getTodos.getUserId();
			// Expected result can be taken from DB.
			Assert.assertEquals("Actual result", "Expected result");
		}

		else {
			Assert.assertEquals(response.getStatusCode() == 201, true);
		}
	}
	
	@Test
	public void put(String stringJSON){
		Gson gson = new GsonBuilder().create();
		GetUserDetails userDetails;
		String url = "https://jsonplaceholder.typicode.com/todos";
		RequestSpecification requestSpecification = RestAssured.given().body(stringJSON);
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.put(url);
		if(response.getStatusCode() == 200){
			System.out.println("Printing response: " + response.asString());
			userDetails = gson.fromJson(response.asString(), GetUserDetails.class);
			Assert.assertEquals("Actual result", "Expected result");
		}
		
		else{//If response code is not correct fail the test case.
			Assert.assertEquals(response.getStatusCode() == 200, true);
		}
	}
	
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
