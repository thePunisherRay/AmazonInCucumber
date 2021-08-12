Feature: Test CRUD methods in users

Scenario: To Verify Get Employee
	Given I want to execute GetEmployee Endpoint
	When I submit the Get request
	Then I should get the status code as 200
	
Scenario: To verify Single Get Employee
	Given I want to execute SingleEmployee Endpoint
	When I Submit the request for Get User
	Then I should get the status code as 200
	
Scenario: TO Verify the Create Employee
	Given I want to execute CreateSingleEmployee Endpoint
	When I submit the post request 
	Then I should get 201 status code along with Json Body
	
Scenario Outline: To Verify the Update User
	Given I want to execute update User Endpoint
	When I submit the Put Request with <name> and <job> for single User
	Then I should get 201 status code along with Json body
	
	Examples:
	| name | job |
	| 11   | test 1 |
	| 12   | Test 2 |