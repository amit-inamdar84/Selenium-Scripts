package com.amit.web.testscripts;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.amit.web.testBase.TestBase;

public class TestCode extends TestBase {
	@Test
	public void test() throws IOException {
		//DB Connection
				try {
					String driver = "com.mysql.cj.jdbc.Driver";
					String connection = "jdbc:mysql://localhost:3306/customers";
					String userName = "root";
					String password = "MySQL_3007";
					//A call to forName("X") causes the class named X to be initialized.
					//Also the JDBC driver gets registered
					Class.forName(driver);
					//Driver manager provides basic service for managing JDBC drivers. getConnection establishes connection to give DB URL.
					Connection con = DriverManager.getConnection(connection, userName, password);
					//On a connection session createStatement() method creates a statement object.
					Statement stmt = con.createStatement();
					//On that statement object we can send SQL statements to DB and executeQuery() method executes queries.
					//ResultSet is an interface. A ResultSet object maintains a cursor pointing to its current row of data. Initially the cursor is positioned
					//before the first row. The next method moves the cursor to the next row, and because it returns false when there are no more rows in the
					//ResultSet object,it can be used in a while loop to iterate through the result set. 
					ResultSet data = stmt.executeQuery("Select CustomerID,Country from Info;");
					while(data.next()){
						System.out.println(data.getString(1)+" "+data.getString(2));
					}
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
