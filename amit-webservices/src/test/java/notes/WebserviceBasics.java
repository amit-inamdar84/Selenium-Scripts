package notes;
//https://www.guru99.com/rest-assured.html
public class WebserviceBasics {
	/*
	 * Webservice is an exposed API to the user through which users can perform the tasks same as in a UI.
	 * It can also be an exposed API by one application which is consumed by another application.
	 * Or in very general terms it is the method of communication between two devices over the network.
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
	 * Types of web services: SOAP and REST.
	 * SOAP only supports XML data transfer while REST supports JSON,XML,HTML etc.
	 * REST is stateless(client state is not stored on server) and is fast compared to SOAP.
	 * API testing involves sending requests to server using restful web services(Rest assured java library functions), receiving response and comparing
	 * it with data in DB. If there is a match the test case passes.
	 * HTTP status codes
	 * 200 OK
	 * 201 Created
	 * 204 No content
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
	 * POJO stands for Plain Old Java Object. It is an ordinary Java object, not bound by any special restriction other than those forced by the Java Language Specification and not requiring
	 * any class path. POJOs are used for increasing the readability and re-usability of a program.
	 * Serialization is a mechanism of converting the state of an object into a byte stream. 
	 * Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory.
	 * 
	 */
	

}
