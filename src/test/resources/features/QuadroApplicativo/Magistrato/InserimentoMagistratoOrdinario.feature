@scenarios @InserimentoMagistratoOrdinario
Feature: Inserimento Magistrato Ordinario
	As a user
	I should be able to navigate to Inserimento Magistrato Ordinario

Scenario: Navigate to Inserimento Magistrato Ordinario
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Gestione from MAGISTRATO
	And I click to Inserimento Magistrato Ordinario
	Then I should be able to go to Inserimento Magistrato Ordinario


	
