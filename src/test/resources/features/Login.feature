@login @scenarios
Feature: Login
  As a user
  I want to be able to login successfully using valid credentials

Scenario: Successful Login via COSMAPP
	Given I am on Login Page and COSMAPP is present
	When I enter correct username and password
	Then I should be able to login successfully via COSMAPP
	
Scenario: Successful Login
	Given I am on Login Page
	When I enter correct username and password
	Then I should be able to login successfully

	

	
