package com.amit.testscripts;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amit.response.pojoclass.GetTodos;
import com.amit.utils.EndpointURL;
import com.amit.utils.URL;
import com.amit.webservices.methods.Webservices;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.response.Response;

public class TC001 {
	ArrayList<Integer> userId;
	ArrayList<Integer> id;
	ArrayList<String> title;
	ArrayList<Boolean> completed;
	
	@BeforeClass
	public void setUp(){
		userId = new ArrayList<Integer>();
		id = new ArrayList<Integer>();
		title = new ArrayList<String>();
		completed = new ArrayList<Boolean>();
	}
	
	@DataProvider(name = "getID")
	public Object[][] getID(){
		Object[][] result = new Object[id.size()][4];
		for(int i=0;i<result.length;i++){
			result[i][0] = userId.get(i);//0th row 1st column
			result[i][1] = id.get(i);
			result[i][2] = title.get(i);
			result[i][3] = completed.get(i);
		}
		return result;
	}
	
	@DataProvider(name = "postTodos")
	public Object[][] postTodos(){
		Object[][] result = new Object[2][5];
			result[0][0] = "{\"userId\": 11,\"id\": 201,\"title\": \"delectus auto\",\"completed\": false}";
			result[0][1] = 11;
			result[0][2] = 201;
			result[0][3] = "delectus auto";
			result[0][4] = false;
			
			result[1][0] = "{\"userId\": 11,\"id\": 202,\"title\": \"miniemus\",\"completed\": true}";
			result[1][1] = 11;
			result[1][2] = 202;
			result[1][3] = "miniemus";
			result[1][4] = true;
			
		return result;
	}
	
	//@Test(description = "Test to verify all todos",dependsOnMethods="addTodos")
	public void verifyTodos() {
		Gson gson = new GsonBuilder().create();// Create instance of GsonBuilder
		GetTodos[] getTodos;//Create reference of pojo class of array type as json data is in the form of array
		String url = URL.fixURL + EndpointURL.TODOS.getResourcePath();
		System.out.println(url);
		Response response = Webservices.Get(url);
		// System.out.println(response.getBody().asString());
		if (response.getStatusCode() == 200) {
			// This method deserializes(convert byte stream to actual Java
			// object in memory) the specified Json into an object of the
			// specified class
			// Basically initializes pojo class members.
			getTodos = gson.fromJson(response.getBody().asString(), GetTodos[].class);
			// Declare array for storing expected values.
			int[] userID = new int[200];
			// Declare array for storing actual values from pojo class.
			int[] x = new int[200];
			// As we have 200 user ID's using 200 elements memory
			for (int i = 0; i < userID.length;) {
				// Generating numbers to match the response. i.e. userid 1 20
				// times and so on.
				for (int j = 1; j <= 10; j++) {
					// Generate each userid 20 times and then increment.
					for (int k = 1; k <= 20; k++) {
						// Store each value in array[0],array[1] and so on.
						userID[i] = j;
						// Increment user id after printing 20 times.
						i++;
					}
				}
			}
			for (int i = 0; i < getTodos.length; i++) {
				// Traverse the array and get specific values from the array
				// using pojo class methods
				x[i] = getTodos[i].getUserId();
				//Preparing test data just for testing other test cases as huge data cannot be typed.
				userId.add(getTodos[i].getUserId());
				id.add(getTodos[i].getId());
				title.add(getTodos[i].getTitle());
				completed.add(getTodos[i].getCompleted());
			}
			// Compare actual value from webservice calls to predefined response
			// stored in DB or collections.
			Assert.assertEquals(x, userID);
		}
		else{
			Assert.assertEquals(response.getStatusCode() == 200, true);
		}
		System.out.println("----------------------------------");
	}

	//@Test(description = "Test to verify todos by ID",dataProvider = "getID")
	public void verifyTodosByID(Integer userID,Integer id,String title,Boolean completed) {
		Gson gson = new GsonBuilder().create();
		GetTodos getTodos;//This time reference is not an array because when fetching by ID we will get only 1 record per call.
		String url = URL.fixURL + EndpointURL.TODOS_BY_ID.getResourcePath(id.toString());
		//System.out.println(url);
		Response response = Webservices.Get(url);
		//System.out.println(response.getBody().asString());
		if(response.getStatusCode()==200){
			getTodos = gson.fromJson(response.getBody().asString(), GetTodos.class);
			Assert.assertEquals(getTodos.getUserId(),userID);
			Assert.assertEquals(getTodos.getTitle(),title);
			Assert.assertEquals(getTodos.getCompleted(),completed);
		}
		else{
			Assert.assertEquals(response.getStatusCode() == 200, true);
		}
	}
	
	@Test(description = "Add todos using post api call",dataProvider = "postTodos")
	public void addTodos(String JSON,Integer userID,Integer id, String title,Boolean completed){
		Gson gson = new GsonBuilder().create();
		//Data provider provides just one json value set per iteration. So no need to declare array.
		GetTodos getTodos;
		String url = URL.fixURL + EndpointURL.TODOS.getResourcePath();
		System.out.println(url);
		Response response = Webservices.Post(url, JSON);
		if(response.getStatusCode()==201){
			getTodos = gson.fromJson(response.asString(), GetTodos.class);
			Assert.assertEquals(getTodos.getUserId(), userID);
			//Below assertion will fail for 2nd iteration as there is no actual data created during 1st post call. Since this is fake API.
			//2nd post request also will post the same id as previous one.
			//Assert.assertEquals(getTodos.getId(), id);
			Assert.assertEquals(getTodos.getTitle(), title);
			Assert.assertEquals(getTodos.getCompleted(), completed);
			
			System.out.println("Printing response: "+response.asString());
		}
		
		else{
			Assert.assertEquals(response.getStatusCode() == 201, true);
		}
	}

}
