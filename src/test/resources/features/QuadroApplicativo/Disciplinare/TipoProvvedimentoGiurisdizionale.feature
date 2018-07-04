@scenarios @TipoProvvedimentoGiurisdizionale
Feature: Tipo provvedimento giurisdizionale
	As a user
	I should be able to navigate to Tipo provvedimento giurisdizionale


@runscenario
Scenario: Navigate to Tipo provvedimento giurisdizionale
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Dati di sistema from DISCIPLINARE
	And I select Tipo provvedimento giurisdizionale in GESTIONE TABELLE TIPOLOGICHE
	Then I should be able to go to Tipo provvedimento giurisdizionale




	
