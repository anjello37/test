$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/clavios/eclipse-workspace/CSMAutomation/src/test/resources/features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@scenarios"
    },
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 11305880668,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Successful Login via COSMAPP",
  "description": "",
  "id": "login;successful-login-via-cosmapp",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@onescenario"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Login Page and COSMAPP is present",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter correct username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should be able to login successfully via COSMAPP",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepdefs.java:20"
});
formatter.result({
  "duration": 16902909770,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "correct",
      "offset": 8
    }
  ],
  "location": "loginStepdefs.java:26"
});
formatter.result({
  "duration": 20959137969,
  "status": "passed"
});
formatter.match({
  "location": "loginStepdefs.java:36"
});
formatter.result({
  "duration": 150932733,
  "status": "passed"
});
formatter.after({
  "duration": 1185357961,
  "status": "passed"
});
});