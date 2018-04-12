package com.csm.pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.csm.utils.PropertyUtil;

public class COSMAPPMenuBarPage extends BasePage {

private static final Logger log = LogManager.getLogger(COSMAPPMenuBarPage.class);
	
	/* Page Elements */
	@FindBy(xpath= "//span[@class='csmTitoloPortlet']")
	private WebElement title_COSMAPPMenu;
	
	/* Methods */
	
	/**
	 * Clicked item from COSMAPP Menu Bar
	 * @return
	 */
	public void clickCOSMAPPMenuItem(String cosmappMenuItem) {
		log.entry();
		driverHelper.waitForPageLoaded();
		By menuBar = By.xpath("//a[@aria-label='"+ cosmappMenuItem +"']");
		if (driverHelper.isElementPresent(menuBar)) {
			driverHelper.clickButton(menuBar);
			log.info("Link is clicked.");
			log.exit();
		}else {
			log.error("Link is NOT clicked.");
			log.exit();
		}
	}
	
	/**
	 * Verify if corrrect COSMAPP Menu Item page is shown
	 * @param cosmappMenu
	 * @return
	 */
	public boolean isCOSMAPPMenuBarLandingPageShown(String cosmappMenu) {
		log.entry();
		driverHelper.waitForPageLoaded();
		if(driverHelper.isElementPresent(title_COSMAPPMenu)) {
			String titleName = title_COSMAPPMenu.getText();
			switch (cosmappMenu) {
	        case "Quadro Applicativo":
				if(PropertyUtil.getTestDataProp("landing.page.quadro.applicativo").equals(titleName)) {
					log.info("Navigate to page successfully.");
					log.exit();
					return true;
				}
	            break;
	        case "Nuove Attività":
				if(PropertyUtil.getTestDataProp("landing.page.nuove.attivita").equals(titleName)) {
					log.info("Navigate to page successfully.");
					log.exit();
					return true;
				}
	            break;
	        case "Attività In Corso":
				if(PropertyUtil.getTestDataProp("landing.page.attivita.in.corso").equals(titleName)) {
					log.info("Navigate to page successfully.");
					log.exit();
					return true;
				}
	            break;
	        case "Comunicazioni":
				if(PropertyUtil.getTestDataProp("landing.page.comunicazioni").equals(titleName)) {
					log.info("Navigate to page successfully.");
					log.exit();
					return true;
				}
	            break;
	        case "Calendario":
				if(PropertyUtil.getTestDataProp("landing.page.calendario").equals(titleName)) {
					log.info("Navigate to page successfully.");
					log.exit();
					return true;
				}
	            break;
	        default:
	        	break;
	    	}
		}
		log.info("Navigate to page unsuccessful.");
		log.exit();
		return false;	
	}
}
