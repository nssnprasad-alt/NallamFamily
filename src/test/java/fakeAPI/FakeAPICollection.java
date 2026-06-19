package fakeAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class FakeAPICollection {
	
	
	@Test
	public void fakeapi() {
		
		RestAssured.baseURI="https://fakestoreapi.com";
		
		Response response=given()
		.when()
		.get("/products");
		
		System.out.println(response.statusCode());
		
	JsonPath js	=response.jsonPath();
	List<Integer> Ids =js.getList("id");
	
	System.out.println(Ids);
	
	List<Integer> all=js.getList("rating.rate");
	System.out.println(all);
	
	
	for(int i=0; i<Ids.size(); i++) {
		
		Object obj=all.get(i);
		
		System.out.println(obj + "nallam");
	}
	
	
	
		
		
	}

}
