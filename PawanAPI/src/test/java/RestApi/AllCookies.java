package RestApi;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AllCookies
{
	@Test
	public void allcookies() {
		Response res = RestAssured.given().log().all().when().get("/profile/index")
				.then().log().all().assertThat().statusCode(200).extract().response();
		
		Map<String,String>cookies=res.getCookies();
		{
			for(Map.Entry<String, String> entry:cookies.entrySet())
			{
				System.out.println("cookies name ="+entry.getKey());
				System.out.println("cookies value ="+entry.getValue());
			}
		}
		
	}
	
}
