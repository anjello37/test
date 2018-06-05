@scenarios @EsitiValutazioni
Feature: Esiti Valutazioni
	As a user
	I should be able to navigate to Esiti Valutazioni

Scenario: Navigate to Atti
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Gestione Tabelle Tipologiche from DATI DI SISTEMA
	And I click to Esiti Valutazioni
	Then I should be able to go to Esiti Valutazioni
