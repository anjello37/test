@scenarios @RicercaProvvedimentoGiurisdizionale
Feature: Ricerca provvedimento giurisdizionale
	As a user
	I should be able to navigate to Ricerca provvedimento giurisdizionale

Scenario: Navigate to Ricerca provvedimento giurisdizionale
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Ricerche from DISCIPLINARE
	And I click to Ricerca provvedimento giurisdizionale
	Then I should be able to go to Ricerca provvedimento giurisdizionale




	
