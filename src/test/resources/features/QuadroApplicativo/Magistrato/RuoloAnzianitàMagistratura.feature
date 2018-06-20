@scenarios @RuoloAnzianitàMagistratura
Feature: Ruolo Anzianità Magistratura
	As a user
	I should be able to navigate to Ruolo Anzianità Magistratura

Scenario: Navigate to Ruolo Anzianità Magistratura
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Ricerche from MAGISTRATO
	And I click to Ruolo Anzianità Magistratura
	Then I should be able to go to Ruolo Anzianità Magistratura


	
