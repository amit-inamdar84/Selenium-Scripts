//First parameter - Test suite name; Second parameter - function() - Will have one or multiple tests/it blocks
describe('First ever javascript test suite', function() {
	it('Open angular web app', function() {
		browser.get('https://angularjs.org');
		browser.get('http://juliemr.github.io/protractor-demo/').then(
				function() {
					browser.sleep(5000);
					console.log("I am the last step to execute");
				})
	})

	// Each it block will be called as a spec
	it('Close browser', function() {
		// Write code here

	})

})