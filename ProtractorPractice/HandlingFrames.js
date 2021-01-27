/**A web page embedded inside another web page is called a frame.
 * 
 */
describe("This test is intermittently failing. Need to check in future", function() {
	it("Switching frames", function() {
		browser.waitForAngularEnabled(false);//As of now using non-angular website
		browser.driver.manage().window().maximize();
		browser.get('https://www.rahulshettyacademy.com/AutomationPractice/');
		var EC = protractor.ExpectedConditions;
		browser.wait(EC.visibilityOf(element(by.id("courses-iframe"))), 8000);
		browser.switchTo().frame(element(by.tagName('iframe')).getWebElement());//Referred from protractor official site.
		browser.wait(EC.visibilityOf(element(by.css("a[href*='sign_in']"))), 8000);
		element(by.css("a[href*='sign_in']")).getText().then(function(text) {
			console.log(text);
		})
	})
})