package API_Script;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Demo1_GET_Request 
{
	@Test
	public void getWeatherDetails()
	{
		given()
		.when()
			.get("https://reqres.in/api/users/2")
		 .then()
		 	.statusCode(200)
		 	.statusLine("HTTP/1.1 200 OK")
		 	.assertThat()
		 	.header("Content-Type","application/json; charset=utf-8");
		
	}
}
