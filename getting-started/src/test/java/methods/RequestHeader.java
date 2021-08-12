package methods;

import io.restassured.RestAssured;

public class RequestHeader {

	public void setHeader() {
		RestAssured.given().header("Content-type","application/json");
	}
}
