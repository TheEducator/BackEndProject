package steps;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import utils.Common;

public class APIAuthenticationSteps {
	/**
	 * Please import the following import static io.restassured.RestAssured.*; - you
	 * need to manually type it
	 */

	/** Declaring global and static variables */

	private Response response;
	public static String Token;
	private static RequestSpecification request;
	/**
	 * Assigning /generateToken.php URI to a String with variable name
	 * 'generateTokenURI'
	 */
	String generateTokeURI="http://54.167.125.15/syntaxapi/api/generateToken.php";
	/**
	 * Here is our Background 'Given' which will always run prior to any scenario we
	 * execute
	 */
	@Given("user generates token")
	public void user_generates_token() {
		/**
		 * Using given() method to set our header and assigning it to 'request' which
		 * returns RequestSpecification(we declared this as a static variable )
		 */
	    request = given().header("Content-Type","application/json");
	    /**
		 * Using request.log().all() methods to print out all information that is being
		 * sent as a request This is just for you to visually see what log().all() does
		 * - you can cancel out
		 */

		// System.out.println(request.log().all());

		/**
		 * Reading JSON File stored in JSONFiles folder using public static readJson()
		 * method stored in common methods for now -- we will store this common method
		 * in different location next class then pass path of your generateToken.json
		 * file as String argument then immediately use .when() to hit generateTokenURI
		 * API by using post() and then storing into 'response' which returns 'Response'
		 * (We declared this as a global variable) Please note this is all in one
		 * statement
		 */
	    
	    response=request.body(Common.readJson(System.getProperty("user.dir")+
	    		"/src/test/resources/JSONFiles/generateToken.json")).when().post(generateTokeURI);
	    /**
		 * Using prettyPrint() method so you can see your payload in generateToken.json
		 * file which was converted to a String in previous step
		 */

		// System.out.println(response.prettyPrint());

		/**
		 * Our JSON payload was converted to a String and stored into 'response' so now
		 * we will use response.jsonPath().getString("token") this will grab the String
		 * that is paired with 'token' in the response, we then stored our token into
		 * 'Token'(We declared this as a Static variable) BUT "Bearer(space)" was added
		 * and concatenated with response.jsonPath().getString("token") to ensure
		 * 'Bearer' keyword is stored with our token
		 */
	   	   
	   Token="Bearer "+response.jsonPath().get("token");
	   /**
		 * Printing out stored 'Token'(optional)
		 */
		// System.out.println(Token);
	}

}
