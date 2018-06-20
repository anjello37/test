@scenarios @InserimentoProvvedimentoGiurisdizionale
Feature: Inserimento provvedimento giurisdizionale
	As a user
	I should be able to navigate to Inserimento provvedimento giurisdizionale

Scenario: Navigate to Inserimento provvedimento giurisdizionale
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Gestione from DISCIPLINARE
	And I click to Inserimento provvedimento giurisdizionale
	Then I should be able to go to Inserimento provvedimento giurisdizionale




	
