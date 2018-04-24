@scenarios @UfficiEFunzioni
Feature: UfficiEFunzioni
	
	As a user
	I want to be able to navigate and use the items in Organizzazione Degli Uffici functionality

Background:
	Given I am logged in
	And I navigate to Quadro Applicativo

Scenario: Navigate to Gestione > Uffici e Funzioni  
	When I expand Gestione from ORGANIZZAZIONE DEGLI UFFICI
	And I click to Uffici e Funzioni
	Then I should be able to navigate to Uffici e Funzioni