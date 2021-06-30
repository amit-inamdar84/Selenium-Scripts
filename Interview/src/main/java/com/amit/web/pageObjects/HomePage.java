package com.amit.web.pageObjects;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amit.web.helper.action.ActionHelper;
import com.amit.web.helper.assertion.VerificationHelper;
import com.amit.web.helper.browserConfiguration.config.ObjectReader;
import com.amit.web.helper.logger.LoggerHelper;
import com.amit.web.helper.wait.WaitHelper;
import com.amit.web.testBase.TestBase;

public class HomePage extends TestBase{
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(LoginPage.class);
	
	@FindBy(xpath = "//h1[contains(text(),'Watchlist updates')]")
	WebElement watchListUpdatesText;

	public boolean verifywatchListUpdatesText() {
		return new VerificationHelper(driver).isDisplayed(watchListUpdatesText);
	}
	
	@FindBy(xpath = "//i[@class='icon-down']")
	WebElement nameMenuDropDown;
	
	public void mouseOverOnNameDropDown(){
		new ActionHelper(driver).mouseHover(nameMenuDropDown);
	}

	@FindBy(xpath = "//button[@type='submit']/i")
	WebElement logoutButton;

	public void clickLogoutButton() {
		log.info("Logging out");
		logExtentReport("Logging out");
		logoutButton.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Screens')]")
	WebElement screensMenuItem;
	
	public ScreensPage clickScreensMenu(){
		screensMenuItem.click();
		log.info("Clicked on screens menu item");
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
