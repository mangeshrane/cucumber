Feature: Test Facebook smoke scenario
	
	Scenario: Test login with valid credentials
	Given open firefox and start application
	When I enter valid "username" and valid "password"
	Then user should be able to login successfully
	
	