package com.amit.testscripts;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.amit.request.pojoclass.CreateProducts;
import com.amit.response.pojoclass.CreateProductResp;
import com.amit.response.pojoclass.GetAllProducts;
import com.amit.utils.EndpointURL;
import com.amit.utils.URL;
import com.amit.webservices.methods.TestBase;
import com.amit.webservices.methods.Webservices;
import com.google.gson.Gson;

import io.restassured.response.Response;

public class BestBuyProducts extends TestBase{
	//Initial documentation for getting started: https://github.com/BestBuy/api-playground
	//Go to the directory where node JS is installed and run the command: npm start
	
	// Reading json fields from excel to populate request pojo classes
	@DataProvider(name = "supply payload")
	public Object[][] testData() {
		Object[][] result = getData("TestData.xlsx", "CreateProduct");
		return result;
	}
	
	@Test
	public void getAllProducts(){
		Gson gson = getGsonObject();
		//Online pojo class created inner classes as List. I changed the classes as array of class type.
		//For list type of pojo class, we can access the data via getter method using getAllProducts.getData().get(0).getId());
		GetAllProducts getAllProducts;
		String url = URL.fixURL1+EndpointURL.PRODUCTS.getResourcePath();
		System.out.println(url);
		Response response = Webservices.Get(url);
		if(response.getStatusCode()==200){
			getAllProducts = gson.fromJson(response.getBody().asString(), GetAllProducts.class);
			System.out.println(response.getBody().asString());
			Assert.assertEquals(getAllProducts.getTotal(), new Integer(51958));
			Assert.assertEquals(getAllProducts.getLimit(), new Integer(10));
			Assert.assertEquals(getAllProducts.getSkip(), new Integer(0));
			
			System.out.println("Pojo values: "+getAllProducts.getData()[0].getId());
			System.out.println("Pojo values: "+getAllProducts.getData()[0].getCategories()[0].getId());
		}
		else{
			Assert.assertEquals(response.statusCode() == 200, true);
		}
	}
	
	//Getting data provider mismatch error. Need to check.
	@Test(dataProvider = "supply payload", description = "POST API to create a new best buy product")
	public void createProduct(String name, String type, Integer price, Integer shipping, String upc, String description, String manufacturer, String model, String url, String image){
		Gson gson = getGsonObject();
		CreateProducts createProducts = new CreateProducts();
		createProducts.setName(name);
		createProducts.setType(type);
		createProducts.setPrice(price);
		createProducts.setShipping(shipping);
		createProducts.setUpc(upc);
		createProducts.setDescription(description);
		createProducts.setManufacturer(manufacturer);
		createProducts.setModel(model);
		createProducts.setUrl(url);
		createProducts.setImage(image);
		JSONObject jsonObject = new JSONObject(createProducts);
		String url1 = URL.fixURL1+EndpointURL.PRODUCTS.getResourcePath();
		Response response = Webservices.Post(url1, jsonObject.toString());
		if (response.statusCode() == 201) {
			CreateProductResp createProductResp = gson.fromJson(response.asString(),
					CreateProductResp.class);
			Assert.assertEquals(createProductResp.getId(), new Integer(9999679));
			//Assert.assertEquals(createPostsResponsePojo.getTitle(), createPosts.getTitle());
			//Assert.assertEquals(createPostsResponsePojo.getBody(), createPosts.getBody());
		} else {// If response code is not correct fail the test case.
			Assert.assertEquals(response.statusCode() == 201, true);
		}
		
	}

}
