package Admin_users;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateUsers {
  @Test
  public void Create_todos() {
	  

		JSONObject body = new JSONObject();
		body.put("userName", "user");
		body.put("userFirstName", "user23");
		body.put("userLastName", "3");
		body.put("userPassword", "user@123");
		
		
	  
		given().
		baseUri("http://localhost:8081/user").contentType(ContentType.JSON).body(body.toString()).
		auth().preemptive().oauth2("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTY4ODUxMzMwOSwiaWF0IjoxNjg4MzYzMzA5fQ.drhn2sD3cwMeAp6LChHJ7bV4bs16aJJs30QKm0p6uFFGtF5J1MFmAoEWENN2DZBuTXXzPDkiS4B1PUq78mRDgg").
		when().
		post("").
		then().log().all().
		statusCode(201);

  }
}
