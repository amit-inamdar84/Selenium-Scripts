describe("ProtoCommercePractice", function() {
	it("Form Submission in Angular Website", function() {
		browser.driver.manage().window().maximize();
		browser.get('https://qaclickacademy.github.io/protocommerce/');
		expect(element(by.css("div[class='jumbotron']>:nth-child(1)")).getText()).toBe("Protractor Tutorial");
		element(by.name("name")).sendKeys("ABC");
		element(by.css("input[name='email']")).sendKeys("ABC@gmail.com");
		element(by.id("exampleInputPassword1")).sendKeys("password2");
		element(by.css("input[type='checkbox']")).click();
		//Protractor specific locator - cssContainingText - Takes 2 arguments - Locator mechanism and text.
		//This is useful when same locator have more than one node and we need to identify by its text.
		element(by.cssContainingText("select[id='exampleFormControlSelect1'] option", "Female")).click();
		element.all(by.name("inlineRadioOptions")).first().click().then(function(arg0) {
			browser.sleep(3000);
		});
		element(by.buttonText('Submit')).click();
			element(by.css("div[class*='success']")).getText().then(function(text) {
				//console.log("Watch this: "+text);
				var str = text;
				var str1 = str.slice(2);//Remove unwanted characters and spaces from text and compare with expected text that makes sense.
				expect(str1).toBe("Success! The Form has been submitted successfully!.");
			})
		
	})
})