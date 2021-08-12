package apiGlueCode;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import methods.BDDStyleMethods;



public class UpdateUser {
	
	BDDStyleMethods bddStyleMethods = new BDDStyleMethods();


	String URI = "https://reqres.in/api/users";

	@Given("^I want to execute update User Endpoint$")
	public void i_want_to_execute_update_User_Endpoint() {
		RestAssured.baseURI="https://reqres.in";
		RestAssured.basePath="/api";
	}

	@When("^I submit the Put Request with (\\d+) and test (\\d+) for single User$")
	public void i_submit_the_Put_Request_with_and_test_for_single_User(int arg1, int arg2) {
		bddStyleMethods.UpdateUser(arg1,arg2);
	}

	@Then("^I should get (\\d+) status code along with Json body$")
	public void i_should_get_status_code_along_with_Json_body(int arg1) {
	  
	}
}
