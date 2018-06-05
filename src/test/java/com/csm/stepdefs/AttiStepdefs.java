package com.csm.stepdefs;

import com.csm.pageobjects.QuadroApplicativoPage;

import cucumber.api.java8.En;

public class AttiStepdefs implements En {
	
	public AttiStepdefs(ScenarioHooks hooks, QuadroApplicativoPage quadroApplicativoPage) {
		
		When("I expand Gestione Tabelle Tipologiche from (.*)$", (String menu) -> {
			quadroApplicativoPage.setDriver(hooks.getDriverHelper(), hooks.getScenarioName());
			quadroApplicativoPage.expandQuadroApplicativoMenu(menu);
			quadroApplicativoPage.clickGestioneTabelleTipologiche();
		});
	}
}
