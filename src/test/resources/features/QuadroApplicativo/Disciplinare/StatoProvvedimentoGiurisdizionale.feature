@scenarios @StatoProvvedimentoGiurisdizionale
Feature: Stato provvedimento giurisdizionale
	As a userStato provvedimento giurisdizionaleTipo provvedimento giurisdizionale

Scenario: Navigate to Tipo provvedimento giurisdizionale
	Given I am logged in
	And I navigate to Quadro Applicativo
	When I expand Dati di sistema from DISCIPLINARE
	And I select Stato provvedimento giurisdizionale in GESTIONE TABELLE TIPOLOGICHE
	Then I should be able to go to Stato provvedimento giurisdizionale




	
