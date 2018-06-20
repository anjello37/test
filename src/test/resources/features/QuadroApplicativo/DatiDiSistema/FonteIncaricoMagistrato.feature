@scenarios @FonteIncaricoMagistrato
Feature: Fonte Incarico Magistrato
	As a user
	I should be able to navigate to Fonte Incarico Magistrato
	
Scenario: Navigate to Fonte Incarico Magistrato
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Gestione Tabelle Tipologiche from DATI DI SISTEMA
	And I click to Fonte Incarico Magistrato
	Then I should be able to go to Fonte Incarico Magistrato
