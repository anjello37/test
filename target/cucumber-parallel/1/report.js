$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/clavios/Documents/Git/CSMAutomation/src/test/resources/features/QuadroApplicativo/Concorso/Concorso.feature");
formatter.feature({
  "line": 2,
  "name": "Concorso",
  "description": "As a user\r\nI should be able to navigate to submenu of Concorso",
  "id": "concorso",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@scenarios"
    },
    {
      "line": 1,
      "name": "@Concorso"
    }
  ]
});
formatter.before({
  "duration": 9347691974,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I navigate to Quadro Applicativo",
  "keyword": "And "
});
formatter.match({
  "location": "COSMAPPMenuStepdefs.java:17"
});
formatter.result({
  "duration": 40604613317,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Quadro Applicativo",
      "offset": 14
    }
  ],
  "location": "CalendarioStepdefs.java:16"
});
formatter.result({
  "duration": 271629653,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Navigate to Bandi in lavorazione",
  "description": "",
  "id": "concorso;navigate-to-bandi-in-lavorazione",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@onescenario"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I expand Ricerche from CONCORSO",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click to Bandi in lavorazione",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should be able to go to Bandi in lavorazione",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "CONCORSO",
      "offset": 23
    }
  ],
  "location": "CalendarioStepdefs.java:27"
});
formatter.result({
  "duration": 27192316439,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bandi in lavorazione",
      "offset": 11
    }
  ],
  "location": "CalendarioStepdefs.java:39"
});
formatter.result({
  "duration": 555170265,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bandi in lavorazione",
      "offset": 26
    }
  ],
  "location": "CalendarioStepdefs.java:44"
});
formatter.result({
  "duration": 21816895063,
  "status": "passed"
});
formatter.after({
  "duration": 1107102889,
  "status": "passed"
});
});