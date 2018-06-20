@scenarios @InserimentoFacenteFunzione
Feature: IInserimento Facente Funzione
	As a user
	I should be able to navigate to Inserimento Facente Funzione

Scenario: Navigate to Inserimento Facente Funzione
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Operativita from MAGISTRATO
	And I click to Inserimento Facente Funzione
	Then I should be able to go to Inserimento Facente Funzione


	
