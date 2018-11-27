package configs;

import org.testng.asserts.SoftAssert;

public class ProjectConfigs {
	
	// Base URI
	private static String baseURI = "https://dog.ceo";
	// SoftAssert object, to allow all tests to run without stopping if there is a fail.
	private SoftAssert softAssert = new SoftAssert();
	
	/*
	 * The following statements allow for re-usability and eliminate repetitive declarations
	 */
	
	// return baseURI
	public String getBaseURI() {
		return baseURI;
	}
	
	// return an assert object
	public SoftAssert softAssert() {
		return softAssert;
	}
}
