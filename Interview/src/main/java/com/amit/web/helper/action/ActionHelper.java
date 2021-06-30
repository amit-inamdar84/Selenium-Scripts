package com.amit.web.helper.action;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.amit.web.helper.logger.LoggerHelper;

public class ActionHelper {
	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(ActionHelper.class);

	public ActionHelper(WebDriver driver) {
		this.driver = driver;
		log.info("ActionHelper object is created..");
	}
	
	public void mouseHover(WebElement target){
		Actions action = new Actions(driver);
		action.moveToElement(target).build().perform();
	}

}
