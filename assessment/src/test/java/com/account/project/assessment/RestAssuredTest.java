package com.account.project.assessment;

import org.junit.BeforeClass;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class RestAssuredTest {

    public static Response response;
    public static String jsonAsString;

    @BeforeClass
    public static void setupURL()
    {
        // here we setup the default URL and API base path to use throughout the tests
        RestAssured.baseURI = "http://yourwebsiteaddress.com";
        RestAssured.basePath = "/api/yourapi/";
    }

    @BeforeClass
    public static void callRidesAPI()
    {
        // call the rides API, the full address is "http://yourwebsiteaddress.com/api/yourapi/rides",
        // but we set the default above, so just need "/rides"
        response = 
            when().
                get("/rides").
            then().
                contentType(ContentType.JSON).  // check that the content type return from the API is JSON
            extract().response(); // extract the response

        // We convert the JSON response to a string, and save it in a variable called 'jsonAsString'
        jsonAsString = response.asString();
    }

	private static RestAssured when() {
		// TODO Auto-generated method stub
		return null;
	}
}