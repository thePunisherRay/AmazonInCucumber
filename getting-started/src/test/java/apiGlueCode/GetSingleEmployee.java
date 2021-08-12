package apiGlueCode;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import methods.BDDStyleMethods;


public class GetSingleEmployee {
	
	BDDStyleMethods bddStyleMethods = new BDDStyleMethods();
	
	@Given("^I want to execute SingleUser Endpoint$")
	public void i_want_to_execute_SingleUser_Endpoint() {
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/employee";
	}


	@When("^I Submit the request for Get User$")
	public void i_Submit_the_request_for_Get_User() {  
		bddStyleMethods.GetSingleEmployee();
	}

	@Then("^I should Get the (\\d+) Status code$")
	public void i_should_Get_the_Status_code(int arg1) {
		Response response=bddStyleMethods.GetSingleEmployee();
		int statusCode=response.getStatusCode();
		assertEquals(statusCode, 200);
	}
	
}
