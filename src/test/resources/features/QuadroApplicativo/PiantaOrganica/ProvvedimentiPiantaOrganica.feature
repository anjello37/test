@scenarios @ProvvedimentiPiantaOrganica
Feature: ProvvedimentiPiantaOrganica
	As a user
	I want to be able to navigate and use the items in Pianta Organica functionality

Background:
	Given I am logged in
	And I navigate to Quadro Applicativo

Scenario: Navigate to Gestione > Provvedimenti Pianta Organica
	When I expand Gestione from PIANTA ORGANICA
	And I click to Provvedimenti Pianta Organica
	Then I should be able to navigate to Provvedimenti Pianta Organica