package User_todos;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class GetTodosById {
  @Test
  public void Getting_todos_id() {
	  
		given().
		baseUri("http://localhost:8081/api/v1/todos").
		auth().preemptive().oauth2("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTY4ODUxNTM2MSwiaWF0IjoxNjg4MzY1MzYxfQ.B4woKA-8xB70-n0JCkOXDxopWDzFldxKkqsMWBVgFQxXUMZ3Kirqln2NIlZBVO33HznqaIKGB-TYqvR45rFewg").
		when().
		get("14").
		then().log().all().
		statusCode(200);

  }
}
