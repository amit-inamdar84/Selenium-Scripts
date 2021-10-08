package seleniumTutorial;

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
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.naming.directory.NoSuchAttributeException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
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
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.amit.web.helper.resource.ResourceHelper;
import com.amit.web.testBase.TestBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SeleniumCommands extends TestBase {
	@Test
	public void basicCommands(ITestResult result) throws IOException, InterruptedException {
		
		//Configuring browsers
		//setProperty accepts a key and a value
		System.setProperty("webdriver.chrome.driver", "path of chrome driver.exe");
		driver = new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver", "path of ie driver.exe");
		driver = new InternetExplorerDriver();
		
		System.setProperty("webdriver.gecko.driver", "path of gecko driver.exe");
		driver = new FirefoxDriver();
		
		//driver is a reference of Webdriver interface. findElement is a method of Webdriver interface. By is a abstract class and xpath is a static method.
		driver.findElement(By.xpath("xpath"));
		// List of all web elements matching a criteria
		List<WebElement> allElements = driver.findElements(By.xpath("xpath"));
		for (WebElement element : allElements) {
			System.out.println("" + element.getText());
		}

		// Handling pop up using alert Interface
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.sendKeys("Test");
		alert.getText();

		// Reading tooltip
		//driver.findElement(By.xpath("xpath")) returns a web element on which we can call getAttribute method.
		driver.findElement(By.xpath("xpath")).getAttribute("Title");
		driver.findElement(By.xpath("xpath")).getAttribute("Value");
		
		//Deleting cookies
		driver.manage().deleteAllCookies();
		
		//Fetching css value:
		driver.findElement(By.xpath("xpath")).getCssValue("font-size");
		
		// Switching window using iterator on Set interface
		//Before switching to child store the parent window which will be required later to switch back to parent.
		Set<String> windows = driver.getWindowHandles();
		String parentWindow = driver.getWindowHandle();
		Iterator<String> itr = windows.iterator();
		while(itr.hasNext()){
			String childWindow = itr.next();
			driver.switchTo().window(childWindow);
		}
		//Once work is done in child window switch to parent window
		driver.switchTo().window(parentWindow);
		
		//This method will switch to child window based on index
		Set<String> windows1 = driver.getWindowHandles();
		int i = 1;
		int index=3;//This should be a local variable passed as an argument to method.
		for (String window : windows1) {
			if (i == index) {
				System.out.println("switched to : " + index + " window");
				driver.switchTo().window(window);
			} else {
				i++;
			}
		}
		
		//This method will close all tabbed windows and switched to main window
		Set<String> windows2 = driver.getWindowHandles();
		String mainwindow = driver.getWindowHandle();

		for (String window : windows2) {
			if (!window.equalsIgnoreCase(mainwindow)) {
				driver.close();
			}
		}
		System.out.println("switched to main window");
		driver.switchTo().window(mainwindow);
		

		// Get URL of current page
		driver.getCurrentUrl();
		
		//Maximize window. Sub interfaces of Webdriver interface. 
		driver.manage().window().maximize();

		// Explicit waits
		//Waits till expected condition occurs to a maximum of specified time and then throws exception.
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("xpath")));
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotVisibleException.class);
		wait.ignoring(StaleElementReferenceException.class);
		wait.ignoring(NoSuchFrameException.class);
		
		//Implicit wait
		//driver waits for specified time to find an element. If found within the time, next statement is executed.
		//Else after specified time NoSuchElementException is thrown.
		//This wait applies to all the elements in the test script.
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Fluent wait - Another type of explicit wait.
		//Fluent Wait looks for a web element repeatedly at regular intervals until timeout happens or until the object is found.
		//We use FluentWait commands mainly when we have web elements which sometimes visible in few seconds and some times take more time than usual.
		//Mainly in Ajax applications. We could set the default pooling period based on our requirement. We could ignore any exception while polling an element.
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS);//Deprecated
		//wait1.until(isTrue);
		Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5));
		Wait<WebDriver> wait3 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("xpath")));

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
		//We can practice java script in browser console
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
		//Scroll up vertically
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		//Scroll till element
		js.executeScript("window.scrollTo(arguments[0],arguments[1])", element.getLocation().x, element.getLocation().y);
		js.executeScript("window.location = 'https://www.softwaretestingmaterial.com");// Navigate
																						// to
																						// some
																						// page
		// To click on a SubMenu which is only visible on mouse hover on Menu
		js.executeScript("$('ul.menus.menu-secondary.sf-js-enabled.sub-menu li').hover()");
		//Zoom in
		js.executeScript("document.body.style.zoom='100%'");
		//Change color/flash a web element. Refer framework for method definition and calling.
		js.executeScript("arguments[0].style.backgroundColor = 'Green'", element1);
		//Draw border for a web element
		js.executeScript("arguments[0].style.border = '3px solid red'", element1);

		// Drop down selection
		WebElement element2 = driver.findElement(By.tagName("select"));
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
		
		//Handling radio buttons
		//If there are multiple radio buttons get the size and use get(index) to locate a particular button and click.
		int noOfButtons = driver.findElements(By.xpath("xpath")).size();
		driver.findElements(By.xpath("xpath")).get(1).click();

		// Drag and drop - Actions class and Action interface
		//Actions class contains the below methods for user facing API interactions.
		//Action interface contains only one method perform.
		//You can string a bunch of actions together using Actions, and then once you call build() it will store that set of steps as an Action.
		//Once you have an Action, you can call perform() to execute that set of steps.
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
		action.moveToElement(des).build().perform();
		//After mouse over we can use driver.findElement(By.xpath("xpath")).click();

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
		
		//Fetching all broken links - refer class - BrokenLinks.java
		//Collect all the links in the web page based on <a> tag.
		//Send HTTP request for the link and read HTTP response code.
		//Find out whether the link is valid or broken based on HTTP response code.
		//Repeat this for all the links captured.
		
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
		
		//Taking screenshot of failed test case
		if(result.getStatus() == ITestResult.FAILURE){
			File srcFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile1, new File("D:\\Screenshot.png"));
		}
		
		//Reading property file
		Properties OR = new Properties();
		File file = new File("D:\\Git\\Interview\\src\\main\\java\\com\\amit\\web\\config\\config1.properties");
		FileInputStream f = new FileInputStream(file);
		OR.load(f);
		System.out.println(OR.getProperty("Domain"));
	
		
		//All classes related to firefox options/launching/capabilities
		//https://sites.google.com/a/chromium.org/chromedriver/capabilities
		//Chrome Options class includes methods to Start Chrome maximized, Block pop-up windows, Set download directory etc. More details in link above.
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
		//To run our test cases in remote machine we need to use DesiredCapabilities class together with RemoteWebDriver class
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
			//The result is stored in a variable of interface type Connection.
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
		
		//Upload file using browse button with or without file path text box. DO NOT click use sendKeys instead.
		driver.findElement(By.xpath("xpath")).sendKeys("FilePath");
		
		//Download file
		System.setProperty("webdriver.gecko.driver", "Path");
		FirefoxOptions options1 = new FirefoxOptions();
		options1.addPreference("browser.download.dir", "/Users/AMIT/Downloads");
		options1.addPreference("browser.download.folderList", 1);
		options1.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream;"); //MIME type for exe file
		driver = new FirefoxDriver(options1);
		driver.get("https://www.eclipse.org/downloads/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Allow cookies']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Download 64 bit')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='novaContent']/div[1]/div[1]/div/div/a")).click();
		Thread.sleep(5000);
		
		//Configuring log4j
		//PropertyConfigurator class allows the configuration of log4j from an external file
		//PropertyConfigurator.configure("Path of log4j properties file");
		//getLogger method in Logger class takes the class name and returns a Logger.
		//Logger log = Logger.getLogger(SeleniumCommands.class);
		//One the logger returned we can call log.info to log the results. 
		//log.info("test");
		
		//Configuring log4j2
		//Add log4j-api and log4j-core dependencies to pon.xml
		//Now create a log4j2.xml file under “src/main/resource/configFile” directory and write code in it.
		//Add below code in pom.xml
		 /*<build>
		  <resources>
		  <resource>
		        <directory>src/main/resources/configFile</directory>
		        <filtering>true</filtering>
		      </resource>
		  </resources>
		  </build>*/
		//Use this in test files: private static Logger log = LogManager.getLogger(Helloworldlog4j2.class);
		
		//Extent reports
		//ExtentReports, ExtentTest and ExtentHtmlReporter are the main classes for extent reports in the package com.aventstack.extentreports
		//https://www.softwaretestinghelp.com/extent-reports-selenium-webdriver/
		String fileName = "Path of extent report HTML file";
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
		htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setDocumentTitle(fileName);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName("Automation Report");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		test = extent.createTest(getClass().getSimpleName());
		test.log(Status.INFO, "Details");
		extent.flush();
		
		//Exceptions: Selenium related exceptions avaiable in org.openqa.selenium package
		Class test = org.openqa.selenium.NoSuchElementException.class;//Thrown when requested web element is not found
		Class test1 = ElementNotVisibleException.class;//Thrown to indicate that although an element is present on the DOM, it is not visible, and so is not able to be interacted with.
		Class test2 = StaleElementReferenceException.class;//Indicates that a reference to an element is now "stale" --- the element no longer appears on the DOM of the page.
		Class test3 = NoSuchFrameException.class;//When requested frame is not found
		Class test4 = NoAlertPresentException.class;//Indicates that a user has tried to access an alert when one is not present.
		Class test5 = NoSuchWindowException.class;//Thrown when using driver.switchTo.window() and no window was found.
		Class test6 = TimeoutException.class;//Thrown when a command does not complete in enough time.
		Class test7 = WebDriverException.class;//
		Class test8 = ElementNotInteractableException.class;
		
		//Print all data in web table - TestToVerifyDataInTable.java
		//Get max value of a column in a web table - TestToPrintMaxValueInWebTable.java
		//Pending scenarios:;
		//OTP automation
		//Selenium IDE can be used to capture locators which flash and disappears in micro seconds
		//Text in image
		//Sikuli
		//Using java regex
		//Generics in Java
		//OCX - Alternative for sikuli
		//

		/*
		 * Ways to run test scripts:
		 * Right click Run as Java to run single java program.
		 * Right click Run as TestNG Test to run single selenium script with TestNG.
		 * Include all scripts to be run in testng.xml file. Right click on testng.xml file and Run as TestNG suite.
		 * Include <suiteXmlFiles>testng.xml</suiteXmlFiles> dependency in pom.xml file. Right click and Run as Maven test.
		 */
		//Mime type information: https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types
		
/*		Methods in ExpectedConditions class:
		wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.attributeContains(element2, attribute, value);
		wait.until(ExpectedConditions.attributeToBe(element2, attribute, value);
		wait.until(ExpectedConditions.elementToBeClickable(element2);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator);
		wait.until(ExpectedConditions.invisibilityOf(element2);
		wait.until(ExpectedConditions.numberOfElementsToBe(locator, number);
		wait.until(ExpectedConditions.stalenessOf(element2);
		wait.until(ExpectedConditions.textToBe(locator, value);
		wait.until(ExpectedConditions.visibilityOf(element2);
		wait.until(ExpectedConditions.visibilityOfAllElements(elements);*/
	}

}
