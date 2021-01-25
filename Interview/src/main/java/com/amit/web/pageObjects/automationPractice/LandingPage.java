package com.amit.web.pageObjects.automationPractice;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amit.web.helper.logger.LoggerHelper;

public class LandingPage {
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(LandingPage.class);

	@FindBy(className = "img-responsive")
	WebElement headerLink;
	
	@FindBy(xpath = "//span[@class='shop-phone']/text()[2]")
	WebElement callUsNowText;
	
	@FindBy(xpath = "//strong[contains(text(),'0123-456-789')]")
	WebElement callUsNowNumberText;
	
	@FindBy(xpath = "//a[@title='Contact Us']")
	WebElement contactUsLink;
	
	@FindBy(xpath = "//a[@class='login']")
	WebElement signInLink;
	
	@FindBy(xpath = "//img[@alt='My Store']")
	WebElement yourLogoImage;
	

}
