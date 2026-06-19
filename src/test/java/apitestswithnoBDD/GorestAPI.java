package apitestswithnoBDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GorestAPI {
	
	@Test
	public void ghorestapiget() {
		
		RestAssured.baseURI="https://gorest.co.in";
	RequestSpecification request =	RestAssured.given();
	request.headers("Authorization","930106ae6a31f061519580b2e08d8c7103cc3911b2123962bafd7c983b93fc45");
	Response response =request.get("/public/v2/users");
	System.out.println(response.statusCode());
	
	}

}
