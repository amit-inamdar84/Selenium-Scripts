package notes;
//https://www.youtube.com/playlist?list=PLhW3qG5bs-L-oT0GenwPLcJAPD_SiFK3C
//https://www.blazemeter.com/blog/how-use-postman-manage-and-execute-your-apis
//Postman is a API client that makes it easy for developers to create, share, test and document APIs. This is done by allowing users to create and save simple and complex HTTP/s requests, as well as read their responses.
//Collections allow you to group together several APIs that might be related or perhaps should be executed in a certain sequence.
//When creating a collection, we can specify login credentials which are used by all API;s in that collection. No repetition of login credentials.
//In order to run a Postman Collection you will need to use a feature called ‘Collection Runner’.
//In Postman GUI, in the top left corner of the screen, click the ‘Runner’ button. 
//Select the relevant Collection and click Run button at the bottom.

//We send request for a POST call, get response in JSON format, select a event id and make another post call with that event id to verify if the response is correct.
//We receive end point URL's to test. Need to send get calls obtain keys from response in JSON form and paste the same key in post calls to get corresponding info.
//Variables in postman can be specified at collection level and environment level.
//Click on 3 dots in collections and select edit. Provide a variable name and some commonly used url. Next time instead of entire url we can use only the
//variable in api calls. To use the variable specify {{variable}}/endpoint URL.
//Environment variables help us to define endpoint, username, password etc for a specific environment. Instead of hard coded values we can use variables so that
//if these values change, we can only change environment variable values in settings instead of changing in all scripts.
//After running test if we want to see the values being used in variables go to View>>Show Postman Console
//Pre-request scripts are javascripts that are executed before before the request is sent.
//Tests are javascript code that are executed after receiving the response. These tests can be created at collection,folder and request level.
//Tests can be loaded from ready to use snippets provided by Postman.
//Notes on postman test scripts: https://learning.postman.com/docs/writing-scripts/test-scripts/
//Apart from postman console, Developer console can also be used for debugging - View>>Developer>>Show dev tools(current view)

//Newman documentation: https://www.npmjs.com/package/newman
//Newman command line runner
//Newman is command line collection runner for Postman.
//Newman runner installation steps: 
//Install node.js;
//Open cmd and Confirm installation using commands: node -v and npm -v
//Install newman using command: npm install -g newman
//Export collection as json file and save in XYZ folder.
//In cmd, go to the location XYZ where collection file is saved.
//Run command: newman run Collection1.json. where Collection1.json is the file saved in previous step.
//Now the test results are displayed in cmd.
//Use newman run -h command to see various options that can be used with newman runner.

//Postman integration with Jenkins:
//Create a new free style project in Jenkins.
//In the project configure section go to Build section, select add build step as Execute windows batch command.
//Enter these commands - D:
//cd D:\Postman Newman Runner File
//newman run Collection1.json
//Click apply and save.
//Just create a build and watch console output for test results.

//Workspace in postman is an area where you can group, organize and manage your collections.
//Click on arrow at the top middle to search, edit, rename workspace. Also clicking on "All workspaces" button will show complete workspace details and
//lot of configuration options for workspace in a browser. The same can also be done by clicking Browse button at the bottom right panel of postman app.

//Reading variables from CSV and Json file
//Instead of defining variable at collection or environment level, define in a CSV file.
//In the request use variables wherever required and whose values are defined in CSV. Ex: {{url}} etc.
//Now run the request as a collection. In the collection runner window, select environment, iterations(should equal no of rows in CSV), Select CSV file
//(Do a preview to verify values formatting), check the box Save responses, and click on Run button in blue color.
//Prepare similar data in json file and repeat above steps. The request should take data variable data from json file.

//Reading test data from CSV and Json file
//The process is same as above mentioned for variables. Only exception is that in pre-request scripts and test scripts to refer data variable from file
//we need to specify as data.url or data["url"]

//Running postman collection remotely
//Install newman and node js in remote machine.
//Open cmd and use command - newman run https://www.getpostman.com/collections/3d45138c9810ee0f7889

//Extract response and refer in further request. API chaining
//Make a GET request and observe the response. Select a value from response to pass to PUT request.
//Use this code in GET request's test section - 
//bodyData = JSON.parse(responseBody) - This line will parse the response body and store in a variable.
//value = bodyData.data[3].name - Using JSON path finder(https://jsonpathfinder.com/) get the path of required value in previous response and store in variable.
//console.log(value); - Print the value
//pm.environment.set("Username",value); - Set the environment variable with the value extracted in previous step.
//Prepare a PUT request with body. In the body, use the environment variable to pass a payload.
//{
//"name": "{{Username}}",
//"job": "zion resident"
//}
//Send the PUT request. The response should contain the value extracted and passed as payload. This will basically update an existing record.

//Authorization in postman (Still more practice is required on authorization using postman and rest assured)
//Go to Github API's - https://developer.github.com/v3/
//Create a request in postman using https://api.github.com as URL
//Go to https://developer.github.com/v3/repos/#create-a-repository-for-the-authenticated-user. Use /user/repos as endpoint for creating a new repository.
//This is a POST request.
//Copy the name parameter's body and paste in the POST request in postman.
//Go to github web UI>>Settings>>Developer settings>>Personal access tokens>>Generate new token. Use new token to login and access a resource instead of a password.
//In postman, open the request and go to Authorization tab, select type as OAuth 2.0.
//Paste the generated token in in Access Token text box. Click Save.
//Click send and observe the response. Check Github home page and new repository should be created.
//If we want to use same token for entire collection we can define the token in authorization tab at collection level or at request level.
//Token must not be hardcoded and shared. In order to achieve this, define a token environment variable and use the reference in requests.
//While defining as environment variable, use current value section and not initial value(visible to other users)

public class postmanNotes {
	//In edit collection section, add a variable with a key and value. This can be reused for all API's in the collection if it is commonly used.
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
	
	//We can set and get environment variables as below using postman test tab or pre-request tab.
	//pm.environment.set("Test","ABC");
	//console.log(pm.environment.get("Test"));
	
	//Clearing variables
	//pm.environment.unset("variable_key");
	//pm.globals.unset("variable_key");
	
	//Logging options
	//console.log(), console.info(), console.warn(), console.error().
	
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
	
	
	//Postman versus Rest assured
	//For testing rest API services Rest assured is preferred over Postman because of less maintenance and efficiency.
	//Code reusability can be done in REST-assured as it is a Java client. But can’t be done in Postman.
	//As there are a lot of open source reporting tools. We can customize reports for the REST-assured. But where in Postman doesn’t allow us to customize the reports
	//For Postman automation runner we can provide only with one data file for each collection. But for REST-assured there is no limitation for this.


}
