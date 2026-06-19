package APIherokuapp;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class QueryParam {

    @Test(priority = 2)
    public void querypara() {

        RestAssured.baseURI = "https://gorest.co.in";

        HashMap<String, String> hash = new HashMap<>();

        hash.put("status", "active");
        hash.put("gender", "female");

        Response response =
                given()
//                    .basePath("/public/v2/users")
                    .header("Authorization",
                            "Bearer 930106ae6a31f061519580b2e08d8c7103cc3911b2123962bafd7c983b93fc45")
                    .header("Content-Type", "application/json")
                    .queryParams(hash)

                .when()
                    .get("/public/v2/users")

                .then()
                    .statusCode(200)
                    .extract().response();

//        response.prettyPrint();
    JsonPath js   = response.jsonPath();
 List<Integer>  allIds =  js.getList("id");
 List<Integer>  allNames  =js.getList("name");
    System.out.println(allIds);
    System.out.println(allNames);
    }
}