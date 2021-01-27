describe("Window handling", function() {
	it("Switching between parent and child window", function() {
		browser.waitForAngularEnabled(false);//As of now using non-angular website
		browser.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		browser.driver.manage().window().maximize();
    	browser.getTitle().then(function(title) {
    		console.log(title+" title of the page before switching.")
    	})
        element(by.id("opentab")).click();
        browser.getAllWindowHandles().then(function(handles) {
        	
        	browser.switchTo().window(handles[1]);
        	browser.getTitle().then(function(title) {
        		console.log(title+" title of the page after switching.")
        		browser.sleep(3000);
        	})
        	
        	browser.switchTo().window(handles[0]);//Switch back to parent window
        	browser.getTitle().then(function(title) {
        		console.log(title+" title of the page after switching back to parent")
        	})
        })
	})
})