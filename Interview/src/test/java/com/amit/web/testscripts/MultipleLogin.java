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

public class MultipleLogin extends TestBase {
	LoginPage loginpage;
	HomePage homePage;
	private final Logger log = LoggerHelper.getLogger(LoginPage.class);

	@DataProvider(name = "LoginTestData")
	public String[][] getTestData() {
		String[][] testRecords = getData("TestData.xlsx", "LoginTestData");
		return testRecords;
	}

	@Test(dataProvider = "LoginTestData")
	public void mutipleLogin(String userName, String password, String runMode) {
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
		homePage = new HomePage(driver);
		boolean status = homePage.verifywatchListUpdatesText();
		AssertionHelper.updateTestStatus(status);
		homePage.mouseOverOnNameDropDown();
		homePage.clickLogoutButton();
	}
}
