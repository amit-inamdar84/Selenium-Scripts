package com.amit.web.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amit.web.testBase.TestBase;

public class BullCartel extends TestBase {
	WebDriver driver;

	@FindBy(linkText = "The Bull Cartel")
	WebElement bullCartelLink;

	public void clickBullCartelLink() {
		bullCartelLink.click();
	}

	@FindBy(xpath = "//div[@id='content']/div/div/div/div/div[1]/h2/small")
	static WebElement bullCartelText;

	public static String getBullCartelText() {
		return bullCartelText.getText();
	}

	@FindBy(xpath = "//div[@id='content']/div/div/div/div/div[2]/div[1]/table/thead/tr/th[3]/a")
	WebElement sortcmpRs;

	public void clickCMPRs() {
		sortcmpRs.click();
	}

	public BullCartel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
