$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/clavios/Documents/Git/CSMAutomation/src/test/resources/features/QuadroApplicativo/Disciplinare/InserimentoProvvedimentoGiurisdizionale.feature");
formatter.feature({
  "line": 2,
  "name": "Inserimento provvedimento giurisdizionale",
  "description": "As a user\r\nI should be able to navigate to Inserimento provvedimento giurisdizionale",
  "id": "inserimento-provvedimento-giurisdizionale",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@scenarios"
    },
    {
      "line": 1,
      "name": "@InserimentoProvvedimentoGiurisdizionale"
    }
  ]
});
formatter.before({
  "duration": 11680148553,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Navigate to Inserimento provvedimento giurisdizionale",
  "description": "",
  "id": "inserimento-provvedimento-giurisdizionale;navigate-to-inserimento-provvedimento-giurisdizionale",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@runscenario"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I navigate to Quadro Applicativo",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I expand Gestione from DISCIPLINARE",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click to Inserimento provvedimento giurisdizionale",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should be able to go to Inserimento provvedimento giurisdizionale",
  "keyword": "Then "
});
formatter.match({
  "location": "COSMAPPMenuStepdefs.java:17"
});
formatter.result({
  "duration": 36506943990,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Quadro Applicativo",
      "offset": 14
    }
  ],
  "location": "GestionePostPlenumStepdefs.java:16"
});
formatter.result({
  "duration": 887421822,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DISCIPLINARE",
      "offset": 23
    }
  ],
  "location": "GestionePostPlenumStepdefs.java:21"
});
formatter.result({
  "duration": 10413717250,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Inserimento provvedimento giurisdizionale",
      "offset": 11
    }
  ],
  "location": "GestionePostPlenumStepdefs.java:27"
});
formatter.result({
  "duration": 1192965942,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Inserimento provvedimento giurisdizionale",
      "offset": 26
    }
  ],
  "location": "GestionePostPlenumStepdefs.java:32"
});
formatter.result({
  "duration": 8531230965,
  "status": "passed"
});
formatter.after({
  "duration": 1658438352,
  "status": "passed"
});
});