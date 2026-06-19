//package APIherokuapp;
//
//import static org.testng.Assert.assertEquals;
//
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//
//import static io.restassured.RestAssured.*;
//
//
//public class ContactsAPITest {
//
//	@BeforeMethod
//	public void setUp() {
//		RestAssured.baseURI= "https://thinking-tester-contact-list.herokuapp.com";
//	}
//
//	//	@Test
//	//	public void getContactDetails() {
//	//		
//	//	Response rs	=given()
//	//		.header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2YTE2ZTc4MzdhMWY4YjAwMTUzYzhhZGYiLCJpYXQiOjE3Nzk4ODYwNzN9.XyBN1G3LnjUr6BiLrZieH3EGVtF7pK3LIC9S_eANgJo")
//	//		.when()
//	//		.get("/contacts");
//	//	System.out.print(rs.statusCode());
//	//	System.out.println(rs.statusLine());
//	//	assertEquals(rs.statusCode(), 200);
//
//	//	rs.prettyPrint();
//	//		.then()
//	//		.assertThat()
//	//		.statusCode(200)
//	//		.and()
//	//		.contentType(ContentType.JSON);
//
//	//rilafok443@marineso.com
//
//	//	}
//
////	@Test
////	public void getContactwrong() {		
////		Response rs	=given()
////				.header("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2YTE2ZTc4MzdhMWY4YjAwMTUzYzhhZGYiLCJpYXQiOjE3Nzk4ODYwNzN9.XyBN1G3LnjUr6BiLrZieH3EGVtF7pK3LIC9S_eANgJo")
////						.when()
////				.delete("/6a16ed31c3268b0015af5ae6");
////				
////				.assertThat()
////			.statusCode(200)
////			.and()
////			.contentType(ContentType.JSON);
////			
////		//rilafok443@marineso.com
////
////		System.out.println(rs.statusCode());
////	}
////
////}
