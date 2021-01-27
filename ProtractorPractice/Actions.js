/**Practice to use actions class preferably when using mouse over and keyboard actions
 * 
 */

describe("Actions class", function() {
	it("Testing actions class usage", function() {
		browser.get("https://www.globalsqa.com/angularJs-protractor/SearchFilter/");
/*		element(by.id("input1")).sendKeys("HouseRent").then(function(arg0) {//Simple way to send keys after locating.
			browser.sleep(5000);
		});*/
		
		browser.actions().mouseMove(element(by.id("input1")).sendKeys("HouseRent")).perform().then(function(arg0) {//Sending keys using actions class.
			browser.sleep(3000);
		});
		
		//Below code for future use. Just to demo non text sendkeys action. Need a practice website for autocomplete drop downs.
		/*browser.actions().mouseMove(element(by.id("input1")));
		browser.actions().sendKeys(protractor.Key.ARROW_DOWN).perform();
		browser.actions().sendKeys(protractor.Key.ENTER).perform().then(function(arg0) {
			browser.sleep(3000);
		});*/
		
		element(by.id("input2")).element(by.css("option:nth-child(2)")).click().then(function(arg0) {//Dropdown selection
			browser.sleep(3000);
		});
		
		element(by.id("input3")).element(by.css("option:nth-child(2)")).click().then(function(arg0) {//Dropdown selection
			browser.sleep(3000);
		});
		
		expect(element(by.repeater("txn in transactions| filter: filterTxn | expenditurePayeeFilter:searchCriteria:'EXPENDITURE'")).element(by.css("td:nth-child(4)")).getText()).toBe("HouseRent");
		
		})
		
		
	})
	
	it("Verify search results count and fetch index", function() {
		browser.refresh();
		expect(element.all(by.repeater("txn in transactions| filter: filterTxn | expenditurePayeeFilter:searchCriteria:'EXPENDITURE'")).count()).toEqual(5);//Verify no of rows in a table.
		
		element.all(by.repeater("txn in transactions| filter: filterTxn | expenditurePayeeFilter:searchCriteria:'EXPENDITURE'")).get(2).getText().then(function(text) {//Get index of a row in a table and fetch text.
			console.log(text);
	})
})