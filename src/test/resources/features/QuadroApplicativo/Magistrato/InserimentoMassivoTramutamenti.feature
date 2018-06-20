@scenarios @InserimentoMassivoTramutamenti
Feature: Inserimento Massivo Tramutamenti
	As a user
	I should be able to navigate to Inserimento Massivo Tramutamenti

Scenario: Navigate to Inserimento Massivo Tramutamenti
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Gestione from MAGISTRATO
	And I click to Inserimento Massivo Tramutamenti
	Then I should be able to go to Inserimento Massivo Tramutamenti


	
