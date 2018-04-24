@scenarios @AttivitaNuova
Feature: AttivitaNuova
	As a user
	I want to be able to navigate and use the items in Pratica functionality

Background:
	Given I am logged in
	And I navigate to Quadro Applicativo

Scenario: Navigate to Gestione > Attività Nuova  
	When I expand Gestione from PRATICA
	And I click to Attività Nuova
	Then I should be able to navigate to Attività Nuova