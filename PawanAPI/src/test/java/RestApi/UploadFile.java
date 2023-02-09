package RestApi;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UploadFile 
{
	@Test
	void uploadfile()
	{
		File file = new File("Myavatar.png");
		Response res = RestAssured.given().multiPart("media_url", file, "application/octet-strem")
		.when().post("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&thumbs=True").then().extract().response();
		String url = res.path("url");
		System.out.println(url);
	}
}
