/**First test case for framework practice.
 * Set up and tear down methods similar to before class and after class in testNG.
 */

describe("Test case to demo page object, jasmine concepts, data provider", function() {
	var obj = require("./Calculator.js");//Connecting to page object
	var obj1 = require("./data.js");//Connecting to data provider file
	var using = require('jasmine-data-provider');//Connecting to jasmine data provider dependency.
	beforeEach(function() {//Runs once before running any specs.
		console.log("Fetching URL...");
		obj.getURL();
	})
	afterEach(function() {//Runs once after running all specs.
		console.log("Closing browser...");
	})
	
	//Spec has been wrapped inside using block for parameterization.
	//The object variable connecting data file should be specified inside using. Here it is obj1.
	//data is the sub object in data file.  description is the actual test data.
	using(obj1.Datadriven, function (data, description){
		it("Test", function() {
			
			obj.firstinput.sendKeys(data.firstInput);
			obj.secondinput.sendKeys(data.secondInput);
			obj.goButton.click();
			
			obj.result.count().then(function(text) {
				console.log("Result row count: "+text);
			})
			
			obj.result.each(function(item) {//Unable to read item.element from other file.
				item.element(by.css("td:nth-child(3)")).getText().then(function(text) {//Now the element search scope will be within element.all(by.repeater("result in memory"))
					console.log(text);
					expect(text).toBe(data.result);
				})
			})
		})
	});

	
	it("Adding another test to verify before each and after each concepts", function() {
		console.log("I am 2nd test case");
	})
	
})