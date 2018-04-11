package com.csm.pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class COSMAPPLandingPage extends BasePage {

private static final Logger log = LogManager.getLogger(COSMAPPLandingPage.class);
	
	/* Page Elements */
	@FindBy(xpath= "//li[@id='_145_userAvatar']")
	private WebElement link_Profile;
	
	@FindBy(css = "fieldset[class='input-container'] div[class='alert alert-error']")
	private WebElement msg_loginError;
	
	/* Methods */
	
	/**
	 * Verify if user is successfully logged in
	 * @return
	 */
	public boolean isUserSuccessfullyLoggedIn() {
		log.entry();
		driverHelper.waitForPageLoaded();
		if (driverHelper.isElementVisible(link_Profile)) {
			log.info("User is successfully logged in.");
			log.exit();
			return true;
		} else if(driverHelper.isElementVisible(msg_loginError)) {
			log.info("Incorrect username.");
			log.exit();
			return false;
		} 
		log.info("Incorrect username.");
		log.exit();
		return false;	
	}
}
