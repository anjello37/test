package com.csm.stepdefs;

import org.hamcrest.Matchers;
import org.junit.Assert;

import com.csm.pageobjects.COSMAPPMenuBarPage;
import com.csm.pageobjects.QuadroApplicativoPage;

import cucumber.api.java8.En;

public class CalendarioStepdefs implements En {
	
	public CalendarioStepdefs(ScenarioHooks hooks, COSMAPPMenuBarPage menuBarPage, 
			QuadroApplicativoPage quadroApplicativoPage) {
		
		And("I navigate to (.*)$", (String cosmappMenuItem) -> {
			menuBarPage.setDriver(hooks.getDriverHelper());
			menuBarPage.clickCOSMAPPMenuItem(cosmappMenuItem);
		});
		
		When("I expand Gestione from (.*)$", (String menu) -> {
			quadroApplicativoPage.setDriver(hooks.getDriverHelper());
			quadroApplicativoPage.expandQuadroApplicativoMenu(menu);
			quadroApplicativoPage.clickGestione();
		});
		
		When("I expand Ricerche from (.*)$", (String menu) -> {
			quadroApplicativoPage.setDriver(hooks.getDriverHelper());
			quadroApplicativoPage.expandQuadroApplicativoMenu(menu);
			quadroApplicativoPage.clickRicerche(menu);
		});
		
		When("I expand Operativita from (.*)$", (String menu) -> {
			quadroApplicativoPage.setDriver(hooks.getDriverHelper());
			quadroApplicativoPage.expandQuadroApplicativoMenu(menu);
			quadroApplicativoPage.clickOperativita();
		});
		
		And("I click to (.*)$", (String finalSubMenu) -> {
			quadroApplicativoPage.setDriver(hooks.getDriverHelper());
			quadroApplicativoPage.clickFinalSubMenu(finalSubMenu);
		});
		
		Then("I should be able to go to (.*)$", (String cosmappMenu) -> {
			Assert.assertThat(quadroApplicativoPage.isQuadroFinalLandingPageShown(cosmappMenu), Matchers.equalTo(true));
		});
	}
}
