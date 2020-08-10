package com.amit.testscripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amit.response.pojoclass.GetUserDetails;
import com.amit.utils.EndpointURL;
import com.amit.utils.URL;
import com.amit.webservices.methods.Webservices;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.response.Response;

public class TC002 {

	@DataProvider(name = "userDetails")
	public Object[][] userDetails() {
		Object[][] result = new Object[1][5];
		// \" escape sequence indicates a string in Json file. For declaring in
		// multiple lines use + operator.
		result[0][0] = "{\"id\": 11,\"name\": \"Leanne Graham\",\"username\": \"Bret\",\"email\": \"Sincere@april.biz\",\"address\": {\"street\": \"Kulas Light\",\"suite\": \"Apt. 556\",\"city\": \"Gwenborough\",\"zipcode\": \"92998-3874\",\"geo\": {\"lat\": -37.3159,\"lng\": 81.1496}},\"phone\": \"1-770-736-8031 x56442\",\"website\": \"hildegard.org\",\"company\": {\"name\": \"Romaguera-Crona\",\"catchPhrase\": \"Multi-layered client-server neural-net\",\"bs\": \"harness real-time e-markets\"}}";
		result[0][1] = 11;
		result[0][2] = "92998-3874";
		result[0][3] = "-37.3159";
		result[0][4] = "81.1496";

		return result;
	}
	
	@DataProvider(name = "updateUserDetails")
	public Object[][] updateUserDetails() {
		Object[][] result = new Object[1][4];
		result[0][0] = "{\"id\": 1,\"name\": \"Amit Inamdar\",\"username\": \"Bret\",\"email\": \"amit.inamdar84@gmail.com\",\"address\": {\"street\": \"Kulas Light\",\"suite\": \"Apt. 556\",\"city\": \"Gwenborough\",\"zipcode\": \"92998-3874\",\"geo\": {\"lat\": -37.3159,\"lng\": 81.1496}},\"phone\": \"1-770-736-8031 x56442\",\"website\": \"hildegard.org\",\"company\": {\"name\": \"Romaguera-Crona\",\"catchPhrase\": \"Multi-layered client-server neural-net\",\"bs\": \"harness real-time e-markets\"}}";
		result[0][1] = 1;
		result[0][2] = "Amit Inamdar";
		result[0][3] = "amit.inamdar84@gmail.com";

		return result;
	}

	@Test(dataProvider = "userDetails", description = "Post API request with nested JSON data")
	public void addUsers(String JSON, Integer id, String zipcode, String latitude, String longitude) {
		Gson gson = new GsonBuilder().create();
		// Data provider provides just one json value set per iteration. So no
		// need to declare array.
		GetUserDetails userDetails;
		String url = URL.fixURL + EndpointURL.ADD_USERS.getResourcePath();
		System.out.println(url);
		Response response = Webservices.Post(url, JSON);
		if (response.getStatusCode() == 201) {
			System.out.println("Printing response: " + response.asString());
			userDetails = gson.fromJson(response.asString(), GetUserDetails.class);

			Assert.assertEquals(userDetails.getId(), id);
			Assert.assertEquals(userDetails.getAddress().getZipcode(), zipcode);
			Assert.assertEquals(userDetails.getAddress().getGeo().getLat(), latitude);
			Assert.assertEquals(userDetails.getAddress().getGeo().getLng(), longitude);
		}
		else{
			Assert.assertEquals(response.getStatusCode() == 201, true);
		}

	}
	
	@Test(description = "Update a resource using PUT API request",dataProvider = "updateUserDetails")
	public void updateUserWithPut(String JSON, Integer id, String name, String email){
		Gson gson = new GsonBuilder().create();
		GetUserDetails userDetails;
		String url = URL.fixURL + EndpointURL.ADD_USERS.getResourcePath(id.toString());
		System.out.println(url);
		Response response = Webservices.Put(url,JSON);
		if(response.getStatusCode() == 200){
			System.out.println("Printing response: " + response.asString());
			userDetails = gson.fromJson(response.asString(), GetUserDetails.class);
			Assert.assertEquals(userDetails.getId(), id);
			Assert.assertEquals(userDetails.getName(), name);
			Assert.assertEquals(userDetails.getEmail(), email);
		}
		
		else{//If response code is not correct fail the test case.
			Assert.assertEquals(response.getStatusCode() == 200, true);
		}
	}
	
	//@Test(description = "Update a resource using PATCH API request")
	public void updateUserWithPatch(){
		
	}

}
