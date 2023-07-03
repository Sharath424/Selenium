package User_todos;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import org.json.JSONObject;
import org.testng.Assert;

public class UserTodos {
	@Test
	public void login() {

		JSONObject body = new JSONObject();
		body.put("userName", "user1");
		body.put("userPassword", "user@123");

		
		
 given().baseUri("http://localhost:8081").contentType(ContentType.JSON).body(body.toString()).
when()
				.post("/authenticate").then().log().body().statusCode(200);



		
	}

	
	
	
}
