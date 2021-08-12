package methods;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BDDStyleMethods {
	
	 JsonBody jsonBody;
	 
	 public String baseURI() {
		 return RestAssured.baseURI="http://dummy.restapiexample.com/api/v1"; 	 
	 }

	public Response GetEmployee() {
		Response usersResponse = given()
									.baseUri(baseURI())
									.param("limit", 5)
									.contentType("application/json")
									.header("Connection","keep-alive")
								.when()
									.get("/employees");
		return usersResponse;
	}

	public Response GetSingleEmployee() {
		Response usersResponse = given()
				.baseUri(baseURI())
				.param("limit", 5)
				.contentType("application/json")
				.header("Connection","keep-alive")
			.when()
				.get("/employees/3138");
		return usersResponse;
	}

	public Response CreateNewUser() {
		Response usersResponse = given()
				.baseUri(baseURI())
				.param("limit", 20)
				.contentType("application/json")
				.header("Connection","keep-alive")
			.when()
				.get("/employees");
		return usersResponse;
	}
	
	public Response UpdateUser(int arg1, int arg2) {
		Response userResponse = given()
				.baseUri(baseURI())
				.param("limit", 20)
				.contentType("application/json")
				.header("Connection","keep-alive")
			.when()
				.get("/employees");
		return userResponse;
	}

}
