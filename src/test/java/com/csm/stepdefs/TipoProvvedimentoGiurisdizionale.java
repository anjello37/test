package com.csm.stepdefs;

import com.csm.pageobjects.QuadroApplicativoPage;

import cucumber.api.java8.En;

public class TipoProvvedimentoGiurisdizionale implements En {
	
	public TipoProvvedimentoGiurisdizionale(ScenarioHooks hooks, QuadroApplicativoPage quadroApplicativoPage) {
		
		When("I expand Dati di sistema from (.*)$", (String menu) -> {
			quadroApplicativoPage.setDriver(hooks.getDriverHelper(), hooks.getScenarioName());
			quadroApplicativoPage.expandQuadroApplicativoMenu(menu);
			quadroApplicativoPage.clickDatiDiSistema(menu);
		});
		
		And("I select (.*) in (.*)$", (String finalSubMenu, String datiDiSistemaMenu) -> {
			quadroApplicativoPage.setDriver(hooks.getDriverHelper(), hooks.getScenarioName());
			quadroApplicativoPage.clickDatiDiSistemaMenu(datiDiSistemaMenu);
			quadroApplicativoPage.clickFinalSubMenu(finalSubMenu);
		});
	}
}
