package com.amit.web.backup;
//This is just a back up of test base of older framework.
/*package com.amit.web.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.amit.web.helper.excel.ExcelReader;
import com.amit.web.helper.logger.LoggerHelper;
import com.amit.web.helper.resource.ResourceHelper;

public class TestBase {
	public WebDriver driver;
	ExcelReader excel;
	public Properties OR = new Properties();
	private Logger log = LoggerHelper.getLogger(TestBase.class);

	public WebDriver getDriver() {
		return driver;
	}

	public void loadData() throws IOException {
		File file = new File(System.getProperty("user.dir") + "/src/main/java/com/amit/web/config/config.properties");
		FileInputStream f = new FileInputStream(file);
		//Below is another class to read file contents instead of FileInputStream class
		//FileReader obj= new FileReader(file);
		OR.load(f);
		
		File file1 = new File(System.getProperty("user.dir") + "/src/main/java/com/amit/web/config/config1.properties");
		FileInputStream f1 = new FileInputStream(file1);
		OR.load(f1);
	}

	public void init() throws IOException {
		loadData();
		//String log4jConfPath = "log4j.properties";
		//PropertyConfigurator.configure(log4jConfPath);
		System.out.println(OR.getProperty("Domain"));
		System.out.println(OR.getProperty("browser"));
		selectBrowser(OR.getProperty("browser"));
		getUrl(OR.getProperty("url"));
	}

	public void selectBrowser(String browser) {
		System.out.println(System.getProperty("os.name"));
		if (System.getProperty("os.name").contains("Window")) {
			if (browser.equals("chrome")) {
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.chrome.driver",
						ResourceHelper.getResourcePath("/src/main/resources/drivers/chromedriver.exe"));
				driver = new ChromeDriver();
				// driver = new EventFiringWebDriver(dr);
				// eventListener = new WebEventListener();
				// driver.register(eventListener);
			} else if (browser.equals("firefox")) {
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.gecko.driver",ResourceHelper.getResourcePath("/src/main/resources/drivers/geckodriver.exe"));
				driver = new FirefoxDriver();
				// driver = new EventFiringWebDriver(dr);
				// eventListener = new WebEventListener();
				// driver.register(eventListener);
				// setDriver(driver);
			}
		}
	}

	public void getUrl(String url) {
		// log.info("navigating to :-" + url);
		driver.get(url);
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public String[][] getData(String excelName, String sheetName) {
		String path = System.getProperty("user.dir") + "/src/main/java/com/amit/web/testData/" + excelName;
		excel = new ExcelReader(path);
		String[][] data = excel.getDataFromSheet(sheetName, excelName);
		return data;
	}
	
	public void implicitWait(long time){
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
}
*/