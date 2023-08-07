package Admin_todos;

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
		auth().preemptive().oauth2("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTY4OTI4NTU1NSwiaWF0IjoxNjg5MTM1NTU1fQ.X5mPKqzMNAehAc_eSesA4RW9i_Fgtubn5HJJbFfnVtuiscNm2qe8PQIKYIe10mLrXzgdbBBk3T1GfTpjNQyg5A").
		when().
		get("").
		then().log().all().
		statusCode(200);


  }
}
