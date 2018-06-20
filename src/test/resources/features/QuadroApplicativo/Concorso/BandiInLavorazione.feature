@scenarios @BandiInLavorazione
Feature: Bandi in lavorazione
	As a user
	I should be able to navigate to Bandi in lavorazione

Scenario: Navigate to Bandi in lavorazione
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Ricerche from CONCORSO
	And I click to Bandi in lavorazione
	Then I should be able to go to Bandi in lavorazione


	
