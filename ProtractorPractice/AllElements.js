/**Test case to demo count, retrieving all elements in a table/web table, resolve promise of each element by looping.
 * element.all will find all web elements matching a criteria.
 * count() function will return the size.
 * each() function will iterate/loop through all matching rows specified in element.all() criteria.
 */
describe("Test case to demo retrieving all elements in a table/web table, resolve promise of each element by looping.", function() {
	it("Test", function() {
		browser.get('http://juliemr.github.io/protractor-demo/');
		element(by.model("first")).sendKeys("10");
		element(by.model("second")).sendKeys("20");
		element(by.id("gobutton")).click();
		
		element(by.model("first")).sendKeys("8");
		element(by.model("second")).sendKeys("5");
		element(by.id("gobutton")).click();
		
		element(by.model("first")).sendKeys("4");
		element(by.model("second")).sendKeys("6");
		element(by.id("gobutton")).click();
		
		element.all(by.repeater("result in memory")).count().then(function(text) {
			console.log("Result row count: "+text);
		})
		
		element.all(by.repeater("result in memory")).each(function(item) {
			item.element(by.css("td:nth-child(3)")).getText().then(function(text) {//Now the element search scope will be within element.all(by.repeater("result in memory"))
				console.log(text);
			})
		})
	})
	
})