@scenarios @Magistrato
Feature: Magistrato
	

Scenario: Successful Login via COSMAPP
	Given I am on Login Page and COSMAPP is present
	When I enter correct username and password
	Then I should be able to login successfully via COSMAPP



	