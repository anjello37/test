@scenarios @DettaglioProvvedimentiPiantaOrganicaUfficiInteressati
Feature: DettaglioProvvedimentiPiantaOrganicaUfficiInteressati
	As a user
	I want to be able to navigate and use the items in Pianta Organica functionality

Background:
	Given I am logged in
	And I navigate to Quadro Applicativo

Scenario: Navigate to Gestione > Dettaglio Provvedimenti Pianta Organica - Uffici Interessati  
	When I expand Gestione from PIANTA ORGANICA
	And I click to Dettaglio Provvedimenti Pianta Organica - Uffici Interessati
	Then I should be able to navigate to Dettaglio Provvedimenti Pianta Organica - Uffici Interessati