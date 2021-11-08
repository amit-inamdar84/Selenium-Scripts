package com.amit.web.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchProductAndAddToCart {
	WebDriver driver;
	@BeforeClass
	public void initBrowser(){
		//Insert path of chrome driver here when running locally
		System.setProperty("webdriver.chrome.driver","D:\\Git\\Interview\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void searchProductAndAddToCart(){
		//Launch website
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Login
		driver.findElement(By.cssSelector("a[class='login']")).click();
		String actualLoginPageURL = driver.getCurrentUrl();
		String expectedLoginPageURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
		Assert.assertEquals(actualLoginPageURL, expectedLoginPageURL);
		driver.findElement(By.id("email")).sendKeys("amit.inamdar84@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Automation123");
		driver.findElement(By.cssSelector("i[class='icon-lock left']")).click();
		String actualHomePageURL = driver.getCurrentUrl();
		String expectedHomePageURL = "http://automationpractice.com/index.php?controller=my-account";
		Assert.assertEquals(actualHomePageURL, expectedHomePageURL);
		
		//Search product
		driver.findElement(By.id("search_query_top")).sendKeys("Printed");
		WebElement element = driver.findElement(By.cssSelector("div[class = 'ac_results']>:nth-child(1)>:nth-child(1)"));//First suggestion
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.pollingEvery(Duration.ofMillis(5));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
		String searchResultText = driver.findElement(By.tagName("h1")).getText();
		Assert.assertEquals(searchResultText, "Printed Summer Dress");//Verify search result text
		
		//Add to cart
		driver.findElement(By.cssSelector("p[id='add_to_cart'] button")).click();
		String addToCartConfirmation = driver.findElement(By.cssSelector("h2")).getAttribute("innerText").trim();
		Assert.assertEquals(addToCartConfirmation, "Product successfully added to your shopping cart");
	}
	
	@Test(dependsOnMethods={"searchProductAndAddToCart"})//Adding dependency to reuse the above code. In framework we anyway have page objects for reusability.
	public void checkoutProduct(){
		driver.findElement(By.cssSelector("a[title='Proceed to checkout'] span")).click();
		String actualCartSummaryHeader = driver.findElement(By.xpath("//span[contains(text(),' Summary')]")).getText().trim();
		Assert.assertEquals(actualCartSummaryHeader, "01. Summary");
		Assert.assertEquals(driver.findElement(By.cssSelector("td[class='cart_description']>:nth-child(1)>:nth-child(1)")).getText(), "Printed Summer Dress");
		Assert.assertEquals(driver.findElement(By.cssSelector("td[class='cart_quantity text-center']>:nth-child(2)")).getAttribute("value"), "1");
		Assert.assertEquals(driver.findElement(By.cssSelector("td[id='total_price_container'] span")).getText(), "$30.98");
		driver.findElement(By.cssSelector("a[href='http://automationpractice.com/index.php?controller=order&step=1'] span")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector("div[id='center_column'] h1")).getText(), "ADDRESSES");
		driver.findElement(By.cssSelector("button[name='processAddress'] span")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector("input[type='radio']")).isSelected(), true);
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.cssSelector("button[name='processCarrier'] span")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector("div[id='center_column'] h1")).getText(), "PLEASE CHOOSE YOUR PAYMENT METHOD");
		Assert.assertEquals(driver.findElement(By.cssSelector("span[id='total_price']")).getText(), "$30.98");//Verify final amount before payment
		
		//Select payment method
		driver.findElement(By.cssSelector("a[title='Pay by bank wire']")).click();
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), "BANK-WIRE PAYMENT.");
		driver.findElement(By.cssSelector("p[id='cart_navigation'] span")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector("p[class='cheque-indent'] strong")).getText(), "Your order on My Store is complete.");
	}
	
	@AfterClass
	public void close(){
		driver.close();
	}
	

}
