package pojopackages;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class LomBok {



	@Test
	public void jsonformat() throws IOException {




		RestAssured.baseURI="https://gorest.co.in";
		String randomEmail= RandomStringUtils.randomAlphanumeric(8).toLowerCase() + "@gmail.com";

		Pojolombok obj	=new  Pojolombok.PojolombokBuilder()
				.name("navya")
				.email(randomEmail)
				.status("active")
				.gender("male")
				.build();





		//Pojoserial pojo	=new Pojoserial("navya","male",randomEmail,"active");

		given()
		.header("Authorization", "Bearer 930106ae6a31f061519580b2e08d8c7103cc3911b2123962bafd7c983b93fc45")
		.contentType(ContentType.JSON)
		.body(obj)
		.when()
		.post("/public/v2/users")
		.then().log().all()
		.assertThat()
		.statusCode(201);
	}

}
