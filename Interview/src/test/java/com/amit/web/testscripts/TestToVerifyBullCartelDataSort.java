package com.amit.web.testscripts;

import java.util.ArrayList;

import org.apache.logging.log4j.Logger;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amit.web.helper.assertion.AssertionHelper;
import com.amit.web.helper.browserConfiguration.config.ObjectReader;
import com.amit.web.helper.logger.LoggerHelper;
import com.amit.web.pageObjects.BullCartel;
import com.amit.web.pageObjects.HomePage;
import com.amit.web.pageObjects.LoginPage;
import com.amit.web.pageObjects.ScreensPage;
import com.amit.web.testBase.TestBase;
//Alternate way to verify data sorting. Sort the data manually and fetch all web elements and store in array list. Run a for loop on array
//and check if i<=i+1.
public class TestToVerifyBullCartelDataSort extends TestBase {
	private final Logger log = LoggerHelper.getLogger(TestToVerifyBullCartelDataSort.class);
	LoginPage loginpage;
	BullCartel bullcartel;
	HomePage homePage;
	ScreensPage screensPage;

	@DataProvider(name = "BullCartelData")
	public String[][] getTestData() {
		String[][] testRecords = getData("TestData.xlsx", "SingleLogin");
		return testRecords;
	}

	@Test(dataProvider = "BullCartelData")
	public void verifySort(String userName, String password, String runMode) throws InterruptedException {
		if (runMode.equalsIgnoreCase("n")) {
			throw new SkipException("Skipped this data");
		}
		getApplicationUrl(ObjectReader.reader.getUrl());
		loginpage = new LoginPage(driver);
		bullcartel = new BullCartel(driver);
		loginpage.verifyLandingPageText();
		loginpage.clickLoginLink();
		loginpage.verifyInvestorLoginText();
		loginpage.typeEmail(userName);
		loginpage.typePassword(password);
		loginpage.clickLoginButton();
		homePage = new HomePage(driver);
		boolean status = homePage.verifywatchListUpdatesText();
		AssertionHelper.updateTestStatus(status);
		screensPage = homePage.clickScreensMenu();
		screensPage.verifyScreensPageHeader();
		bullcartel = screensPage.clickBullCartelLink();
		bullcartel.getBullCartelText();
		
		//Sort the data in ascending order and store in array list
		bullcartel.clickCMPRs();
		bullcartel.clickCMPRs();
		ArrayList<Double> sorted = bullcartel.readUnSortedCMPList();
		log.info("Final sorted list: " + sorted);
		boolean status1 = bullcartel.traverseSortedArrayList(sorted);
		AssertionHelper.updateTestStatus(status1);
	}
}
