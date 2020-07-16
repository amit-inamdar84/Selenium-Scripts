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

public class HomePage extends TestBase{
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(LoginPage.class);
	
	@FindBy(xpath = "//*[@id='content-area']/div/h1")
	WebElement watchListUpdatesText;

	public boolean verifywatchListUpdatesText() {
		return new VerificationHelper(driver).isDisplayed(watchListUpdatesText);
	}

	@FindBy(xpath = "//button[@type='submit']/i")
	WebElement logoutButton;

	public void clickLogoutButton() {
		log.info("Logging out");
		logExtentReport("Logging out");
		logoutButton.click();
	}
	
	@FindBy(xpath="//*[@id='top-nav-menu']/a[3]")
	WebElement screensMenuItem;
	
	public ScreensPage clickScreensMenu(){
		screensMenuItem.click();
		return new ScreensPage(driver);
	}

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		WaitHelper waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(watchListUpdatesText, ObjectReader.reader.getExplicitWait());
		new TestBase().getNavigationScreen(driver);
		TestBase.logExtentReport("Home Page Object Created");
	}

}