@scenarios @EsecuzioneEVariazioneProgrammaOrganizzativo
Feature: Esecuzione e Variazione Programma Organizzativo
	As a user
	I should be able to navigate to Esecuzione e Variazione Programma Organizzativo

Scenario: Navigate to Esecuzione e Variazione Programma Organizzativo
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Gestione Tabelle Tipologiche from DATI DI SISTEMA
	And I click to Esecuzione e Variazione Programma Organizzativo
	Then I should be able to go to Esecuzione e Variazione Programma Organizzativo
