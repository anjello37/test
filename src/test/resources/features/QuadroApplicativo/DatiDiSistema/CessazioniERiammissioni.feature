@scenarios @CessazioniERiammissioni
Feature: Cessazioni e Riammissioni
	As a user
	I should be able to navigate to Cessazioni e Riammissioni

Scenario: Navigate to Cessazioni e Riammissioni
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Gestione Tabelle Tipologiche from DATI DI SISTEMA
	And I click to Cessazioni e Riammissioni
	Then I should be able to go to Cessazioni e Riammissioni
