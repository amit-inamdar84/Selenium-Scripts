package com.amit.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

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
			Assert.assertEquals(getAllProducts.getTotal(), new Integer(51957));
			Assert.assertEquals(getAllProducts.getLimit(), new Integer(10));
			Assert.assertEquals(getAllProducts.getSkip(), new Integer(0));
			
			System.out.println("Pojo values: "+getAllProducts.getData()[0].getId());
			System.out.println("Pojo values: "+getAllProducts.getData()[0].getCategories()[0].getId());
		}
		else{
			Assert.assertEquals(response.statusCode() == 200, true);
		}
	}

}
