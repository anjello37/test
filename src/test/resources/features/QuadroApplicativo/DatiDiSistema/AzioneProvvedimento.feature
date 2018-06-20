@scenarios @AzioneProvvedimento
Feature: Azione Provvedimento
	As a user
	I should be able to navigate to Azione Provvedimento

Scenario: Navigate to Azione Provvedimento
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Gestione Tabelle Tipologiche from DATI DI SISTEMA
	And I click to Azione Provvedimento
	Then I should be able to go to Azione Provvedimento



	
