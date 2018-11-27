package APIAutomatedTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.Test;

import configs.ProjectConfigs;

public class BreedSublist {
	
	ProjectConfigs config = new ProjectConfigs();
	
	@Test
	public void getRetrieverSublist() {
		RestAssured.baseURI = config.getBaseURI();
		
		RequestSpecification httpRequest = RestAssured.given();
		

        // Making GET request directly by RequestSpecification.get() method
		Response response = httpRequest.get("/api/breed/retriever/list");
		
		//Retrieving Body of response
		String body = response.getBody().asString();
		//Retrieving Status Code of response
		int status = response.getStatusCode();
		//Retrieving Status Line
		String statusLine = response.getStatusLine();
		
		//Printing the response
		System.out.println("\nResponse Body is "+body);
		System.out.println("Status line is "+statusLine);
		
		// Assert by status code
		config.softAssert().assertTrue(status == 200);
	}
}
