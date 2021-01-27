/**
 * Functions cannot be inside it. They should be outside it and inside describe.
 */

describe("Functions demo", function() {
	function add(a,b){
		element(by.model("first")).sendKeys(a);
		element(by.model("second")).sendKeys(b);
	}
	
	function click(){
		element(by.id("gobutton")).click();
	}
	
	it("Code optimization using demo", function() {
		browser.get('http://juliemr.github.io/protractor-demo/');
		add(50,60);
		click();
		add(20,30);
		click();
		
		element.all(by.repeater("result in memory")).each(function(item) {
			item.element(by.css("td:nth-child(3)")).getText().then(function(text) {
				console.log(text);
			})
		})
	})
})