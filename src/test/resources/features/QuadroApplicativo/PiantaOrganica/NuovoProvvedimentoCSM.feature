@scenarios @NuovoProvvedimentoCSM
Feature: NuovoProvvedimentoCSM
	As a user
	I want to be able to navigate and use the items in Pianta Organica functionality

Background:
	Given I am logged in
	And I navigate to Quadro Applicativo

Scenario: Navigate to Gestione > Nuovo Provvedimento CSM
	When I expand Gestione from PIANTA ORGANICA
	And I click to Nuovo Provvedimento CSM
	Then I should be able to navigate to Nuovo Provvedimento CSM