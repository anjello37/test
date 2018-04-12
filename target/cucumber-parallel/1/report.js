$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/clavios/Documents/Git/CSMAutomation/src/test/resources/features/COSMAPPMenu.feature");
formatter.feature({
  "line": 2,
  "name": "COSMAPP Menu",
  "description": "As a user\r\nI want to be able to navigate to different parts of the system",
  "id": "cosmapp-menu",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@COSMAPPMenu"
    },
    {
      "line": 1,
      "name": "@scenarios"
    }
  ]
});
formatter.before({
  "duration": 11103439741,
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
formatter.match({
  "location": "COSMAPPMenuStepdefs.java:16"
});
formatter.result({
  "duration": 28607726380,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Navigate to Quadro Applicativo",
  "description": "",
  "id": "cosmapp-menu;navigate-to-quadro-applicativo",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@onescenario"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I clicked Quadro Applicativo from COSMAPP menu bar",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should be able to navigate to Quadro Applicativo",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Quadro Applicativo",
      "offset": 10
    }
  ],
  "location": "COSMAPPMenuStepdefs.java:25"
});
formatter.result({
  "duration": 331173200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Quadro Applicativo",
      "offset": 32
    }
  ],
  "location": "COSMAPPMenuStepdefs.java:30"
});
formatter.result({
  "duration": 15054085259,
  "status": "passed"
});
formatter.after({
  "duration": 1603414094,
  "status": "passed"
});
});