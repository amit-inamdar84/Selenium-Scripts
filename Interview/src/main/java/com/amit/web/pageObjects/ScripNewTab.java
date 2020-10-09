package com.amit.web.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amit.web.helper.assertion.VerificationHelper;
import com.amit.web.helper.logger.LoggerHelper;

public class ScripNewTab {
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(ScripNewTab.class);
	
	@FindBy(xpath="//span[contains(text(),'Market Cap')]")
	WebElement verifyMarketCapText;
	
	public boolean verifyNewPageText(){
		return new VerificationHelper(driver).isDisplayed(verifyMarketCapText);
	}
	
	public ScripNewTab(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
