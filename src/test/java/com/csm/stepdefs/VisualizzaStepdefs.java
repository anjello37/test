package com.csm.stepdefs;

import com.csm.pageobjects.QuadroApplicativoPage;

import cucumber.api.java8.En;

public class VisualizzaStepdefs implements En {
	
	public VisualizzaStepdefs(ScenarioHooks hooks, QuadroApplicativoPage quadroApplicativoPage) {
		
		When("I expand Ricerche from (.*)$", (String menu) -> {
			quadroApplicativoPage.setDriver(hooks.getDriverHelper(), hooks.getScenarioName());
			quadroApplicativoPage.expandQuadroApplicativoMenu(menu);
			quadroApplicativoPage.clickRicerche(menu);
		});
	}
}
