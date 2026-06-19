package APIherokuapp;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class APIghorestjson {
	
	
	
    @Test(priority = 1)
	public void jsonformat() throws IOException {
    	
        System.out.println("TEST EXECUTED");

		
		RestAssured.baseURI="https://gorest.co.in";
		
//		FileInputStream fis1	= new FileInputStream("src\\test\\resources\\TestData\\data.json");
	String rawData =	new String (Files.readAllBytes(Paths.get("src\\\\test\\\\resources\\\\TestData\\\\data.json")));
	String randomEmail= RandomStringUtils.randomAlphanumeric(8).toLowerCase() + "@gmail.com";
	rawData =rawData.replace("{{email}}", randomEmail);
		
		given()
		.header("Authorization", "Bearer 930106ae6a31f061519580b2e08d8c7103cc3911b2123962bafd7c983b93fc45")
		.contentType(ContentType.JSON)
		.body(rawData)
		.when()
		.post("/public/v2/users")
		.then().log().all()
		.assertThat()
		.statusCode(403);
		
		
	}

}
