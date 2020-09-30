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
	
	@FindBy(xpath="//*[@id='content-area']/section[1]/ul/li[3]")
	WebElement verify52WeekHLText;
	
	public boolean verifyNewPageText(){
		return new VerificationHelper(driver).isDisplayed(verify52WeekHLText);
	}
	
	public ScripNewTab(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
