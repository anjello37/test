@scenarios @Disagi
Feature: Disagi
	As a user
	I should be able to navigate to Disagi

Scenario: Navigate to Disagi
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Gestione Tabelle Tipologiche from DATI DI SISTEMA
	And I click to Disagi
	Then I should be able to go to Disagi
