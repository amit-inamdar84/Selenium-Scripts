/**
 * Unable to handle promise inside a function and return the value. Need to revisit later.
 */
describe("Verifying items in cart and summing up to match the total", function() {
	function selectItem(product) {//Function to compare product text and click based on text.
		element.all(by.tagName("app-card")).each(function(item) {//Locate all elements by tag name app card and iterate on each item
			item.element(by.css("h4 a")).getText().then(function(text) {//Under that scope for each item locate css with h4 a and get its text.
				if(text == product){
					//browser.sleep(3000);
					item.element(by.buttonText("Add")).click();
				}
			})
		})
	}
	
	let myPromise = new Promise(function verifyCartTotalPrice(){//Function to loop over rows(cart items) in web table fetch price in column, sum it up and compare with total price.
		var str = 0;
		element.all(by.css("table[class='table table-hover'] tbody tr>:nth-child(4) strong")).each(function(item) {
			
			item.getText().then(function(text) {
				console.log(text,"...text");
				str = str+Number(text.slice(2));
				console.log("Total: "+str);
			})
		})
		return str;
	});
	it("Verifying items in cart and summing up to match the total", function() {
		browser.driver.manage().window().maximize();
		browser.get('https://qaclickacademy.github.io/protocommerce/');
		expect(element(by.css("div[class='jumbotron']>:nth-child(1)")).getText()).toBe("Protractor Tutorial");
		element(by.linkText("Shop")).click();
		selectItem("Nokia Edge");
		selectItem("iphone X");
		element(by.partialLinkText("Checkout")).getText().then(function(text) {
			//console.log(text);
			var str1 = text.slice(10);//Removes characters from 0 to 10 and return remaining characters as string.
			expect(str1.slice(1, 2)).toBe("2");//Removes characters from 1 to 2 and return remaining characters as string.
		})
		element(by.partialLinkText("Checkout")).click();
		expect(element(by.cssContainingText("a[href='#']","ProtoCommerce Home")).getText()).toBe("ProtoCommerce Home");
		//var str = verifyCartTotalPrice();
		myPromise.then(function(str) {
			console.log("Trial: "+str);
		})
		//console.log(str,"...final");
		//expect(str).toEqual(165000);
		
	})
})