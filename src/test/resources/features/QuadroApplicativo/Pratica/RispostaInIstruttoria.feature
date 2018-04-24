@scenarios @RispostaInIstruttoria
Feature: RispostaInIstruttoria
	As a user
	I want to be able to navigate and use the items in Pratica functionality

Background:
	Given I am logged in
	And I navigate to Quadro Applicativo

Scenario: Navigate to Gestione > Risposta in Istruttoria  
	When I expand Gestione from PRATICA
	And I click to Risposta in Istruttoria
	Then I should be able to navigate to Risposta in Istruttoria 
