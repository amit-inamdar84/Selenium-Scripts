package com.amit.web.testscripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.amit.web.helper.browserConfiguration.config.ObjectReader;
import com.amit.web.pageObjects.LoginPage;
import com.amit.web.testBase.TestBase;

public class TestToVerifyCompanySearchBox extends TestBase{
	private final Logger log = Logger.getLogger(TestToVerifyCompanySearchBox.class);
	LoginPage loginpage;
	
	@Test
	public void companySearch(){
		getApplicationUrl(ObjectReader.reader.getUrl());
		loginpage = new LoginPage(driver);
		loginpage.verifyLandingPageText();
		loginpage.enterTextInCompanySearch();
		loginpage.waitToDisplayAutoSuggestDD();
		loginpage.clickAutoSuggestDropDown();
		loginpage.verifySearchResultText();
		log.info("Test verified");
	}

}
