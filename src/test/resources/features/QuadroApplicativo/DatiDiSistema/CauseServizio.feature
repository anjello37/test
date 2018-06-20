@scenarios @CauseServizio
Feature: Cause Servizio
	As a user
	I should be able to navigate to Cause Servizio

Scenario: Navigate to Cause Servizio
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Gestione Tabelle Tipologiche from DATI DI SISTEMA
	And I click to Cause Servizio
	Then I should be able to go to Cause Servizio
