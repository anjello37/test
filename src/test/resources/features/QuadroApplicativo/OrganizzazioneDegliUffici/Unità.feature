@scenarios @Unita
Feature: Unita
	
	As a user
	I want to be able to navigate and use the items in Organizzazione Degli Uffici functionality

Background:
	Given I am logged in
	And I navigate to Quadro Applicativo

Scenario: Navigate to Ricerche > Progetto Organizzativo > Unità  
	When I expand Ricerche from ORGANIZZAZIONE DEGLI UFFICI
	And I expand Progetto Organizzativo from Ricerche
	And I click to Unità
	Then I should be able to navigate to Unità