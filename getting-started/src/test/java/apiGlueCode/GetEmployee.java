package apiGlueCode;

import static org.testng.Assert.assertEquals;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import methods.BDDStyleMethods;
import methods.InitializeURL;
import methods.JsonBody;
import methods.RequestHeader;
import methods.ResponseCodeCheck;
import net.thucydides.core.annotations.Steps;

public class GetEmployee {

	@Steps
	InitializeURL initializeURL;

	@Steps
	JsonBody jsonBody;

	@Steps
	RequestHeader header;
	
	@Steps
	ResponseCodeCheck responseCodeCheck;
	Response response;
	
	BDDStyleMethods bddStyleMethods = new BDDStyleMethods();

	@Given("^I want to execute GetEmployee Endpoint$")
	public void i_want_to_execute_GetEmployee_Endpoint() {
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
	}

	@When("^I submit the Get request$")
	public void i_submit_the_Get_request() {
		response=bddStyleMethods.GetEmployee();
	}

	@Then("^I should get the status code as (\\d+)$")
	public void i_should_get_the_status_code_as(int expectedStatusCode) {
		int statusCode=response.getStatusCode();
		assertEquals(statusCode, expectedStatusCode);
	}

}
