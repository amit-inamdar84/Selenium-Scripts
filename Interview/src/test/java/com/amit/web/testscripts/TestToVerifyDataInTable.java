package com.amit.web.testscripts;

import java.util.ArrayList;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
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
//Header row tr contains th for columns. But other rows having actual values contain tr for every row. Not sure how we can skip headers that come in between
//rows after every 15 records.
public class TestToVerifyDataInTable extends TestBase {

	private final Logger log = LoggerHelper.getLogger(TestToVerifyDataInTable.class);
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
	public void readDynamicTable(String userName, String password, String runMode) throws InterruptedException {
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

		// Reading web table data
		//For future reference
		//bullcartel.readTableData();
		//Alternate way
		bullcartel.readTableData1();
		System.out.println("--------------------------------------------------------------------");
		bullcartel.readTableData2();
	}

}
