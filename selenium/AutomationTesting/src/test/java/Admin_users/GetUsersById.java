package Admin_users;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class GetUsersById {
  @Test
  public void Getting_todos_id() {
	  
		given().
		baseUri("http://localhost:8081/user").
		auth().preemptive().oauth2("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTY4ODUxMzMwOSwiaWF0IjoxNjg4MzYzMzA5fQ.drhn2sD3cwMeAp6LChHJ7bV4bs16aJJs30QKm0p6uFFGtF5J1MFmAoEWENN2DZBuTXXzPDkiS4B1PUq78mRDgg").
		when().
		get("3").
		then().log().all().
		statusCode(200);

  }
}
