package com.amit.web.testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.amit.web.testBase.TestBase;

public class SeleniumCommands extends TestBase {

	@Test
	public void basicCommands() throws IOException {
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
		//driver.findElement(By.xpath("xpath")) returns a web element on which we can call getAttribute method.
		driver.findElement(By.xpath("xpath")).getAttribute("Title");
		driver.findElement(By.xpath("xpath")).getAttribute("Value");
		
		//Fetching css value:
		driver.findElement(By.xpath("xpath")).getCssValue("font-size");

		// Switching window using for each loop
		for (String childWindow : driver.getWindowHandles()) {
			driver.switchTo().window(childWindow);
		}
		
		// Switching window using iterator on Set interface
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while(itr.hasNext()){
			String childWindow = itr.next();
			driver.switchTo().window(childWindow);
		}

		// Get URL of current page
		driver.getCurrentUrl();
		
		//Maximize window.
		driver.manage().window().maximize();

		// Explicit waits
		//Waits till expected condition occurs to a maximum of specified time and then throws exception.
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("xpath")));
		
		//Implicit wait
		//Waits for specified time to find an element which comes after the wait statement. If found within the time, next statement is executed.
		//Else after specified time NoSuchElementException is thrown.
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Fluent wait
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS);//Deprecated
		//wait1.until(isTrue);
		Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5));

		// Close browser
		driver.close();// Close the current window, quitting the browser if it's
						// the last window currently open.
		driver.quit();// Quits this driver, closing every associated window.
		
		//Locators
		WebElement element = driver.findElement(By.xpath("xpath"));
		driver.findElement(By.id("ID"));
		driver.findElement(By.className("className"));
		driver.findElement(By.linkText("linkText"));
		driver.findElement(By.partialLinkText("partialLinkText"));
		driver.findElement(By.cssSelector("cssSelector"));//# for ID, Dot . for class
		driver.findElement(By.tagName("tagName"));
		
		

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
		WebElement element1 = driver.findElement(By.xpath("xpath"));
		js.executeScript("arguments[0].click();", element1);// Click
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
		WebElement element2 = driver.findElement(By.xpath("xpath"));
		Select dd = new Select(element2);
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
		//Prefer to use sendKeys in WebElement interface. Use Actions class sendKeys method when performing complex interactions.
		//Here the keys pressed are not released and there is no attempt to refocus on the element.
		action.sendKeys(des, Keys.CLEAR).build().perform();
		//Mouse over
		action.moveToElement(des);

		// Handling iFrames
		List frames = driver.findElements(By.tagName("iframe"));
		frames.size();
		driver.switchTo().frame(1);
		driver.switchTo().frame("Frame");
		driver.switchTo().frame(des);
		driver.switchTo().defaultContent();
		
		//Fetching all hyperlinks in a web page
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for(WebElement link:allLinks){
			if(link.getText().contains("google")){
			System.out.println(link.getAttribute("href"));
			}
		}
		
		//Display date in required format
		SimpleDateFormat formattedDate = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		System.out.println(date);
		System.out.println(formattedDate.format(date));
		
		//Take screenshot of a web page
		//driver is of type Webdriver interface which come higher in hierarchy of interfaces. TakesScreenshot is an interface which is lower in hierarchy
		//compared to Webdriver. So we cast driver variable to TakesScreenshot type in order to call the method getScreenshotAs() which belongs to
		//TakesScreenshot interface.
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("D:\\Screenshot.png"));
		
		//Reading property file
		Properties OR = new Properties();
		File file = new File("D:\\Git\\Interview\\src\\main\\java\\com\\amit\\web\\config\\config1.properties");
		FileInputStream f = new FileInputStream(file);
		OR.load(f);
		System.out.println(OR.getProperty("Domain"));
		
		//Configuring browsers
		//setProperty accepts a key and a value
		System.setProperty("webdriver.chrome.driver", "path of chrome driver.exe");
		driver = new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver", "path of ie driver.exe");
		driver = new InternetExplorerDriver();
		
		System.setProperty("webdriver.gecko.driver", "path of gecko driver.exe");
		driver = new FirefoxDriver();
		
		//All classes related to firefox options/launching/capabilities
		//Create FirefoxOptions class object and access its method addPreference to set properties to browser.
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("browser.download.dir", "/Users/AMIT/Downloads");
		//Then supply options as an argument to FirefoxDriver driver class constructor. This will help to launch the browser with specific options that
		//are defined in addPreference method.
		driver = new FirefoxDriver(options);
		//The desired capability is a series of key/value pairs that stores the browser properties like browsername, browser version, the path of the browser
		//driver in the system, etc. to determine the behaviour of the browser at run time.
		//Desired capability can also be used to configure the driver instance of Selenium WebDriver.
		//We can configure driver instance like FirefoxDriver, ChromeDriver, InternetExplorerDriver by using desired capabilities.
		//The Desired Capabilities class will help to set an environment to define the behaviour of the browser/environment on which the test can be executed.
		//DesiredCapabilities.firefox() is a firefox specific static method. We have similar methods for Chrome Android etc.
		DesiredCapabilities firefox = DesiredCapabilities.firefox();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(true);
		
		firefox.setCapability(FirefoxDriver.PROFILE, profile);
		firefox.setCapability("marionette", true);
        
		//Finally we have to pass desired capability to FirefoxOptions class and the pass options to FirefoxDriver class constructor
		FirefoxOptions firefoxOptions = new FirefoxOptions(firefox);
		// Linux
		if (System.getProperty("os.name").contains("Linux")) {
			firefoxOptions.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
		}
		
		
		
		//DB Connection
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String connection = "jdbc:mysql://localhost:3306/customers";
			String userName = "root";
			String password = "MySQL_3007";
			//A call to forName("X") causes the class named X to be initialized.
			//Also the JDBC driver gets registered
			Class.forName(driver);
			//Driver manager provides basic service for managing JDBC drivers. getConnection establishes connection to give DB URL.
			Connection con = DriverManager.getConnection(connection, userName, password);
			//On a connection session createStatement() method creates a statement object.
			Statement stmt = con.createStatement();
			//On that statement object we can send SQL statements to DB and executeQuery() method executes queries.
			//ResultSet is an interface. A ResultSet object maintains a cursor pointing to its current row of data. Initially the cursor is positioned
			//before the first row. The next method moves the cursor to the next row, and because it returns false when there are no more rows in the
			//ResultSet object,it can be used in a while loop to iterate through the result set. 
			ResultSet data = stmt.executeQuery("Select *");
			while(data.next()){
				//The columns here must match the actual no of columns returned in database.
				System.out.println(data.getString(1)+" "+data.getString(2)+" "+data.getString(3)+" "+data.getString(4));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		/*
		 * Ways to run test scripts:
		 * Right click Run as Java to run single java program.
		 * Right click Run as TestNG Test to run single selenium script with TestNG.
		 * Include all scripts to be run in testng.xml file. Right click on testng.xml file and Run as TestNG suite.
		 * Include <suiteXmlFiles>testng.xml</suiteXmlFiles> dependency in pom.xml file. Right click and Run as Maven test.
		 */
		//Mime type information: https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types
	}

}
