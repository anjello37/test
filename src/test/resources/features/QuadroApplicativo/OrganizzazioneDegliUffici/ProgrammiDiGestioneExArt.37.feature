@scenarios @ProgrammiDiGestioneExArt.37
Feature: ProgrammiDiGestioneExArt.37
	
	As a user
	I want to be able to navigate and use the items in Organizzazione Degli Uffici functionality

Background:
	Given I am logged in
	And I navigate to Quadro Applicativo

Scenario: Navigate to Ricerche > Programmi di gestione ex art. 37  
	When I expand Ricerche from ORGANIZZAZIONE DEGLI UFFICI
	And I click to Programmi di gestione ex art. 37
	Then I should be able to navigate to Programmi di gestione ex art. 37