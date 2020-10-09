package notes;
//https://www.youtube.com/playlist?list=PLhW3qG5bs-L-oT0GenwPLcJAPD_SiFK3C
//https://www.blazemeter.com/blog/how-use-postman-manage-and-execute-your-apis
//Postman is a API client that makes it easy for developers to create, share, test and document APIs. This is done by allowing users to create and save simple and complex HTTP/s requests, as well as read their responses.
//Collections allow you to group together several APIs that might be related or perhaps should be executed in a certain sequence.
//In order to run a Postman Collection you will need to use a feature called ‘Collection Runner’.
//In Postman GUI, in the top left corner of the screen, click the ‘Runner’ button. 
//Select the relevant Collection and click Run button at the bottom.
//HTTP requests: GET, POST, DELETE, PUT
//Get call does not require any payload.
//Post call requires payload.
//JSON request/response is a key value pair.
//We send request for a POST call, get response in JSON format, select a event id and make another post call with that event id to verify if the response is correct.
//We receive end point URL's to test. Need to send get calls obtain keys from response in JSON form and paste the same key in post calls to get corresponding info.
//Click on 3 dots in collections and select edit. Provide a variable name and some commonly used url. Next time instead of entire url we can use only the
//variable in api calls. To use the variable specify {{variable}}/endpoint URL. Variables can be specified at environment level as well.
//Environment variables help us to define endpoint, username, password etc for a specific environment. Instead of hard coded values we can use variables so that
//if these values change, we can only change environment variable values in settings instead of changing in all scripts.
//Pre-request scripts are javascripts that are executed before before the request is sent.
//Tests are javascript code that are executed after receiving the response. These tests can be created at collection,folder and request level.
//Postman versus Rest assured
//For testing rest API services Rest assured is preferred over Postman because of less maintenance and efficiency.
//Code reusability can be done in REST-assured as it is a Java client. But can’t be done in Postman.
//As there are a lot of open source reporting tools. We can customize reports for the REST-assured. But where in Postman doesn’t allow us to customize the reports
//For Postman automation runner we can provide only with one data file for each collection. But for REST-assured there is no limitation for this.

public class postmanNotes {
	//In edit collection section, add a variable with a key and value. This can be reused for all API;s in the collection if it is commonly used.
	//For ex: url = https://test.in. When sending a API request use {{url}}/endpoint.
	
	//To be written in tests tab of API call. Or can be written in tests tab of edit collection
	//Set and get collection level variables: 
	//console.log("Hello world");
	//let urlVar = pm.variables.get("url");
	//console.log(urlVar);
	//pm.variables.set("name","POSTMAN");
	//console.log(pm.variables.get("name"));
	
	//Set and get global variables
	//let globe = pm.globals.get("Env");
	//console.log(globe);
	//pm.globals.set("Env1","Test");
	//console.log(pm.globals.get("Env1"));
	
	//We can set and get environment variables as below using command line
	//pm.environment.set("Test","ABC");
	//console.log(pm.environment.get("Test"));
	
	//Clearing variables
	//pm.environment.unset("variable_key");
	//pm.globals.unset("variable_key");
	
	//Few tests for interview purpose
/*	pm.test("Status code is 200", function () {
	    pm.response.to.have.status(200);
	});

	pm.test("Response time is less than 200ms", function () {
	    pm.expect(pm.response.responseTime).to.be.below(200);
	});

	pm.test("Body matches string", function () {
	    pm.expect(pm.response.text()).to.include("token");
	});

	pm.test("Body is correct", function () {
	    pm.response.to.have.body('{"id":4,"token":"QpwL5tke4Pnpja7X4"}');
	});*/


}
