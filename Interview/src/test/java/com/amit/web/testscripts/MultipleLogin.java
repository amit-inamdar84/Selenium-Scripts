package com.amit.web.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amit.web.pageObjects.LoginPage;
import com.amit.web.testBase.TestBase;

public class MultipleLogin extends TestBase {
	LoginPage loginpage;

	@DataProvider(name = "LoginTestData")
	public String[][] getTestData() {
		String[][] testRecords = getData("TestData.xlsx", "LoginTestData");
		return testRecords;
	}

	@BeforeClass
	public void setUp() throws IOException {
		init();
		loginpage = new LoginPage(driver);
	}

	@Test(dataProvider = "LoginTestData")
	public void mutipleLogin(String userName, String password, String runMode) {
		if (runMode.equalsIgnoreCase("n")) {
			throw new SkipException("Skipped this data");
		}

		// Assert.assertEquals(loginpage.getWelcomeText(), "Welcome to
		// Screener.in");
		loginpage.clickLoginLink();
		loginpage.clickLoginHere();
		loginpage.typeUserName(userName);
		loginpage.typePassword(password);
		loginpage.clickLoginButton();
		loginpage.verifyNewsFeedText();
	}
}
