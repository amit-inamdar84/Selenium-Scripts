/*package com.amit.web.backup;

import java.io.IOException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amit.web.pageObjects.LoginPage;
import com.amit.web.testBase.TestBase;

public class Login extends TestBase{
	
	LoginPage loginpage;

	@DataProvider(name = "SingleLogin")
	public String[][] getTestData() {
		String[][] testRecords = getData("TestData.xlsx", "SingleLogin");
		return testRecords;
	}

	@BeforeClass
	public void setUp() throws IOException {
		init();
		loginpage = new LoginPage(driver);
	}

	@Test(dataProvider = "SingleLogin")
	public void testLogin(String userName, String password, String runMode) {
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
		loginpage.clickAboutUsLink();
		implicitWait(10);
		Assert.assertEquals(loginpage.readAboutUsText(), "About Us");
	}
	
	@Test (groups={"Sanity"})
	public void test1() {
		
	}
	
	@Test (groups={"Sanity","regression"})
	public void test2() {
		
	}
	
	@Test (groups={"regression"})
	public void test3() {
		
	}

}
*/