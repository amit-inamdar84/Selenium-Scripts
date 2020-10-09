package com.amit.web.testscripts;

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
import com.amit.web.pageObjects.ScripNewTab;
import com.amit.web.testBase.TestBase;

public class SwitchingWindows extends TestBase{


	private final Logger log = LoggerHelper.getLogger(SwitchingWindows.class);
	LoginPage loginpage;
	BullCartel bullcartel;
	HomePage homePage;
	ScreensPage screensPage;
	ScripNewTab scripNewTab;

	@DataProvider(name = "BullCartelData")
	public String[][] getTestData() {
		String[][] testRecords = getData("TestData.xlsx", "SingleLogin");
		return testRecords;
	}

	@Test(dataProvider = "BullCartelData")
	public void switchToWindow(String userName, String password, String runMode) throws InterruptedException {
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

		//Switching to new tab upon clicking scrip name
		bullcartel.clickOnFirstScrip();
		//Storing parent window reference for further use.
		String mainWindowHandle = bullcartel.switchToScripWindow();
		scripNewTab = bullcartel.returnPageObject();
		status = scripNewTab.verifyNewPageText();
		AssertionHelper.updateTestStatus(status);
		//Switching back to parent window by passing parent window reference stored earlier.
		bullcartel.switchToParentWindow(mainWindowHandle);
		status = bullcartel.getBullCartelText();
		AssertionHelper.updateTestStatus(status);
		bullcartel.verifyBullCartelText();
	}

}
