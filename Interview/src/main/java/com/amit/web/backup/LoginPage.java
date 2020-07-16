package com.amit.web.backup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amit.web.testBase.TestBase;

public class LoginPage extends TestBase {
	WebDriver driver;

	@FindBy(xpath = "//div[@class='container content']/div/div/h2")
	WebElement verifyWelcomeText;

	public String getWelcomeText() {
		return verifyWelcomeText.getText();
	}

	@FindBy(xpath = "//div[@class='container']/div[2]/ul[2]/li/a")
	WebElement loginLink;

	public void clickLoginLink() {
		loginLink.click();
	}

	@FindBy(linkText = "Login here")
	WebElement loginHereLink;

	public void clickLoginHere() {
		loginHereLink.click();
	}

	@FindBy(id = "id_username")
	WebElement userName;

	public void typeUserName(String username) {
		this.userName.sendKeys(username);
	}

	@FindBy(id = "id_password")
	WebElement passsword;

	public void typePassword(String password) {
		this.passsword.sendKeys(password);
	}

	@FindBy(xpath = "//body[@id='top']/div[1]/div/form/fieldset/div[3]/button")
	WebElement loginButton;

	public void clickLoginButton() {
		loginButton.click();
	}

	@FindBy(xpath = "//div[@id='content']/div/div/div/div[1]/h2")
	WebElement newsFeedText;

	public String verifyNewsFeedText() {
		return newsFeedText.getText();
	}

	@FindBy(xpath = "//div[@id='content']/div/nav/div/div[2]/ul[2]/li[1]/a/i")
	WebElement logoutButton;

	public void clickLogoutButton() {
		logoutButton.click();
	}
	
	@FindBy(xpath = "//a[contains(text(),'About Us')]")
	WebElement aboutUsLink;

	public void clickAboutUsLink() {
		aboutUsLink.click();
	}
	
	@FindBy(xpath = "//h1[@id='about-us']")
	WebElement aboutUsText;

	public String readAboutUsText() {
		return aboutUsText.getText();
	}

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
/*	public void getImplicitWait() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}*/

}
