package com.amit.web.testBase;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.amit.web.helper.browserConfiguration.BrowserType;
import com.amit.web.helper.browserConfiguration.ChromeBrowser;
import com.amit.web.helper.browserConfiguration.FirefoxBrowser;
import com.amit.web.helper.browserConfiguration.IExploreBrowser;
import com.amit.web.helper.browserConfiguration.config.ObjectReader;
import com.amit.web.helper.browserConfiguration.config.PropertyReader;
import com.amit.web.helper.excel.ExcelReader;
import com.amit.web.helper.javaScript.JavaScriptHelper;
import com.amit.web.helper.logger.LoggerHelper;
import com.amit.web.helper.resource.ResourceHelper;
import com.amit.web.helper.wait.WaitHelper;
import com.amit.web.utility.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestBase {
	public static ExtentReports extent;
	public static ExtentTest test;
	public WebDriver driver;
	private Logger log = LoggerHelper.getLogger(TestBase.class);
	public static File reportDirectery;
	
	@BeforeSuite
	public void beforeSuite() throws Exception{
		extent = ExtentManager.getInstance();
	}
	
	@BeforeTest
	public void beforeTest() throws Exception{
		reportDirectery = new File(ResourceHelper.getResourcePath("/src/main/resources/screenShots"));
		test = extent.createTest(getClass().getSimpleName());
	}
	
	@BeforeClass
	public void beforeClass() throws Exception{
		ObjectReader.reader = new PropertyReader();
		setUpDriver(ObjectReader.reader.getBrowserType());
	}
	
	
	@BeforeMethod
	public void beforeMethod(Method method){
		test.log(Status.INFO, method.getName()+"**************test started***************");
		log.info("**************"+method.getName()+"Started***************");
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException{
		if(result.getStatus() == ITestResult.FAILURE){
			test.log(Status.FAIL, result.getThrowable());
			String imagePath = captureScreen(result.getName(),driver);
			test.addScreenCaptureFromPath(imagePath);
		}
		else if(result.getStatus() == ITestResult.SUCCESS){
			test.log(Status.PASS, result.getName()+" is pass");
			//String imagePath = captureScreen(result.getName(),driver);
			//test.addScreenCaptureFromPath(imagePath);
		}
		else if(result.getStatus() == ITestResult.SKIP){
			test.log(Status.SKIP, result.getThrowable());
		}
		log.info("**************"+result.getName()+"Finished***************");
		extent.flush();
		
		if(driver!=null){
			driver.close();
		}
	}
	
	@AfterTest
	public void afterTest() throws Exception{
/*		if(driver!=null){
			driver.close();
		}*/
	}
	
	public WebDriver getBrowserObject(BrowserType btype) throws Exception{
		
		try{
			switch(btype){
			case Chrome:
				// get object of ChromeBrowser class
				ChromeBrowser chrome = ChromeBrowser.class.newInstance();//Another way to create an object
				ChromeOptions option = chrome.getChromeOptions();
				return chrome.getChromeDriver(option);
			case Firefox:
				FirefoxBrowser firefox = FirefoxBrowser.class.newInstance();
				FirefoxOptions options = firefox.getFirefoxOptions();
				return firefox.getFirefoxDriver(options);
				
			case Iexplorer:
				IExploreBrowser ie = IExploreBrowser.class.newInstance();
				InternetExplorerOptions cap = ie.getIExplorerCapabilities();
				return ie.getIExplorerDriver(cap);
			default:
				throw new Exception("Driver not Found: "+btype.name());
			}
		}
		catch(Exception e){
			log.info(e.getMessage());
			throw e;
		}
	}
	
	public void setUpDriver(BrowserType btype) throws Exception{
		driver = getBrowserObject(btype);
		log.info("Web driver is now initialized: "+driver.hashCode());
		WaitHelper wait = new WaitHelper(driver);
		wait.setImplicitWait(ObjectReader.reader.getImplicitWait(), TimeUnit.SECONDS);
		wait.pageLoadTime(ObjectReader.reader.getPageLoadTime(), TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public String captureScreen(String fileName, WebDriver driver){
		if(driver == null){
			log.info("driver is null..");
			return null;
		}
		if(fileName==""){
			fileName = "blank";
		}
		Reporter.log("captureScreen method called");
		File destFile = null;
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			destFile = new File(reportDirectery+"/"+fileName+"_"+formater.format(calendar.getTime())+".png");
			FileUtils.copyFile(srcFile, destFile);
			Reporter.log("<a href='"+destFile.getAbsolutePath()+"'><img src='"+destFile.getAbsolutePath()+"'height='100' width='100'/></a>");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return destFile.toString();
	}

	
	public void getNavigationScreen(WebDriver driver) {
		log.info("capturing ui navigation screen...");
		new JavaScriptHelper(driver).zoomInBy60Percentage();
		 String screen = captureScreen("", driver);
		 new JavaScriptHelper(driver).zoomInBy100Percentage();
		 try {
			test.addScreenCaptureFromPath(screen);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void logExtentReport(String s1){
		test.log(Status.INFO, s1);
	}
	
	public void getApplicationUrl(String url){
		driver.get(url);
		logExtentReport("navigating to ..."+url);
	}
	
	public String[][] getData(String excelName, String sheetName) {
		String path = ResourceHelper.getResourcePath("/src/main/java/com/amit/web/testData/" + excelName);
		ExcelReader excel = new ExcelReader(path);
		String[][] data = excel.getDataFromSheet(sheetName, excelName);
		return data;
	}
}
