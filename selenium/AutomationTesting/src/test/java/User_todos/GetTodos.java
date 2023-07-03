package User_todos;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;


public class GetTodos {
  @Test
  public void GetTodos() {
	  
//		JSONObject body = new JSONObject();
//		body.put("id", "8");
//		body.put("description", "learn Selenium");
//		body.put("title", "Automation testing");
//
//		File file = new File("resources/login.json");



		
		given().
		baseUri("http://localhost:8081/api/v1/todos").
		auth().preemptive().oauth2("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTY4ODUxNTM2MSwiaWF0IjoxNjg4MzY1MzYxfQ.B4woKA-8xB70-n0JCkOXDxopWDzFldxKkqsMWBVgFQxXUMZ3Kirqln2NIlZBVO33HznqaIKGB-TYqvR45rFewg").
		when().
		get("").
		then().log().all().
		statusCode(200);


  }
}
