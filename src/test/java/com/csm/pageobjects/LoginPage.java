package com.csm.pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.csm.utils.PropertyUtil;
import com.cucumber.listener.Reporter;


public class LoginPage extends BasePage {

private static final Logger log = LogManager.getLogger(LoginPage.class);
	
	/* Page Elements */
	@FindBy(css= "div[class='well well-light'] a[target='_self']")
	private WebElement img_COSMAPP;
	
	@FindBy(id= "_58_login")
	private WebElement fld_userName;
	
	@FindBy(id= "_58_password")
	private WebElement fld_password;
	
	@FindBy(css = "button[type='submit']")
	private WebElement btn_submit;
	
	/* Methods */
	
	/**
	 * Go to CSM Home Page
	 */
	public void navigateToHomePage() {
		log.entry();
		driverHelper.get(PropertyUtil.getConfig("csm.url"));
	}
	
	/**
	 * Go to Login Page
	 */
	public void navigateToLoginPage() {
		log.entry();
		if(driverHelper.isElementPresent(img_COSMAPP)) {
			driverHelper.scrollIntoView(img_COSMAPP);
				driverHelper.jsClick(img_COSMAPP);
			log.exit();
		} else {
			log.error("Element is not present.");
			log.exit();
		}
	}
	
	/**
	 * Login using correct username and password
	 */
	public void login() {
		log.entry();
		if(driverHelper.isElementPresent(fld_userName)) {
			fld_userName.clear();
			fld_userName.sendKeys(PropertyUtil.getTestDataProp("employee.username"));
			log.info("Username entered successfully.");
			fld_password.sendKeys(PropertyUtil.getTestDataProp("employee.password"));
			log.info("Password entered successfully.");
			driverHelper.clickButton(btn_submit);
			log.exit();
		} else {
			log.error("Element is not present.");
		}
	}
}