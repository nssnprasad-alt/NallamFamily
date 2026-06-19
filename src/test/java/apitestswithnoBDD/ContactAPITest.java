package apitestswithnoBDD;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test
public class ContactAPITest {
	
	public void getContactsTests() {
		
		RestAssured.baseURI= "https://thinking-tester-contact-list.herokuapp.com";
		
	RequestSpecification request	=RestAssured.given();
	request.header("Authorization","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2YTE2ZTc4MzdhMWY4YjAwMTUzYzhhZGYiLCJpYXQiOjE3Nzk4ODYwNzN9.XyBN1G3LnjUr6BiLrZieH3EGVtF7pK3LIC9S_eANgJo");
	   Response response  =  request.get("/contacts");
	   
	   System.out.println(response.statusCode());
	  System.out.println (response.statusLine());
	  Assert.assertEquals(response.statusCode(), 200);
	  Assert.assertTrue(response.time()<6000);
	  
	  response.prettyPrint();
	
	
	
	}

}
