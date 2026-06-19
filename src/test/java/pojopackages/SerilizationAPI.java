package pojopackages;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class SerilizationAPI {
	
	@Test
	public void jsonformat() throws IOException {
		
		RestAssured.baseURI="https://gorest.co.in";
		
//		FileInputStream fis1	= new FileInputStream("src\\test\\resources\\TestData\\data.json");
//	String rawData =	new String (Files.readAllBytes(Paths.get("src\\\\test\\\\resources\\\\TestData\\\\data.json")));
		
	String randomEmail= RandomStringUtils.randomAlphanumeric(8).toLowerCase() + "@gmail.com";
	
//	rawData =rawData.replace("{{email}}", randomEmail);
Pojoserial pojo	=new Pojoserial("navya","male",randomEmail,"active");
		
		given()
		.header("Authorization", "Bearer 930106ae6a31f061519580b2e08d8c7103cc3911b2123962bafd7c983b93fc45")
		.contentType(ContentType.JSON)
		.body(pojo)
		.when()
		.post("/public/v2/users")
		.then().log().all()
		.assertThat()
		.statusCode(201);
		
		
	}

}
