package com.amit.web.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amit.web.helper.assertion.VerificationHelper;
import com.amit.web.helper.browserConfiguration.config.ObjectReader;
import com.amit.web.helper.logger.LoggerHelper;
import com.amit.web.helper.wait.WaitHelper;
import com.amit.web.testBase.TestBase;

public class ScreensPage {
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(LoginPage.class);
	
	@FindBy(xpath = "//h1[contains(text(),'Stock screens')]")
	WebElement screensPageHeader;

	public boolean verifyScreensPageHeader() {
		return new VerificationHelper(driver).isDisplayed(screensPageHeader);
	}
	
	@FindBy(xpath = "//div[contains(text(),'The Bull Cartel')]")
	WebElement theBullCartel;

	public BullCartel clickBullCartelLink() {
		theBullCartel.click();
		return new BullCartel(driver);
	}
	
	public ScreensPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		WaitHelper waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(screensPageHeader, ObjectReader.reader.getExplicitWait());
		new TestBase().getNavigationScreen(driver);
		TestBase.logExtentReport("Screens Page Object Created");
	}

}
