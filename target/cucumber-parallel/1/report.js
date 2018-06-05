$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/clavios/Documents/Git/CSMAutomation/src/test/resources/features/QuadroApplicativo/Calendario/Visualizza.feature");
formatter.feature({
  "line": 2,
  "name": "Visualizza",
  "description": "As a user\r\nI should be able to navigate to Visualizza",
  "id": "visualizza",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@scenarios"
    },
    {
      "line": 1,
      "name": "@Visualizza"
    }
  ]
});
formatter.before({
  "duration": 10194945887,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Navigate to Visualizza",
  "description": "",
  "id": "visualizza;navigate-to-visualizza",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@onescenario"
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
  "name": "I expand Ricerche from CALENDARIO",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click to Visualizza",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should be able to go to Visualizza",
  "keyword": "Then "
});
formatter.match({
  "location": "COSMAPPMenuStepdefs.java:17"
});
formatter.result({
  "duration": 29263565878,
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
  "duration": 637817918,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CALENDARIO",
      "offset": 23
    }
  ],
  "location": "VisualizzaStepdefs.java:11"
});
formatter.result({
  "duration": 6909054263,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Visualizza",
      "offset": 11
    }
  ],
  "location": "GestionePostPlenumStepdefs.java:27"
});
formatter.result({
  "duration": 806548965,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Visualizza",
      "offset": 26
    }
  ],
  "location": "GestionePostPlenumStepdefs.java:32"
});
formatter.result({
  "duration": 10963355393,
  "status": "passed"
});
formatter.after({
  "duration": 1167217814,
  "status": "passed"
});
});