@scenarios @ConferimentoFunzioni
Feature: Conferimento Funzioni
	As a user
	I should be able to navigate to Conferimento Funzioni

Scenario: Navigate to Conferimento Funzioni
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Gestione Tabelle Tipologiche from DATI DI SISTEMA
	And I click to Conferimento Funzioni
	Then I should be able to go to Conferimento Funzioni
