package com.csm.stepdefs;

import org.hamcrest.Matchers;
import org.junit.Assert;

import com.csm.pageobjects.COSMAPPMenuBarPage;
import com.csm.pageobjects.QuadroApplicativoPage;

import cucumber.api.java8.En;

public class GestionePostPlenumStepdefs implements En {
	
	public GestionePostPlenumStepdefs(ScenarioHooks hooks, COSMAPPMenuBarPage menuBarPage, 
			QuadroApplicativoPage quadroApplicativoPage) {
		
		And("I navigate to (.*)$", (String cosmappMenuItem) -> {
			menuBarPage.setDriver(hooks.getDriverHelper(), hooks.getScenarioName());
			menuBarPage.clickCOSMAPPMenuItem(cosmappMenuItem);
		});
		
		When("I expand Gestione from (.*)$", (String menu) -> {
			quadroApplicativoPage.setDriver(hooks.getDriverHelper(), hooks.getScenarioName());
			quadroApplicativoPage.expandQuadroApplicativoMenu(menu);
			quadroApplicativoPage.clickGestione(menu);
		});
		
		And("I click to (.*)$", (String finalSubMenu) -> {
			quadroApplicativoPage.setDriver(hooks.getDriverHelper(), hooks.getScenarioName());
			quadroApplicativoPage.clickFinalSubMenu(finalSubMenu);
		});
		
		Then("I should be able to go to (.*)$", (String cosmappMenu) -> {
			Assert.assertThat(quadroApplicativoPage.isQuadroFinalLandingPageShown(cosmappMenu), Matchers.equalTo(true));
		});
	}
}
