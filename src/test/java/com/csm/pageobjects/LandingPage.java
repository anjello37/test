package com.csm.pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

private static final Logger log = LogManager.getLogger(LandingPage.class);
	
	/* Page Elements */
	@FindBy(xpath= "//li[@id='_145_userAvatar']")
	private WebElement link_Profile;
	
	/* Methods */
	
	/**
	 * Verify if user is successfully logged in
	 * @return
	 */
	public boolean isUserSuccessfullyLoggedIn() {
		log.entry();
		driverHelper.waitForPageLoaded();
		if (driverHelper.isElementPresent(link_Profile)) {
			log.info("User is successfully logged in.");
			log.exit();
			return true;
		}
		log.error("User is NOT logged in.");
		log.exit();
		return false;
	}
}
