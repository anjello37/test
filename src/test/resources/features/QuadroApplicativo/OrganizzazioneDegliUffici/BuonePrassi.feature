@scenarios @BuonePrassi
Feature: BuonePrassi
	
	As a user
	I want to be able to navigate and use the items in Organizzazione Degli Uffici functionality

Background:
	Given I am logged in
	And I navigate to Quadro Applicativo

Scenario: Navigate to Ricerche > Buone Prassi  
	When I expand Ricerche from ORGANIZZAZIONE DEGLI UFFICI
	And I click to Buone Prassi
	Then I should be able to navigate to Buone Prassi