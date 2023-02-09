package RestApi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Validatehead 
{
	@Test
	void validatehead()
	{
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification a = RestAssured.given();
		Response res = a.request(Method.GET,"/api/users/2");
		String value = res.getBody().asString();
		System.out.println(value);
		
		//validating headers
		String ctype = res.header("Content-Type");
		Assert.assertEquals(ctype,"application/json; charset=utf-8");
		
		String coding = res.header("Content-Encoding");
		Assert.assertEquals(coding, "gzip");
		
	}
}
