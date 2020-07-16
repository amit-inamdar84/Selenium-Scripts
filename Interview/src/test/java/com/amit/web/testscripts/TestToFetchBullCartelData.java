package com.amit.web.testscripts;

import java.util.ArrayList;

import org.apache.log4j.Logger;
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

public class TestToFetchBullCartelData extends TestBase {
	private final Logger log = LoggerHelper.getLogger(TestToFetchBullCartelData.class);
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
	public void mutipleLogin(String userName, String password, String runMode) throws InterruptedException {
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
		
		
		ArrayList<Double> unsorted = bullcartel.readUnSortedCMPList();
		log.info("Final unsorted list: "+unsorted);
		ArrayList<Double> desc = bullcartel.sortDescCMPList(unsorted);
		ArrayList<Double> asc = bullcartel.sortAscCMPList(unsorted);
		bullcartel.clickCMPRs();
		Thread.sleep(2000);
		ArrayList<Double> manualDescSort = bullcartel.readUnSortedCMPList();
		log.info("List after descending order manual sort: "+manualDescSort);
		bullcartel.clickCMPRs();
		ArrayList<Double> manualAscSort = bullcartel.readUnSortedCMPList();
		log.info("List after ascending order manual sort: "+manualAscSort);
		//bullcartel.compareCMPList(desc, manualDescSort);
		bullcartel.compareCMPList(asc, manualAscSort);
	}

}
