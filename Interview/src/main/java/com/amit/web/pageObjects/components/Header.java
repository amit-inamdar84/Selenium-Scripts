package com.amit.web.pageObjects.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amit.web.testBase.TestBase;

public class Header extends TestBase{
	private WebDriver driver;
	
	@FindBy(css = "img[src='http://automationpractice.com/modules/blockbanner/img/sale70.png']")
	WebElement headerImage;

}
