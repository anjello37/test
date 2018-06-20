@scenarios @VisualizzaListaTabelleDUMP
Feature: Visualizza Lista Tabelle DUMP
	As a user
	I should be able to navigate to Visualizza Lista Tabelle DUMP

Scenario: Navigate to Inserimento provvedimento giurisdizionale
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Gestione from DWH
	And I click to Visualizza Lista Tabelle DUMP
	Then I should be able to go to Visualizza Lista Tabelle DUMP


	
