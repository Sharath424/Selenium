package User_todos;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Update_todos {
  @Test
  public void put_todos_id() {
	  
		JSONObject body = new JSONObject();
		body.put("title", "Selenium");
		body.put("description", "Automation testing");
	  
		given().
		baseUri("http://localhost:8081/api/v1/todos").contentType(ContentType.JSON).body(body.toString()).
		auth().preemptive().oauth2("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTY4ODUxNTM2MSwiaWF0IjoxNjg4MzY1MzYxfQ.B4woKA-8xB70-n0JCkOXDxopWDzFldxKkqsMWBVgFQxXUMZ3Kirqln2NIlZBVO33HznqaIKGB-TYqvR45rFewg").
		when().
		put("14").
		then().log().all().
		statusCode(200);


  }
}
