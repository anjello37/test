package com.csm.stepdefs;

import org.hamcrest.Matchers;
import org.junit.Assert;

import com.csm.pageobjects.LandingPage;
import com.csm.pageobjects.LoginPage;

import cucumber.api.java8.En;

public class loginStepdefs implements En {
	
	public loginStepdefs(ScenarioHooks hooks, LoginPage loginPage, LandingPage landingPage) {
		Given("I am on Login Page$", () -> {
			loginPage.setDriver(hooks.getDriverHelper());
			loginPage.navigateToHomePage();
			loginPage.navigateToLoginPage();
		});
		
		When("I enter correct username and password$", () -> {
			loginPage.login();
		});
		
		Then("I should be able to login successfully$", () -> {
			landingPage.setDriver(hooks.getDriverHelper());
			Assert.assertThat(landingPage.isUserSuccessfullyLoggedIn(), Matchers.equalTo(true));
		});
	}

}
