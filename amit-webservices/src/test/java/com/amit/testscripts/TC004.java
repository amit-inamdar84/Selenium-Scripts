package com.amit.testscripts;
//Automate scenarios in REST API automation video series of Bhanu.

//https://youtu.be/uzREiSzxEC8?list=PL5NG-eEzvTtiTfE8p2ZXfDkDKD2gSdx9e

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amit.request.pojoclass.CreatePosts;
import com.amit.request.pojoclass.UpdatePosts;
import com.amit.response.pojoclass.CreatePostsResponsePojo;
import com.amit.response.pojoclass.GetAllPosts;
import com.amit.response.pojoclass.UpdatePostsResponse;
import com.amit.utils.EndpointURL;
import com.amit.utils.URL;
import com.amit.webservices.methods.TestBase;
import com.amit.webservices.methods.Webservices;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC004 extends TestBase {

	@DataProvider(name = "supply payload") // Reading json fields from excel to
											// populate request pojo classes
	public Object[][] testData() {
		Object[][] result = getData("TestData.xlsx", "CreatePostRequest");
		return result;
	}

	@DataProvider(name = "updatePost")
	public Object[][] testData1() {
		Object[][] result = getData("TestData.xlsx", "UpdatePostRequest");
		return result;
	}

	//@Test(dataProvider = "supply payload", description = "POST API to create a new post")
	public void testCreatePosts(int userID, String title, String body) {
		// Creating reference of request pojo class to set the values
		CreatePosts createPosts = new CreatePosts();
		// List<JSONObject> list;//Array list not required as of now as we have
		// just
		// one single data.
		createPosts.setUserId(userID);
		// createPosts.setId(id);
		createPosts.setTitle(title);
		createPosts.setBody(body);
		// JSONObject converts pojo class to JSON objects
		JSONObject jsonObject = new JSONObject(createPosts);
		// list = new ArrayList<JSONObject>();
		// list.add(jsonObject);
		System.out.println("Printing request: " + jsonObject);
		String url = URL.fixURL + EndpointURL.CREATE_POSTS.getResourcePath();
		System.out.println(url);
		// requestSpecification.accept(ContentType.JSON);
		// Calling post function with arguments-url and string representation of
		// json object.
		Response response = Webservices.Post(url, jsonObject.toString());
		System.out.println("Status code: " + response.statusCode());
		System.out.println(response.asString());

		if (response.statusCode() == 201) {
			Gson gson = new GsonBuilder().create();
			CreatePostsResponsePojo createPostsResponsePojo = gson.fromJson(response.asString(),
					CreatePostsResponsePojo.class);
			Assert.assertEquals(createPostsResponsePojo.getUserId(), createPosts.getUserId());
			Assert.assertEquals(createPostsResponsePojo.getTitle(), createPosts.getTitle());
			Assert.assertEquals(createPostsResponsePojo.getBody(), createPosts.getBody());
		} else {// If response code is not correct fail the test case.
			Assert.assertEquals(response.statusCode() == 201, true);
		}
	}

	// @Test(description="Get API to get all posts")
	public void getAllPosts() {
		Gson gson = new Gson();// Another way to create object of Gson class.
		GetAllPosts[] getAllPosts;
		String url = URL.fixURL + EndpointURL.CREATE_POSTS.getResourcePath();
		Response response = Webservices.Get(url);
		System.out.println("Printing response: " + response.asString());
		if (response.statusCode() == 200) {
			getAllPosts = gson.fromJson(response.getBody().asString(), GetAllPosts[].class);
			for (int i = 1; i <= getAllPosts.length; i++) {// Run loop to print
															// unique ID's from
															// 1 to N where N is
															// no of posts.
				int x = getAllPosts[i - 1].getId();
				// System.out.println("Printing i: "+i+" Printing x: "+x);
				Assert.assertEquals(x, i);
			}
		} else {// If response code is not correct fail the test case.
			Assert.assertEquals(response.statusCode() == 200, true);
		}
	}

	@Test(dataProvider = "updatePost", description = "Update posts with PUT API request")
	public void updatePosts(Integer userID, Integer id, String title, String body) {
		// Converting json to pojo
		UpdatePosts updatePosts = new UpdatePosts();
		updatePosts.setUserId(userID);
		updatePosts.setId(id);
		updatePosts.setTitle(title);
		updatePosts.setBody(body);
		// Converting pojo to json
		JSONObject jsonobject = new JSONObject(updatePosts);
		System.out.println("Printing request: " + jsonobject);
		String url = URL.fixURL + EndpointURL.CREATE_POSTS.getResourcePath(id.toString());
		System.out.println(url);
		Response response = Webservices.Put(url, jsonobject.toString());
		System.out.println("Status code: " + response.statusCode());
		System.out.println(response.asString());

		if (response.statusCode() == 200) {
			Gson gson = new GsonBuilder().create();
			UpdatePostsResponse updatePostsResponse = gson.fromJson(response.asString(),UpdatePostsResponse.class);
			Assert.assertEquals(updatePostsResponse.getTitle(),updatePosts.getTitle());
			Assert.assertEquals(updatePostsResponse.getBody(),updatePosts.getBody());
		}
		
		else {// If response code is not correct fail the test case.
			Assert.assertEquals(response.statusCode() == 200, true);
		}
	}
}
