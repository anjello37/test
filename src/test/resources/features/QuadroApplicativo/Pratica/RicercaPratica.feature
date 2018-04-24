@scenarios @RicercaPratica
Feature: RicercaPratica
	As a user
	I want to be able to navigate and use the items in Pratica functionality

Background:
	Given I am logged in
	And I navigate to Quadro Applicativo
	
Scenario: Navigate to Ricerche > Ricerca Pratica  
	When I expand Ricerche from PRATICA
	And I click to Ricerca Pratica
	Then I should be able to navigate to Ricerca Pratica 

	