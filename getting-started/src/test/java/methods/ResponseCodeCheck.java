package methods;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ResponseCodeCheck {

	public void responseCodeVerification() {
		RequestSpecification request = RestAssured.given();
		Response response=request.post();
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, "201");
		String successCode = response.jsonPath().get("SuccessCode");
		Assert.assertEquals("Correct Success code was returned", successCode, "OPERATION_SUCCESS");

	}
}
