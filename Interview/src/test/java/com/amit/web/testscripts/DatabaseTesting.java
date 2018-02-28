package com.amit.web.testscripts;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amit.web.databaseConnections.DatabaseMySQL;
import com.amit.web.testBase.TestBase;

public class DatabaseTesting extends TestBase{
	DatabaseMySQL db;
	
	@DataProvider(name = "DBTesting")
	public String[][] getTestData() {
		String[][] testRecords = getData("TestData.xlsx", "DBTesting");
		return testRecords;
	}
	
	
	@BeforeClass
	public void setUp(){
		db = new DatabaseMySQL();
	}
	
	@Test (dataProvider = "DBTesting")
	public void selectDBdata(String selectQuery) throws ClassNotFoundException, SQLException{
		//String textData = driver.findElement(By.xpath("")).getText();
		//String selectQuery = "select * from Orders;";
		ResultSet data = db.getData(selectQuery);
		//System.out.println(data);
		while(data.next()){
			System.out.println(data.getString(1)+" "+data.getString(2)+" "+data.getString(3)+" "+data.getString(4));
		}
		/*
		if(textData.contains(data.getString(1))){
			
		}
		*/
	}
	
/*	@Test
	public void insertDBdata() throws ClassNotFoundException, SQLException{
		String query = "insert into registration values('2','bhnau12','testing123')";
		db.insertData(query);	
	}
	
	@Test
	public void updateDBdata() throws ClassNotFoundException, SQLException{
		String query = "update registration set name='56777' where profession='testing123'";
		db.updateData(query);
		
	}*/

}
