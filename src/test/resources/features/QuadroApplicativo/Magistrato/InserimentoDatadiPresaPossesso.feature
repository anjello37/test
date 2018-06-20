@scenarios @InserimentoDatadiPresaPossesso
Feature: Inserimento Data di Presa Possesso
	As a user
	I should be able to navigate to Inserimento Data di Presa Possesso

Scenario: Navigate to Inserimento Data di Presa Possesso
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Operativita from MAGISTRATO
	And I click to Inserimento Data di Presa Possesso
	Then I should be able to go to Inserimento Data di Presa Possesso


	
