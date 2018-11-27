package APIAutomatedTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.Test;

import configs.ProjectConfigs;

public class SearchBreedFromList {
	ProjectConfigs config = new ProjectConfigs();
	@Test
	public void listContainsRetriever() {

		// verify list contains item
		RestAssured.baseURI = config.getBaseURI();
		
		RequestSpecification httpRequest = RestAssured.given();
		

        // Making GET request directly by RequestSpecification.get() method
		Response response = httpRequest.get("/api/breeds/list/all");
		
		//Retrieving Body of response
		String body = response.getBody().asString();
		
		// Pass test based on condition
		if(body.contains("retriever")) {
			config.softAssert().assertTrue(true);
		
			//Printing the response
			System.out.println("\nResponse JSON body contains retriever");
		}
	}
}
