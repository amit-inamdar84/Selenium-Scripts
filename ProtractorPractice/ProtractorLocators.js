/**
 * First test case using protractor locators---
 * Refer https://www.protractortest.org/#/api-overview
 * browser is a global variable which protractor exports to your spec (test) file.
 * browser.get method loads a page
 * The element function searches for an element on the page. It requires one parameter, a locator strategy for locating the element.
 * by - A collection of element locator strategies. For example, elements can be found by CSS selector, by ID, or by the attribute they
 * are bound to with ng-model.
 * protractor - The Protractor namespace which wraps the WebDriver namespace. Contains static variables and classes, such as protractor.
 * Key which enumerates the codes for special keyboard signals.
 * Apart from locators which selenium supports protractor supports few extra locators specific to Angular
 * applications like model and binding.
 * Protractor website recommends to use locators like - css, id, name, model and bindings. Also repeater (per Rahul Shetty)
 * Protractor test execution is fastest among all tools available in the market.
 * then() is used to resolve promise for browser functions that are not supported by protractor.
 * Protractor has good intelligence to wait for something to display without any wait statement.
 */
describe("First test case using protractor locators", function() {
	it("Open website and type operands", function() {
		browser.get('http://juliemr.github.io/protractor-demo/');
		element(by.model("first")).sendKeys("10");
		element(by.model("second")).sendKeys("20");
		element(by.id("gobutton")).click();
		//Jasmine automatically takes care of promise resolution.
		//We can use toBe for Strings. For variables we can use toEqual
		expect(element(by.css("h2[class='ng-binding']")).getText()).toBe("30");
		element(by.css("h2[class='ng-binding']")).getText().then(function(text) {//Real output will be seen only upon resolving promise even
			//though if we insert then() function in previous step and execute in sequence.
			console.log(text);
		});
	})
	
})