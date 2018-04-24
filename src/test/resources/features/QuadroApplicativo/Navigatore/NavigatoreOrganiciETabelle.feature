@scenarios @NavigatoreOrganiciETabelle
Feature: NavigatoreOrganiciETabelle
	As a user
	I want to be able to navigate and use the items in Navigatore functionality

Background:
	Given I am logged in
	And I navigate to Quadro Applicativo

Scenario: Navigate to Navigatore Organici e tabelle  
	When I click Navigatore Organici e tabelle from NAVIGATORE
	Then I should be able to navigate to Navigatore Organici e tabelle 
