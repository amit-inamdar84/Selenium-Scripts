/**
 * Page object for calculator Angular website
 */
function calculator() {
	this.firstinput = element(by.model("first"));
	this.secondinput = element(by.model("second"));
	this.goButton = element(by.id("gobutton"));
	this.result = element.all(by.repeater("result in memory"));
	this.individualresult = function(){
		element(by.css("td:nth-child(3)"));
	}
	this.getURL = function() {
		browser.get("http://juliemr.github.io/protractor-demo/");
	}
};
module.exports = new calculator();