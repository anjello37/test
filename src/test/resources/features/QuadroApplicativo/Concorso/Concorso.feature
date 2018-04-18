@scenarios @Concorso
Feature: Concorso
	As a user
	I should be able to navigate to submenu of Concorso
	
Background:
	Given I am logged in
	And I navigate to Quadro Applicativo

Scenario: Navigate to Bandi in lavorazione
	When I expand Ricerche from CONCORSO
	And I click to Bandi in lavorazione
	Then I should be able to go to Bandi in lavorazione


	
