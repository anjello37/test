@COSMAPPMenu @scenarios 
Feature: COSMAPP Menu
	As a user
	I want to be able to navigate to the items in COSMAPP Menu Bar
	
Background:
	Given I am logged in

Scenario: Navigate to Quadro Applicativo
	When I clicked Quadro Applicativo from COSMAPP menu bar
	Then I should be able to navigate to Quadro Applicativo

Scenario: Navigate to Nuove Attività
	When I clicked Nuove Attività from COSMAPP menu bar
	Then I should be able to navigate to Nuove Attività

Scenario: Navigate to Attività In Corso
	When I clicked Attività In Corso from COSMAPP menu bar
	Then I should be able to navigate to Attività In Corso

Scenario: Navigate to Comunicazioni
	When I clicked Comunicazioni from COSMAPP menu bar
	Then I should be able to navigate to Comunicazioni

Scenario: Navigate to Calendario
	When I clicked Calendario from COSMAPP menu bar
	Then I should be able to navigate to Calendario
	

	
