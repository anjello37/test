@scenarios @Visualizza
Feature: Visualizza
	As a user
	I should be able to navigate to Visualizza

Scenario: Navigate to Visualizza
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Ricerche from CALENDARIO
	And I click to Visualizza
	Then I should be able to go to Visualizza

