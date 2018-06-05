@scenarios @AttivazioneProvvedimento
Feature: Attivazione Provvedimento
	As a user
	I should be able to navigate to Attivazione Provvedimento

Scenario: Navigate to Attivazione Provvedimento
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Gestione Tabelle Tipologiche from DATI DI SISTEMA
	And I click to Attivazione Provvedimento
	Then I should be able to go to Attivazione Provvedimento

