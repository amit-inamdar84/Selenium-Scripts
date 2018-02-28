package com.amit.web.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amit.web.pageObjects.BullCartel;
import com.amit.web.pageObjects.LoginPage;
import com.amit.web.testBase.TestBase;

public class TestToFetchBullCartelData extends TestBase {
	LoginPage loginpage;
	BullCartel bullcartel;

	@DataProvider(name = "BullCartelData")
	public String[][] getTestData() {
		String[][] testRecords = getData("TestData.xlsx", "BullCartelData");
		return testRecords;
	}

	@BeforeClass
	public void setUp() throws IOException {
		init();
		loginpage = new LoginPage(driver);
		bullcartel = new BullCartel(driver);
	}

	@Test(dataProvider = "BullCartelData")
	public void mutipleLogin(String userName, String password, String runMode, String text)
			throws InterruptedException {
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
		Thread.sleep(3000);
		bullcartel.clickBullCartelLink();
		Thread.sleep(3000);
		
		//Static method call
		Assert.assertEquals(BullCartel.getBullCartelText(), text);
		bullcartel.clickCMPRs();
		bullcartel.clickCMPRs();
	}

}
