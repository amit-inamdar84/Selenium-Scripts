package com.amit.webservices.methods;

import com.amit.utils.ExcelReader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestBase {
	public Object[][] getData(String excelName, String sheetName) {
		String path = System.getProperty("user.dir")+ "/"+excelName;
		System.out.println(path);
		ExcelReader excel = new ExcelReader(path);
		Object[][] data = excel.getDataFromSheet(sheetName, excelName);
		return data;
	}
	
	public Gson getGsonObject(){
		Gson gson = new GsonBuilder().create();
		return gson;
	}

}
