@scenarios @MagistratoOrdinario
Feature: Magistrato Ordinario
	As a user
	I should be able to navigate to Magistrato Ordinario

Scenario: Navigate to Magistrato Ordinario
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Ricerche from MAGISTRATO
	And I click to Magistrato Ordinario
	Then I should be able to go to Magistrato Ordinario


	
