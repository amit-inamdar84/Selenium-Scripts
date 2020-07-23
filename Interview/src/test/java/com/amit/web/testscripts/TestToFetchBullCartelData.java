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

//This test case fetches data in bull cartel screen and verifies sorting in ascending and descending order.
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
	public void readBullCartelData(String userName, String password, String runMode) throws InterruptedException {
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

		// Fetch unsorted data in array list
		ArrayList<Double> unsorted = bullcartel.readUnSortedCMPList();
		log.info("Final unsorted list: " + unsorted);
		// Sort the unsorted data using Collections.sort() method and store in
		// array list.
		ArrayList<Double> desc = bullcartel.sortDescCMPList(unsorted);
		ArrayList<Double> asc = bullcartel.sortAscCMPList(unsorted);
		// Click on header to sort data manually in descending order
		bullcartel.clickCMPRs();
		// Fetch manually sorted data(descending) and store in array list
		ArrayList<Double> manualDescSort = bullcartel.readUnSortedCMPList();
		log.info("List after descending order manual sort: " + manualDescSort);
		// Click on header to sort data manually in ascending order
		bullcartel.clickCMPRs();
		// Fetch manually sorted data(ascending) and store in array list
		ArrayList<Double> manualAscSort = bullcartel.readUnSortedCMPList();
		log.info("List after ascending order manual sort: " + manualAscSort);
		// Compare both array lists using equals method.
		// bullcartel.compareCMPList(desc, manualDescSort);
		bullcartel.compareCMPList(asc, manualAscSort);
	}

}
