package com.amit.web.pageObjects.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amit.web.helper.assertion.AssertionHelper;
import com.amit.web.helper.assertion.VerificationHelper;
import com.amit.web.helper.wait.WaitHelper;
import com.amit.web.testBase.TestBase;

public class Header extends TestBase {
	private WebDriver driver;
	VerificationHelper verificationHelper;
	WaitHelper waitHelper;

	@FindBy(css = "img[src='http://automationpractice.com/modules/blockbanner/img/sale70.png']")
	WebElement headerImage;

	public void verifyDisplayOf70PercentSaleImage() {
		VerificationHelper verificationHelper = new VerificationHelper(driver);
		verificationHelper.isDisplayed(headerImage);
	}
	
	@FindBy(xpath = "//span[@class='shop-phone']")
	WebElement callUsNowText;
	
	@FindBy(xpath = "//strong[contains(text(),'0123-456-789')]")
	WebElement callUsNowNumberText;
	
	public void verifyCallUsNowText(){
		String s1 = callUsNowText.getText()+callUsNowNumberText.getText();
		String s2 = "Call us now: 0123-456-789";
		AssertionHelper.verifyText(s1, s2);
	}
	
	@FindBy(xpath = "//a[@title='Contact Us']")
	WebElement contactUsLink;
	
	public void clickContactUsLink(){
		contactUsLink.click();
		String s1 = driver.getCurrentUrl();
		String s2 = "http://automationpractice.com/index.php?controller=contact";
		AssertionHelper.verifyText(s1, s2);
	}
	
	@FindBy(xpath = "//a[@class='login']")
	WebElement signInLink;
	
	public void clickSignInLink(){
		signInLink.click();
		String s1 = driver.getCurrentUrl();
		String s2 = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
		AssertionHelper.verifyText(s1, s2);
	}
	
	@FindBy(css = "img[alt='My Store']")
	WebElement yourLogoImage;
	
	public void clickYourLogo(){
		yourLogoImage.click();
		String s1 = driver.getCurrentUrl();
		String s2 = "http://automationpractice.com/index.php";
		AssertionHelper.verifyText(s1, s2);
	}
	
	@FindBy(id = "search_query_top")
	WebElement searchTextBox;
	
	@FindBy(css = "div[class = 'ac_results']>:nth-child(1)>:nth-child(1)")
	WebElement firstSearchSuggestion;
	
	@FindBy(tagName = "h1")
	WebElement searchResultText;
	
	@FindBy(css = "button[name='submit_search']")
	WebElement searchLensButton;
	
	
	
	public void searchText(String searchText, String SearchTextResult, String searchText1){
		searchTextBox.sendKeys(searchText);
		WaitHelper waitHelper = new WaitHelper(driver);
		waitHelper.WaitForElementVisibleWithPollingTime(firstSearchSuggestion, 20, 5);
		firstSearchSuggestion.click();
		String s1 = searchResultText.getText();
		AssertionHelper.verifyText(s1, SearchTextResult);
		searchTextBox.clear();
		searchTextBox.sendKeys(searchText1);
		searchLensButton.click();
	}
	

	public Header(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
