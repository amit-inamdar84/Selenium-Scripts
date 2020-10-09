package com.amit.webservices.methods;

import com.amit.utils.ExcelReader;

public class TestBase {
	public Object[][] getData(String excelName, String sheetName) {
		String path = System.getProperty("user.dir")+ "/"+excelName;
		System.out.println(path);
		ExcelReader excel = new ExcelReader(path);
		Object[][] data = excel.getDataFromSheet(sheetName, excelName);
		return data;
	}

}
