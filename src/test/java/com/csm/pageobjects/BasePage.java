package com.csm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.csm.utils.WebDriverHelper;

public abstract class BasePage {
	WebDriver driver;
	WebDriverHelper driverHelper;
	
	public void setDriver(WebDriverHelper driverHelper) {
        this.driverHelper = driverHelper;
        this.driver = driverHelper.getDriver();
        PageFactory.initElements(driver, this);
    }
}
