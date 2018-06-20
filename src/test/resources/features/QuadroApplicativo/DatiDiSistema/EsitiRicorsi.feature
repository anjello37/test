@scenarios @EsitiRicorsi
Feature: Esiti Ricorsi
	As a user
	I should be able to navigate to Esiti Ricorsi

Scenario: Navigate to Esiti Ricorsi
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Gestione Tabelle Tipologiche from DATI DI SISTEMA
	And I click to Esiti Ricorsi
	Then I should be able to go to Esiti Ricorsi
