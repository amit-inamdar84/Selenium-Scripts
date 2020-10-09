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

public class LoginPage extends TestBase {
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(LoginPage.class);

	/*
	 * @FindBy(xpath = "//div[@class='container content']/div/div/h2")
	 * WebElement verifyWelcomeText;
	 * 
	 * public String getWelcomeText() { return verifyWelcomeText.getText(); }
	 */

	@FindBy(xpath = "//p[@class='bigger']")
	WebElement landingPageText;

	public boolean verifyLandingPageText() {
		return new VerificationHelper(driver).isDisplayed(landingPageText);
	}

	@FindBy(xpath = "//a[@class='button account']")
	WebElement loginLink;

	public void clickLoginLink() {
		log.info("Clicked login link");
		logExtentReport("Clicked login link");
		loginLink.click();
	}

	@FindBy(xpath = "//h1[contains(text(),'Welcome back!')]")
	WebElement investorLoginText;

	public boolean verifyInvestorLoginText() {
		return new VerificationHelper(driver).isDisplayed(investorLoginText);
	}

	@FindBy(id = "id_username")
	WebElement email;

	public void typeEmail(String email) {
		log.info("entering email address...." + email);
		logExtentReport("entering email address...." + email);
		this.email.sendKeys(email);
	}

	@FindBy(id = "id_password")
	WebElement passsword;

	public void typePassword(String password) {
		log.info("entering password...." + password);
		logExtentReport("entering password...." + password);
		this.passsword.sendKeys(password);
	}

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;

	public HomePage clickLoginButton() {
		log.info("clicking on login button...");
		logExtentReport("clicking on login button...");
		loginButton.click();
		return new HomePage(driver);
	}

	@FindBy(xpath = "//a[contains(text(),'About us')]")
	WebElement aboutUsLink;

	public void clickAboutUsLink() {
		aboutUsLink.click();
	}

	@FindBy(xpath = "//h1[@id='about-us']")
	WebElement aboutUsText;

	public boolean verifyAboutUsText() {
		return new VerificationHelper(driver).isDisplayed(aboutUsText);
	}
	
	//This method helps us to click on any link when we pass the web element variable.
	//This is useful when there are too many links to click under a menu. Write xpath for all links but have one single click method.
	public void clickOnMenu(WebElement element){
		element.click();
	}
	
	@FindBy(xpath = "//*[@id='top-nav-search']/div/input")
	WebElement companySearchBox;
	
	public void enterTextInCompanySearch(){
		companySearchBox.sendKeys("Avanti");
	}
	
	@FindBy(xpath = "//*[@id='top-nav-search']/div/ul/li")
	WebElement autoSuggestionDropDown;
	
	public void waitToDisplayAutoSuggestDD(){
		new WaitHelper(driver).waitForElement(autoSuggestionDropDown, ObjectReader.reader.getExplicitWait());
	}
	
	public void clickAutoSuggestDropDown(){
		clickOnMenu(autoSuggestionDropDown);
	}
	
	@FindBy(xpath = "//*[@id='company-info']/h1")
	WebElement searchResultText;

	public boolean verifySearchResultText() {
		return new VerificationHelper(driver).isDisplayed(searchResultText);
	}

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		WaitHelper waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(loginLink, ObjectReader.reader.getExplicitWait());
		new TestBase().getNavigationScreen(driver);
		TestBase.logExtentReport("Login Page Object Created");
	}

}
