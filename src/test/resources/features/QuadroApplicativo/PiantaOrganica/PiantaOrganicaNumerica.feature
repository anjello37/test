@scenarios @PiantaOrganicaNumerica
Feature: PiantaOrganicaNumerica
	As a user
	I want to be able to navigate and use the items in Pianta Organica functionality

Background:
	Given I am logged in
	And I navigate to Quadro Applicativo

Scenario: Navigate to Ricerche > Pianta Organica Numerica  
	When I expand Ricerche from PIANTA ORGANICA
	And I click to Pianta Organica Numerica
	Then I should be able to navigate to Pianta Organica Numerica