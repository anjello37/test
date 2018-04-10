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
  "duration": 10153448379,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Successful Login",
  "description": "",
  "id": "login;successful-login",
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
  "name": "I am on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter correct username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepdefs.java:14"
});
formatter.result({
  "duration": 14697171021,
  "status": "passed"
});
formatter.match({
  "location": "loginStepdefs.java:20"
});
formatter.result({
  "duration": 12141243759,
  "status": "passed"
});
formatter.match({
  "location": "loginStepdefs.java:24"
});
formatter.result({
  "duration": 136834433,
  "status": "passed"
});
formatter.after({
  "duration": 1189691625,
  "status": "passed"
});
});