package notes;
public class WebserviceBasics {
	/*
	 * Webservice is an exposed API to the user through which users can perform the tasks same as in a UI.
	 * It can also be an exposed API by one application which is consumed by another application.
	 * Or in very general terms it is the method of communication between two devices over the network.
	 * API is a set of routines and protocols which enables communication and data exchange between two separate software systems.
	 * Example of API. User data from DB is given to external company using API instead of direct DB access. 
	 * When a request is sent from client to server it is a HTTP request in the form of JSON,XML,Text or HTML.
	 * The response from server to client is also a HTTP request in the form of JSON,XML,Text or HTML.
	 * There should be a medium to transfer HTTP request from client to server. This medium can be HTTP client or rest assured(Java library)
	 * HTTP client methods - HTTP Delete, HTTP Post, HTTP Get and HTTP Put.
	 * All these methods come under the library - org.apache.http.client.methods. We need to make objects of these classes to transfer data.
	 * HttpGet get = new HttpGet(uri);
	 * HttpPost post = new HttpPost(uri);
	 * HttpPut put = new HttpPut(uri);
	 * HttpDelete delete = new HttpDelete(uri);
	 * Hyper text means one text has the link of another text.
	 * Types of web services: SOAP and REST(Representational State Transfer).
	 * SOAP only supports XML data transfer while REST supports JSON,XML,HTML etc.
	 * REST is stateless(client state is not stored on server. Statelessness means that every HTTP request happens in complete isolation.
	 * When the client makes an HTTP request, it includes all information necessary for the server to fulfill that request.
	 * The server never relies on information from previous requests.)  
	 * As it is stateless, REST is fast compared to SOAP.
	 * API testing involves sending requests to server using restful web services(Rest assured java library functions), receiving response and comparing
	 * it with data in DB. If there is a match the test case passes.
	 * The purpose of API Testing is to check the functionality, reliability, performance, and security of the programming interfaces.
	 * It mainly concentrates on the business logic layer of the software architecture.
	 * Presentation layer (GUI), Business layer(API) and Database layer(DB).
	 * REST is a type of webservice. It is basically an architecture used to build web services that aim to be lightweight, maintainable and scalable.
	 * RESTful is a service which implements the architecture.
	 * REST Assured is a tool for testing and validating the response of REST services in Java.
	 * HTTP status codes
	 * Informational responses (100–199), Successful responses (200–299), Redirects (300–399), Client errors (400–499), Server errors (500–599).
	 * 200 OK
	 * 201 Created
	 * 204 No content
	 * 301 Moved permanently
	 * 400 Bad request
	 * 401 Unauthorized
	 * 404 Not found
	 * 409 Conflict
	 * 500 Internal server error.
	 * POST is used to create data in the server.
	 * GET is used to get data from the server.
	 * PUT is used to create and update data in the server. It creates a new resource if the mentioned resource does not exist.
	 * PUT request overwrites the existing json data with new data supplied.
	 * PATCH is used to update data in server only for the specified argument in JSON file. It does not creates a new resource if the mentioned resource does not exist
	 * Difference between PUT and PATCH.
	 * PUT updates the entire resource data while PATCH partially updates the data of a resource.
	 * PUT is idempotent while PATCH is not.
	 * JSON is human readable data format. It contains key value pair.
	 * GSON is a java API from Google that converts java objects to their JSON representations and vice-versa.
	 * More details on Gson API - http://tutorials.jenkov.com/java-json/gson.html
	 * For testing use : https://jsonplaceholder.typicode.com/
	 * JSON Formatter: https://jsonformatter.curiousconcept.com/
	 * JSON validater: https://jsonlint.com/
	 * JSON to Pojo classes: http://www.jsonschema2pojo.org/
	 * Different types of JSON data - https://opensource.adobe.com/Spry/samples/data_region/JSONDataSetSample.html#Example6
	 * POJO stands for Plain Old Java Object. It is an ordinary Java object, not bound by any special restriction other than those forced by the Java Language Specification and not requiring
	 * any class path. POJOs are used for increasing the readability and re-usability of a program.
	 * Serialization is a mechanism of converting the state of an object into a byte stream. 
	 * Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory.
	 * REST API tutorials - https://www.toolsqa.com/rest-assured/rest-api-automation-testing-framework/
	 * Interview questions:
	 * What is API; Give real time example.
	 * Status codes, Response validation, Tools used for manual and automation, root cause for API bug
	 * Designing test cases for API testing is same as we do for UI.
	 * Given a website how do you get API's to test? Using network tab in browser tool.
	 * For mobile apps we use proxy tools like Charles proxy to get API's
	 * https://www.guru99.com/web-services-interview-questions.html
	 * https://www.javatpoint.com/api-testing-interview-questions
	 * https://www.katalon.com/resources-center/blog/web-api-testing-interview-questions/
	 * https://www.guru99.com/rest-assured.html
	 * 
	 * API testing process:
	 * For GET call - 
	 * Create an instance of GsonBuilder class.
	 * From sample json data create a pojo class and mention its reference in the test case.
	 * Build the URL of get call and store in a string variable. Fixed URL+EndpointURL
	 * Make a get call using rest assured library methods.
	 * If response is as expected, populate/initialize the pojo class using .fromJson method.
	 * Write an assert statement to compare the actual results with expected results.
	 * Actual result will be from the pojo class and expected results will be from DB or excel.
	 * 
	 * For post call-
	 * Store payload data in excel or DB.
	 * Read it using a data provider.
	 * Pass it to the test case as an argument.
	 * In test case use payload data to initialize request pojo class.
	 * Now use JSONObject constructor, pass pojo class and convert pojo object to Json object.
	 * This jsonobject will now be passed to post api call.
	 * Create an instance of GsonBuilder class.
	 * Build the URL of post call and store in a string variable. Fixed URL+EndpointURL
	 * Make a post call using rest assured library methods. Pass URL and Json object.
	 * If response is as expected, populate/initialize the pojo class using .fromJson method.
	 * Write an assert statement to compare the actual results with expected results.
	 * Actual result will be from the response pojo class and expected results will be from request pojo class.
	 * 
	 * For put call-
	 * 
	 * 
	 * For patch call-
	 * 
	 * For delete call-
	 * 
	 * 
	 * Authentication is confirming the identity and authorization is restriction to perform operations.
	 * Login username and password are authentication.
	 * After login what modules user has access to is authorization.
	 * In API testing we generally use the term authorization instead of authentication. This is because API will provide user the authorization to access a 
	 * resource after authenticating the user.
	 * Type of Authentications:
	 * Basic
	 * Digest
	 * Form
	 * OAuth
	 * 
	 * Types of bugs API testing can find:
	 * Failure to handle error mechanism - Ex: Accessing resource that is not present OR accessing resource that does not exist or was never created.
	 * Missing or duplicate functionality.
	 * Performance issues.
	 * Functionality issues.
	 * 
	 * When a API request is sent and before a response is obtained following things happen.
	 * Server status is checked.
	 * API request is checked for correctness
	 * Headers and cookies are checked.
	 * Method type is checked.
	 * Paramaters are checked.
	 * Response is obtained.
	 * 
	 * Header types-Accept(response) and content type(request)
	 * 
	 * https://www.geeksforgeeks.org/monolithic-vs-microservices-architecture/
	 * Microservices - also known as the microservice architecture - is an architectural style that structures an application as a collection of services
	 * that are highly maintainable, testable, distributed and loosely coupled.
	 * What sets a microservices architecture apart from more traditional, monolithic approaches is how it breaks an app down into its core functions.
	 * Each function is called a service, and can be built and deployed independently, meaning individual services can function (and fail) without negatively
	 * affecting the others. This helps you to embrace the technology side of DevOps and make constant iteration and delivery (CI/CD) more seamless and
	 * achievable.
	 * Think of your last visit to an online retailer. You might have used the site’s search bar to browse products. That search represents a service.
	 * Maybe you also saw recommendations for related products—recommendations pulled from a database of shopper preferences. That’s also a service.
	 * Did you add an item to an online cart? You guessed it, another service.
	 * Advantages:
	 * Ready for market faster
	 * Highly scalable
	 * Resilient
	 * Easy to deploy
	 */
	

}
