@scenarios @login
Feature: Login
	
@onescenario
Scenario: Successful Login via COSMAPP
	Given I am on Login Page and COSMAPP is present
	When I enter correct username and password
	Then I should be able to login successfully via COSMAPP

	
Scenario: Successful Login
	Given I am on Login Page
	When I enter correct username and password
	Then I should be able to login successfully

	
Scenario: Unsuccessful Login
	Given I am on Login Page
	When I enter incorrect username and password
	Then I should be able to see error message
	

	
