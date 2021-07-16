package com.amit.web.automation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amit.web.helper.browserConfiguration.config.ObjectReader;
import com.amit.web.pageObjects.components.Header;
import com.amit.web.testBase.TestBase;

public class HomePage extends TestBase {
	Header header;
	
	@DataProvider(name = "HomePage")
	public String[][] getTestData() {
		String[][] testRecords = getData("TestData.xlsx", "HomePage");
		return testRecords;
	}

	@BeforeMethod
	public void getURL() {
		getApplicationUrl(ObjectReader.reader.getUrl1());
	}

	@Test(dataProvider = "HomePage")
	public void checkHeaderElementsDisplay(String SearchText, String SearchTextResult, String SearchText1) {
		header = new Header(driver);
		header.verifyDisplayOf70PercentSaleImage();
		header.verifyCallUsNowText();
		header.clickContactUsLink();
		header.clickSignInLink();
		header.clickYourLogo();
		header.searchText(SearchText, SearchTextResult, SearchText1);
	}

}
