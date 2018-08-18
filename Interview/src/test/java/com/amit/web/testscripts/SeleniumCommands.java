package com.amit.web.testscripts;

import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.amit.web.testBase.TestBase;

public class SeleniumCommands extends TestBase {

	@Test
	public void basicCommands() {
		// List of all web elements matching a criteria
		List<WebElement> allElements = driver.findElements(By.xpath("xpath"));
		for (WebElement element : allElements) {
			System.out.println("" + element.getText());
		}

		// Handling pop up using alert Interface
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();

		// Reading tooltip
		driver.findElement(By.xpath("xpath")).getAttribute("Title");
		driver.findElement(By.xpath("xpath")).getAttribute("Value");

		// Switching window
		for (String childWindow : driver.getWindowHandles()) {
			driver.switchTo().window(childWindow);
		}

		// Get URL of current page
		driver.getCurrentUrl();

		// Explicit, implicit and fluent waits
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("xpath")));

		// Close browser
		driver.close();// Close the current window, quitting the browser if it's
						// the last window currently open.
		driver.quit();// Quits this driver, closing every associated window.

		// Send Keys
		driver.findElement(By.xpath("xpath")).sendKeys("Text");
		driver.findElement(By.xpath("xpath")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("xpath")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("xpath")).sendKeys(Keys.F5);
		driver.findElement(By.xpath("xpath")).sendKeys(Keys.CONTROL);
		driver.findElement(By.xpath("xpath")).sendKeys(Keys.SPACE);
		driver.findElement(By.xpath("xpath")).sendKeys(Keys.ARROW_LEFT);
		driver.findElement(By.xpath("xpath")).sendKeys(Keys.NUMPAD1);
		driver.findElement(By.xpath("xpath")).sendKeys(Keys.ADD);

		// Checking element in web page
		driver.findElement(By.xpath("xpath")).isDisplayed();
		driver.findElement(By.xpath("xpath")).isEnabled();
		driver.findElement(By.xpath("xpath")).isSelected();

		// Browser navigation
		driver.get("https://www.google.com");// Wait till entire page is loaded
		driver.navigate().to("https://www.google.com");// Will not wait till
														// page is loaded.
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();

		// Javascript functions
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("xpath"));
		js.executeScript("arguments[0].click();", element);// Click
		js.executeScript("document.getElementById('some id').value='someValue';");// Type
																					// text
		js.executeScript("document.getElementById('enter element id').checked=false;");// Handle
																						// check
																						// box
		js.executeScript("alert('Welcome To SoftwareTestingMaterial');");// Generate
																			// pop
																			// up
																			// window
		js.executeScript("history.go(0)");// Refresh browser
		js.executeScript("return document.documentElement.innerText;").toString();// Get
																					// inner
																					// text
																					// of
																					// HTML
		js.executeScript("return document.title;").toString();// get the Title
																// of web page
		js.executeScript("return document.URL;").toString();// Get URL of web
															// page
		// Vertical scroll - down by 500 pixels
		js.executeScript("window.scrollBy(0,500)");
		// for scrolling till the bottom of the page we can use the code like
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.location = 'https://www.softwaretestingmaterial.com");// Navigate
																						// to
																						// some
																						// page
		// To click on a SubMenu which is only visible on mouse hover on Menu
		js.executeScript("$('ul.menus.menu-secondary.sf-js-enabled.sub-menu li').hover()");

		// Drop down selection
		WebElement element1 = driver.findElement(By.xpath("xpath"));
		Select dd = new Select(element1);
		dd.selectByIndex(1);
		dd.selectByValue("value");
		dd.selectByVisibleText("text");
		dd.deselectAll();
		dd.deselectByIndex(1);
		dd.deselectByValue("value");
		dd.deselectByVisibleText("text");
		dd.getAllSelectedOptions();
		dd.getFirstSelectedOption();
		dd.getOptions();
		dd.isMultiple();

		// Drag and drop - Actions class and Action interface
		Actions action = new Actions(driver);
		WebElement src = driver.findElement(By.xpath("xpath"));
		WebElement des = driver.findElement(By.xpath("xpath"));
		action.clickAndHold(src).build().perform();
		action.moveToElement(des).build().perform();
		action.release(des).build().perform();
		// Or in one line code as below
		action.dragAndDrop(src, des);
		action.click(des);
		action.contextClick(des).build().perform();// Right click
		action.doubleClick(des).build().perform();
		action.keyDown(des, "test");
		action.keyUp(Keys.ALT);
		action.sendKeys(des, Keys.CLEAR).build().perform();

		// Handling iFrames
		List frames = driver.findElements(By.tagName("iframe"));
		frames.size();
		driver.switchTo().frame(1);
		driver.switchTo().frame("Frame");
		driver.switchTo().frame(des);
		driver.switchTo().defaultContent();

	}

}
