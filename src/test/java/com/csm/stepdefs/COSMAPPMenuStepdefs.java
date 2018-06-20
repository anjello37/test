package com.csm.stepdefs;

import org.hamcrest.Matchers;
import org.junit.Assert;

import com.csm.pageobjects.COSMAPPLandingPage;
import com.csm.pageobjects.COSMAPPMenuBarPage;
import com.csm.pageobjects.LoginPage;

import cucumber.api.java8.En;

public class COSMAPPMenuStepdefs implements En {
	
	public COSMAPPMenuStepdefs(ScenarioHooks hooks, LoginPage loginPage, COSMAPPLandingPage landingPage, 
			COSMAPPMenuBarPage menuBarPage) {
		
		Given("I am logged in$", () -> {
			loginPage.setDriver(hooks.getDriverHelper(), hooks.getScenarioName());
			landingPage.setDriver(hooks.getDriverHelper(), hooks.getScenarioName());
			loginPage.navigateToHomePage();
			loginPage.navigateToLoginPageViaCOSMAPP();
			loginPage.login();
			Assert.assertThat(landingPage.isUserSuccessfullyLoggedIn(), Matchers.equalTo(true));
		});
		
		When("I clicked (.*) from COSMAPP menu bar$", (String cosmappMenuItem) -> {
			menuBarPage.setDriver(hooks.getDriverHelper(), hooks.getScenarioName());
			menuBarPage.clickCOSMAPPMenuItem(cosmappMenuItem);
		});
		
		Then("I should be able to navigate to (.*)$", (String cosmappMenu) -> {
			Assert.assertThat(menuBarPage.isCOSMAPPMenuBarLandingPageShown(cosmappMenu), Matchers.equalTo(true));
		});
	}
}
