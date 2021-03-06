package com.amit.web.helper.javaScript;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.amit.web.helper.logger.LoggerHelper;

public class JavaScriptHelper {
	private WebDriver driver;

	private Logger log = LoggerHelper.getLogger(JavaScriptHelper.class);

	public JavaScriptHelper(WebDriver driver) {
		this.driver = driver;
		log.info("JavaScriptHelper has been initialised");
	}

	/**
	 * This method will execute java script
	 * 
	 * @param script
	 * @return
	 */
	public Object executeScript(String script) {
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		return exe.executeScript(script);
	}

	/**
	 * This method will execute Java script with multiple arguments
	 * 
	 * @param script
	 * @param args
	 * @return
	 */
	public Object executeScript(String script, Object... args) {
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		return exe.executeScript(script, args);
	}

	/**
	 * This method will scroll till element
	 * 
	 * @param element
	 */
	public void scrollToElement(WebElement element) {
		log.info("scroll to WebElement...");
		executeScript("window.scrollTo(arguments[0],arguments[1])", element.getLocation().x, element.getLocation().y);
	}

	/**
	 * Scroll till element and click
	 * 
	 * @param element
	 */
	public void scrollToElementAndClick(WebElement element) {
		scrollToElement(element);
		element.click();
		log.info("element is clicked: " + element.toString());
	}

	/**
	 * Scroll till element view
	 * 
	 * @param element
	 */
	public void scrollIntoView(WebElement element) {
		log.info("scroll till web element");
		executeScript("arguments[0].scrollIntoView()", element);
	}

	/**
	 * Scroll till element view and click
	 * 
	 * @param element
	 */
	public void scrollIntoViewAndClick(WebElement element) {
		scrollIntoView(element);
		element.click();
		log.info("element is clicked: " + element.toString());
	}

	/**
	 * This method will scroll down vertically
	 */
	public void scrollDownVertically() {
		log.info("scrolling down vertically...");
		executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	/**
	 * This method will scroll up vertically
	 */
	public void scrollUpVertically() {
		log.info("scrolling up vertically...");
		executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	}

	/**
	 * This method will scroll till given pixel (e.g=1500)
	 * 
	 * @param pixel
	 */
	public void scrollDownByPixel(int pixel) {
		executeScript("window.scrollBY(0," + pixel + ")");
	}

	public void scrollUpByPixel(int pixel) {
		executeScript("window.scrollBY(0,-" + pixel + ")");
	}

	/**
	 * This method will zoom screen by 100%
	 */
	public void zoomInBy100Percentage() {
		executeScript("document.body.style.zoom='100%'");
	}

	/**
	 * This method will zoom screen by 60%
	 */
	public void zoomInBy60Percentage() {
		executeScript("document.body.style.zoom='40%'");
	}

	/**
	 * This method will click on element
	 * 
	 * @param element
	 */
	public void clickElement(WebElement element) {
		executeScript("arguments[0].click();", element);
	}
	
	/*
	 * This method will highlight and element by changing the color.
	 */
	
	public void highlightElement(WebElement element) throws InterruptedException{
		String bgColor = element.getCssValue("backgroundColor");
		for(int i = 0;i<10;i++){
			changeColor("rgb(0,200,0)", element);
			changeColor(bgColor, element);
		}
	}
	
	/*
	 * This method will change color of an element 
	 */
	public void changeColor(String color, WebElement element) throws InterruptedException{
		executeScript("arguments[0].style.backgroundColor = '"+color+"'",element);
		Thread.sleep(1000);
	}
	
	/*
	 * This method will draw border around a web element
	 */
	public void drawBorder(WebElement element){
		executeScript("arguments[0].style.border = '3px solid red'",element);
	}
	/*
	 * This method will take a date and change the attribute called value in HTML code. The new date will reflect in the date field
	 */
	public void selectDateByJS(WebElement element, String date){
		executeScript("arguments[0].setAttribute('value','"+date+"');", element);
	}

}
