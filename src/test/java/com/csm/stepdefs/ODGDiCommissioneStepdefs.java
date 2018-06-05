package com.csm.stepdefs;

import com.csm.pageobjects.QuadroApplicativoPage;

import cucumber.api.java8.En;

public class ODGDiCommissioneStepdefs implements En {
	
	public ODGDiCommissioneStepdefs(ScenarioHooks hooks, QuadroApplicativoPage quadroApplicativoPage) {
		
		When("I expand Operativita from (.*)$", (String menu) -> {
			quadroApplicativoPage.setDriver(hooks.getDriverHelper(), hooks.getScenarioName());
			quadroApplicativoPage.expandQuadroApplicativoMenu(menu);
			quadroApplicativoPage.clickOperativita();
		});
	}
}
