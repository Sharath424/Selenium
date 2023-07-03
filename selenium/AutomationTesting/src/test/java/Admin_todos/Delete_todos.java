package Admin_todos;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Delete_todos {
  @Test
  public void delete_todos_id() {
	  
		JSONObject body = new JSONObject();
		body.put("title", "Selenium");
		body.put("description", "Automation testing");
	  
		given().
		baseUri("http://localhost:8081/api/v1/todos").contentType(ContentType.JSON).body(body.toString()).
		auth().preemptive().oauth2("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTY4ODUxMzMwOSwiaWF0IjoxNjg4MzYzMzA5fQ.drhn2sD3cwMeAp6LChHJ7bV4bs16aJJs30QKm0p6uFFGtF5J1MFmAoEWENN2DZBuTXXzPDkiS4B1PUq78mRDgg").
		when().
		delete("2").
		then().log().all().
		statusCode(200);


  }
}
