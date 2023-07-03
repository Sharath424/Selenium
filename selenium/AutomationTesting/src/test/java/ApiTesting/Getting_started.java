package ApiTesting;


import org.testng.Assert;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.io.File;
public class Getting_started {
  	@Test
	public void simple_get_request(){
  		
//  		File file = new File("resources/login.json");
//
//  		given().baseUri("http://localhost:8081").
//  		contentType(ContentType.JSON).
//  		body(file).
//  		when().post("/authenticate").then().statusCode(200);
  		
  		
  		
  	//	given().baseUri("http://localhost:8081/api/v1/todos/title").when().get("/python").then().statusCode(401);
  		
	RestAssured.baseURI="http://localhost:8081/api/v1";
	
	RequestSpecification httpRequest=RestAssured.given();
	
	Response response=httpRequest.request(Method.POST,"/todos");
	
	String responseBody = response.getBody().asString();
	
	System.out.println("Response body is"+responseBody);
//	
//  	
//	//status code validation
//	int statusCode=response.getStatusCode();
//	System.out.println("status code is: "+statusCode);
//	Assert.assertEquals(statusCode, 200);
////	
////	//status line verification
//	String statusLine=response.getStatusLine();
//	System.out.println(statusLine);
//	Assert.assertEquals(statusLine,"НТТР/1.1 200 OK");
	
  	}
}
