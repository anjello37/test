@scenarios @COSMAPPMenu
Feature: COSMAPPMenu

Scenario: Successful Login
	Given I am on Login Page
	When I enter correct username and password
	Then I should be able to login successfully
	

	
