package seleniumTutorial;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.amit.web.testBase.TestBase;

public class TestSeleniumCode extends TestBase {
	public static final Logger log = LogManager.getLogger(TestSeleniumCode.class);//Classname.class will return an instance of the class.

	@Test
	public void test() throws IOException {
		Properties OR = new Properties();
		File file = new File("D:\\Git\\Interview\\src\\main\\java\\com\\amit\\web\\config\\config1.properties");
		FileInputStream f = new FileInputStream(file);
		OR.load(f);
		System.out.println(OR.getProperty("Domain"));
		String log4jConfPath = "log4j.properties";
		//PropertyConfigurator.configure(log4jConfPath);
		log.info("Starting chrome browser");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		js.executeScript("arguments[0].click();", element);
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("D:\\Screenshot.png"));
		driver.close();
	}

	@Test(enabled = false)
	public void testDate() {
		// Display date in required format
		SimpleDateFormat formattedDate = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		System.out.println(date);
		System.out.println(formattedDate.format(date));
	}

}
