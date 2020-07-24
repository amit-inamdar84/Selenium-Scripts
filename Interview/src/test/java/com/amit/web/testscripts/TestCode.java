package com.amit.web.testscripts;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.amit.web.testBase.TestBase;

public class TestCode extends TestBase {
	@Test
	public void test() {
		List<WebElement> cmpList = driver
				.findElements(By.xpath("//table[@class='data-table text-nowrap striped']/tbody/child::*/td[3]"));
		ArrayList<String> arr = new ArrayList<String>();
		for (WebElement priceList : cmpList) {
			arr.add(priceList.getText());
		}

		Collections.sort(arr);
		System.out.println(arr);
	}
}
