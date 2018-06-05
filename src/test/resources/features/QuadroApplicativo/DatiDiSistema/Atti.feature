@scenarios @Atti
Feature: Atti
	As a user
	I should be able to navigate to Atti
	
Scenario: Navigate to Atti
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Gestione Tabelle Tipologiche from DATI DI SISTEMA
	And I click to Atti
	Then I should be able to go to Atti
