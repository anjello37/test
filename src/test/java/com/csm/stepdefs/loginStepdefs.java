package com.csm.stepdefs;

import org.hamcrest.Matchers;
import org.junit.Assert;

import com.csm.pageobjects.COSMAPPLandingPage;
import com.csm.pageobjects.LoginPage;

import cucumber.api.java8.En;

public class loginStepdefs implements En {
	
	public loginStepdefs(ScenarioHooks hooks, LoginPage loginPage, COSMAPPLandingPage landingPage) {
	
		Given("I am on Login Page$", () -> {
			loginPage.setDriver(hooks.getDriverHelper());
			loginPage.navigateToHomePage();
			loginPage.navigateToLoginPage();
		});
		
		Given("I am on Login Page and COSMAPP is present$", () -> {
			loginPage.setDriver(hooks.getDriverHelper());
			loginPage.navigateToHomePage();
			loginPage.navigateToLoginPageViaCOSMAPP();
		});
	
		When("I enter correct username and password$", () -> {
			loginPage.login();
		});
		
		Then("I should be able to login successfully$", () -> {
			landingPage.setDriver(hooks.getDriverHelper());
			loginPage.navigateToLoginPageViaCOSMAPP();
			Assert.assertThat(landingPage.isUserSuccessfullyLoggedIn(), Matchers.equalTo(true));
		});
		
		Then("I should be able to login successfully via COSMAPP$", () -> {
			landingPage.setDriver(hooks.getDriverHelper());
			Assert.assertThat(landingPage.isUserSuccessfullyLoggedIn(), Matchers.equalTo(true));
		});
	}

}
