$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/AddTariff2.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Title of your scenario outlines",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I want to write a step withs",
  "keyword": "Given "
});
formatter.step({
  "name": "I want to add tariff plan in form \"\u003cmrent\u003e\",\"\u003cflm\u003e\",\"\u003cfim\u003e\",\"\u003cfsm\u003e\",\"\u003clc\u003e\",\"\u003cic\u003e\",\"\u003csc\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I verify the status in steps",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "mrent",
        "flm",
        "fim",
        "fsm",
        "lc",
        "ic",
        "sc"
      ]
    },
    {
      "cells": [
        "100",
        "100",
        "100",
        "100",
        "100",
        "100",
        "100"
      ]
    },
    {
      "cells": [
        "200",
        "200",
        "200",
        "200",
        "100",
        "100",
        "100"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outlines",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I want to write a step withs",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTariff2.i_want_to_write_a_step_withs()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to add tariff plan in form \"100\",\"100\",\"100\",\"100\",\"100\",\"100\",\"100\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddTariff2.i_want_to_add_tariff_plan_in_form(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the status in steps",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariff2.i_verify_the_status_in_steps()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outlines",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I want to write a step withs",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTariff2.i_want_to_write_a_step_withs()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to add tariff plan in form \"200\",\"200\",\"200\",\"200\",\"100\",\"100\",\"100\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddTariff2.i_want_to_add_tariff_plan_in_form(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the status in steps",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariff2.i_verify_the_status_in_steps()"
});
formatter.result({
  "status": "passed"
});
});