describe("ProtoCommercePractice", function() {
	it("Error messages verification", function() {
		browser.driver.manage().window().maximize();
		browser.get('https://qaclickacademy.github.io/protocommerce/');
		expect(element(by.css("div[class='jumbotron']>:nth-child(1)")).getText()).toBe("Protractor Tutorial");
		element(by.name("name")).sendKeys("A");//Enter single character and tab to next field to see the error message after next step.
		element(by.css("input[name='email']")).sendKeys("");
		expect(element(by.cssContainingText("div[class='alert alert-danger']","Name should be at least 2 characters")).getText()).toBe("Name should be at least 2 characters");
		element(by.id("exampleInputPassword1")).sendKeys("password2");
		expect(element(by.cssContainingText("div[class='alert alert-danger']","Email is required")).getText()).toBe("Email is required");
		element(by.css("input[type='checkbox']")).click();
		element(by.cssContainingText("select[id='exampleFormControlSelect1'] option", "Female")).click();
		element.all(by.name("inlineRadioOptions")).first().click().then(function(arg0) {
			browser.sleep(3000);
		});
		element(by.buttonText('Submit')).click();
			element(by.css("div[class*='success']")).getText().then(function(text) {
				//console.log("Watch this: "+text);
				var str = text;
				var str1 = str.slice(2);//Removes characters from 0 to 2 and return remaining characters as string.
				expect(str1).toBe("Success! The Form has been submitted successfully!.");
			})
		
	})
})