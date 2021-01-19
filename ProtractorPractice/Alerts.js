describe("Handling javascript pop ups", function() {
	it("Handling javascript pop ups", function() {
		browser.waitForAngularEnabled(false);//As of now using non-angular website
		browser.get('https://www.rahulshettyacademy.com/AutomationPractice/');
		browser.driver.manage().window().maximize();
		var EC = protractor.ExpectedConditions;
		browser.wait(EC.presenceOf(element(by.id("name"))), 8000);
		element(by.id("name")).sendKeys(""+1);
		element(by.id("confirmbtn")).click();
		browser.switchTo().alert().dismiss().then(function(arg0) {
			browser.sleep(3000);
		})
		element(by.id("name")).sendKeys(""+1);
		element(by.id("confirmbtn")).click().then(function(arg0) {
			browser.sleep(3000);
		});
		browser.switchTo().alert().accept();
	})
})