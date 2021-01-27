//All key pair values. Should be separated by comma.
var Jasmine2HtmlReporter = require('protractor-jasmine2-html-reporter');
exports.config = {
		seleniumAddress: 'http://localhost:4444/wd/hub',
		specs: ['TC001.js'],
		capabilities: {
			  'browserName': 'chrome'
			},
onPrepare : function(){//Jasmine concept. Runs before every spec mentioned in config file.
	//We use this section to maximize window, initialize reports, launch URL etc.
	//In case every test is non angular we can use this to declare non angular false statement.
	browser.driver.manage().window().maximize();
	jasmine.getEnv().addReporter(//HTML reporter code
	        new Jasmine2HtmlReporter({
	          savePath: 'target/screenshots'
	        })
	      );
	
},

suites: {//Define test cases to run as a suite. Multiple suites can be defined. Don't forget to add a command in package.json.
	Regression : ['Actions.js','FillingForms.js'],
	Smoke : 'Alerts.js'
},

jasmineNodeOpts: {
    showColors: true, // Use colors in the command line report.
  }

};