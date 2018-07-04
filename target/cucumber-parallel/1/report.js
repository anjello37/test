$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/pineanje/Documents/Git/CSM/src/test/resources/features/QuadroApplicativo/Disciplinare/TipoProvvedimentoGiurisdizionale.feature");
formatter.feature({
  "line": 2,
  "name": "Tipo provvedimento giurisdizionale",
  "description": "As a user\r\nI should be able to navigate to Tipo provvedimento giurisdizionale",
  "id": "tipo-provvedimento-giurisdizionale",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@scenarios"
    },
    {
      "line": 1,
      "name": "@TipoProvvedimentoGiurisdizionale"
    }
  ]
});
formatter.before({
  "duration": 7313642121,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Navigate to Tipo provvedimento giurisdizionale",
  "description": "",
  "id": "tipo-provvedimento-giurisdizionale;navigate-to-tipo-provvedimento-giurisdizionale",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@runscenario"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I navigate to Quadro Applicativo",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I expand Dati di sistema from DISCIPLINARE",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I select Tipo provvedimento giurisdizionale in GESTIONE TABELLE TIPOLOGICHE",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should be able to go to Tipo provvedimento giurisdizionale",
  "keyword": "Then "
});
formatter.match({
  "location": "COSMAPPMenuStepdefs.java:17"
});
formatter.result({
  "duration": 27997505873,
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
  "duration": 723133708,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DISCIPLINARE",
      "offset": 30
    }
  ],
  "location": "TipoProvvedimentoGiurisdizionale.java:11"
});
formatter.result({
  "duration": 6911570787,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tipo provvedimento giurisdizionale",
      "offset": 9
    },
    {
      "val": "GESTIONE TABELLE TIPOLOGICHE",
      "offset": 47
    }
  ],
  "location": "TipoProvvedimentoGiurisdizionale.java:17"
});
formatter.result({
  "duration": 1824051793,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tipo provvedimento giurisdizionale",
      "offset": 26
    }
  ],
  "location": "GestionePostPlenumStepdefs.java:32"
});
formatter.result({
  "duration": 7909104018,
  "status": "passed"
});
formatter.after({
  "duration": 1070659131,
  "status": "passed"
});
});