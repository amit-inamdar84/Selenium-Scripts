/**Repeater locator, Chain locator and CSS.
 * 
 */
describe("Demo of repeater locator, chaining locators to access child elements, CSS writing", function() {
	it("Repeater locator", function() {
		browser.get('http://juliemr.github.io/protractor-demo/');
		element(by.model("first")).sendKeys("10");
		element(by.model("second")).sendKeys("20");
		element(by.id("gobutton")).click();
		element(by.repeater("result in memory")).element(by.css("td:nth-child(3)")).getText().then(function(text) {
			console.log("Result is: "+text);
		})
	})
})