package com.amit.testscripts;

import java.util.ArrayList;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amit.request.pojoclass.CreatePosts;
import com.amit.response.pojoclass.CreatePostsResponsePojo;
import com.amit.response.pojoclass.GetAllPosts;
import com.amit.utils.EndpointURL;
import com.amit.utils.URL;
import com.amit.webservices.methods.TestBase;
import com.amit.webservices.methods.Webservices;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.response.Response;

//Practice test case to create multiple posts, store id's in a list, populate data provider and then supply to get call.
//Continued version of testCreatePosts() and getAllPosts() methods of TC004
public class TC005 extends TestBase {
	// Temp variable to store ID generated by post call and referred in getbyID
	// method.
	ArrayList<Integer> postID = new ArrayList<Integer>();

	// Reading json fields from excel to populate request pojo classes
	@DataProvider(name = "supply payload")
	public Object[][] testData() {
		Object[][] result = getData("TestData.xlsx", "CreatePostRequest");
		return result;
	}
	
	//This DP will fetch values from array list one by one and populate in object array.
	@DataProvider(name = "supply Post ID's")
	public Object[][] testData1() {
		Object[][] result = new Object[postID.size()][1];
		for(int i=0;i<result.length;i++){
				result[i][0] = postID.get(i);
		}
		return result;
	}

	@Test(dataProvider = "supply payload", description = "POST API to create a new post")
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
			//When new post is created its ID will be added to array list one by one.
			postID.add(createPostsResponsePojo.getId());
			// Below commented line will also work to get posts by ID but there
			// is a testng bug. So implemented another way
			// by initializing instance variable."cannot inject @test annotated
			// method [getPostsByID] with [class java.lang.integer]"
			// getPostsByID(postID);
		} else {// If response code is not correct fail the test case.
			Assert.assertEquals(response.statusCode() == 201, true);
		}
	}

	// Below method extracts the ID generated by testCreatePosts() method and
	// builds URL for GET call of newly created post.
	// Here assertion is supposed to fail as new post ID generated is fake. This
	// method is just for learning purpose
	@Test(description = "Get individual post by ID", dependsOnMethods = "testCreatePosts",dataProvider="supply Post ID's")
	public void getPostsByID(Integer postID) {
		Gson gson = new GsonBuilder().create();
		GetAllPosts getAllPosts;
		String url = URL.fixURL + EndpointURL.CREATE_POSTS.getResourcePath(postID.toString());
		System.out.println(url);
		Response response = Webservices.Get(url);
		System.out.println("Status code: " + response.statusCode());
		System.out.println("Printing response: " + response.asString());
		if (response.statusCode() == 200) {
			getAllPosts = gson.fromJson(response.asString(), GetAllPosts.class);
			Assert.assertEquals(getAllPosts.getId(), postID);
		} else {
			Assert.assertEquals(response.statusCode() == 200, true);
		}
	}

}
