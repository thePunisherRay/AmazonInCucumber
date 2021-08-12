package apiGlueCode;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import methods.BDDStyleMethods;


public class CreateUser {

	BDDStyleMethods bddStyleMethods = new BDDStyleMethods();

	@Given("^I want to execute CreateSingleUser Endpoint$")
	public void i_want_to_execute_CreateSingleUser_Endpoint() {
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/employee";
	}


	@When("^I submit the post request$")
	public void i_submit_the_post_request() {
		bddStyleMethods.CreateNewUser();
	}

	@Then("^I should get (\\d+) status code along with Json Body$")
	public void i_should_get_status_code_along_with_Json_Body(int arg1) {
		Response response=bddStyleMethods.CreateNewUser();
		int statusCode=response.getStatusCode();
		assertEquals(statusCode, 200);
	}
	
	
}
