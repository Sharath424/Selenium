package Admin_todos;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateTodos {
  @Test
  public void Create_todos() {
	  

		JSONObject body = new JSONObject();
		body.put("title", "Selenium");
		body.put("description", "Automation testing");
	  
		given().
		baseUri("http://localhost:8081/api/v1/todos").contentType(ContentType.JSON).body(body.toString()).
		auth().preemptive().oauth2("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTY4OTI4NTU1NSwiaWF0IjoxNjg5MTM1NTU1fQ.X5mPKqzMNAehAc_eSesA4RW9i_Fgtubn5HJJbFfnVtuiscNm2qe8PQIKYIe10mLrXzgdbBBk3T1GfTpjNQyg5A").
		when().
		post("").
		then().log().all().
		statusCode(201);

  }
}
