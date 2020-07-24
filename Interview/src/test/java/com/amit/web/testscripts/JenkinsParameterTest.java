package com.amit.web.testscripts;

import org.apache.log4j.Logger;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amit.web.helper.assertion.AssertionHelper;
import com.amit.web.helper.browserConfiguration.config.ObjectReader;
import com.amit.web.helper.logger.LoggerHelper;
import com.amit.web.pageObjects.HomePage;
import com.amit.web.pageObjects.LoginPage;
import com.amit.web.testBase.TestBase;

public class JenkinsParameterTest extends TestBase{

	private final Logger log = LoggerHelper.getLogger(JenkinsParameterTest.class);
	LoginPage loginpage;
	HomePage homePage;

	@DataProvider(name = "SingleLogin")
	public String[][] getTestData() {
		String[][] testRecords = getData("TestData.xlsx", "SingleLogin");
		return testRecords;
	}

	@Test(dataProvider = "SingleLogin")
	public void testParameters(String userName, String password, String runMode) {
		if (runMode.equalsIgnoreCase("n")) {
			throw new SkipException("Skipped this data");
		}
		getApplicationUrl(ObjectReader.reader.getUrl());
		loginpage = new LoginPage(driver);
		loginpage.verifyLandingPageText();
		loginpage.clickLoginLink();
		loginpage.verifyInvestorLoginText();
		loginpage.typeEmail(userName);
		loginpage.typePassword(password);
		loginpage.clickLoginButton();
		System.out.println("Printing implicit wait value: ");
		log.info(System.getProperty("implicitWait"));
		homePage = new HomePage(driver);
		boolean status = homePage.verifywatchListUpdatesText();
		AssertionHelper.updateTestStatus(status);
		homePage.clickLogoutButton();
		loginpage.verifyLandingPageText();
		loginpage.clickAboutUsLink();
		loginpage.verifyAboutUsText();
	}

	/*
	 * @Test (groups={"Sanity"}) public void test1() {
	 * 
	 * }
	 * 
	 * @Test (groups={"Sanity","regression"}) public void test2() {
	 * 
	 * }
	 * 
	 * @Test (groups={"regression"}) public void test3() {
	 * 
	 * }
	 */



}
