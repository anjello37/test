@scenarios @Calendario
Feature: Calendario
	As a user
	I should be able to navigate to submenu of Calendario
	
Background:
	Given I am logged in
	And I navigate to Quadro Applicativo

Scenario: Navigate to Gestione post-Plenum
	When I expand Gestione from CALENDARIO
	And I click to Gestione post-Plenum
	Then I should be able to go to Gestione post-Plenum

Scenario: Navigate to Visualizza
	When I expand Ricerche from CALENDARIO
	And I click to Visualizza
	Then I should be able to go to Visualizza

Scenario: Navigate to ODG di Consiglio Giudiziario e Direttivo di Cassazione
	When I expand Operativita from CALENDARIO
	And I click to ODG di Consiglio Giudiziario e Direttivo di Cassazione
	Then I should be able to go to ODG di Consiglio Giudiziario e Direttivo di Cassazione
	
Scenario: Navigate to ODG di Commissione
	When I expand Operativita from CALENDARIO
	And I click to ODG di Commissione
	Then I should be able to go to ODG di Commissione
	
Scenario: Navigate to ODG Proposta per il Plenum
	When I expand Operativita from CALENDARIO
	And I click to ODG Proposta per il Plenum
	Then I should be able to go to ODG Proposta per il Plenum
	
Scenario: Navigate to ODG di Plenum
	When I expand Operativita from CALENDARIO
	And I click to ODG di Plenum
	Then I should be able to go to ODG di Plenum




	
