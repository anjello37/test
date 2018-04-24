@scenarios @AnnullaIterPratica
Feature: AnnullaIterPratica
	As a user
	I want to be able to navigate and use the items in Pratica functionality

Background:
	Given I am logged in
	And I navigate to Quadro Applicativo

Scenario: Navigate to Gestione > Annulla Iter Pratica  
	When I expand Gestione from PRATICA
	And I click to Annulla Iter Pratica
	Then I should be able to navigate to Annulla Iter Pratica 
	 