package methods;

import io.restassured.RestAssured;

public class InitializeURL {
	
	public void URL() {
		RestAssured.baseURI="https://reqres.in/api/users";
	}
}
