@scenarios @InserimentoMassivoMagistratiOrdinari
Feature: Inserimento Massivo Magistrati Ordinari
	As a user
	I should be able to navigate to Inserimento Massivo Magistrati Ordinari

Scenario: Navigate to Inserimento Massivo Magistrati Ordinari
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Gestione from MAGISTRATO
	And I click to Inserimento Massivo Magistrati Ordinari
	Then I should be able to go to Inserimento Massivo Magistrati Ordinari

	
