@scenarios @FontiAutorizzanti
Feature: Fonti Autorizzanti
	As a user
	I should be able to navigate to Fonti Autorizzanti

Scenario: Navigate to Fonti Autorizzanti
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Gestione Tabelle Tipologiche from DATI DI SISTEMA
	And I click to Fonti Autorizzanti
	Then I should be able to go to Fonti Autorizzanti
