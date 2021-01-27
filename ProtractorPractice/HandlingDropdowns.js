/**Dropdowns in angular apps can be handled in protractor in two ways:
 * Using element.all on options tag and then using each() to iterate and click.
 * Finding parent element(select tag) and chaining with child element using css.
 * 
 */

describe("Dropdowns", function() {
	function selectOperator(a,b,c){//Function takes argument a,b which are number. c is the operand(+,-,*,/,%).
		element(by.model("first")).sendKeys(a);//Enter 1st number
		element(by.model("second")).sendKeys(b);//Enter 2nd number
		
		element.all(by.tagName("option")).each(function(item) {//Get all elements matching tagname option and use each() to iterate on each item. Catch the item in function()
			item.getAttribute("value").then(function(value) {//For every option web element get the attribute value and its corresponding value
				if(value == c){//For each item check if it matches the argument passed. If yes click on it. Else iterate on next item in loop.
					item.click();
				}
			})
		})
	}
	
	function click(){//Function to click on Go button
		element(by.id("gobutton")).click();
	}
	
	function selectOperator1(a,b,op){//Same function as above but using locator chaining.
		element(by.model("first")).sendKeys(a);//Enter 1st number
		element(by.model("second")).sendKeys(b);//Enter 2nd number
		//element(by.model("operator")).element(by.css("option[value='"+op+"']")).click();//Argument reading in css same as in Java.
		element(by.model("operator")).element(by.css("option:nth-child("+op+")")).click();//Instead of value as in previous step here we can pass nth-child position as argument
	}
	
	it("Code optimization using demo", function() {
		browser.get('http://juliemr.github.io/protractor-demo/');
		//selectOperator(50,60,"MULTIPLICATION");
		//click();
		//selectOperator(20,30,"DIVISION");
		//click();
		//selectOperator(100,30,"SUBTRACTION");
		//click();
		
		selectOperator1(50,60,4);
		click();
		selectOperator1(20,30,2);
		click();
		selectOperator1(100,30,5);
		click();
		
		element.all(by.repeater("result in memory")).each(function(item) {
			item.element(by.css("td:nth-child(3)")).getText().then(function(text) {
				console.log(text);
			})
		})
	})
	
})

