package com.csm.pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.csm.utils.PropertyUtil;

public class QuadroApplicativoPage extends BasePage {

private static final Logger log = LogManager.getLogger(QuadroApplicativoPage.class);
	
	/* Page Elements */
	@FindBy (xpath = "//div[contains(@id, '_:j_idt18:9:j_idt34')]//div[text()='Gestione']")
	private WebElement link_GestioneCalendario;
	
	@FindBy (xpath = "//div[contains(@id, '_:j_idt18:9:j_idt34')]//div[text()='Ricerche']")
	private WebElement link_RicercheCalendario;
	
	@FindBy (xpath = "//div[contains(@id, '_:j_idt18:9:j_idt34')]//div[text()='Operatività']")
	private WebElement link_OperativitaCalendario;
	
	@FindBy (xpath = "//div[contains(@id, '_:j_idt18:8:j_idt34')]//div[text()='Ricerche']")
	private WebElement link_RicercheConcorso;
	
	@FindBy(xpath= "//span[@class='csmTitoloPortlet']")
	private WebElement title_LandingPage;

	/* Methods */
	
	/**
	 * Clicked Quadro Applicativo menu list
	 * @param menu
	 */
	public void expandQuadroApplicativoMenu(String menu) {
		log.entry();
		driverHelper.waitForPageLoaded();
		By menuList = By.xpath("//img[@class='iconAppMenuClosed"+ menu +"']");
		driverHelper.scrollIntoView(menuList);
		driverHelper.jsClick(menuList);
	}
	
	/**
	 * Click Gestione from the submenu list
	 */
	public void clickGestione() {
		log.entry();
		driverHelper.waitForPageLoaded();
		driverHelper.scrollIntoView(link_GestioneCalendario);
		driverHelper.jsClick(link_GestioneCalendario);
	}
	
	/**
	 * Click Ricerche from the submenu list
	 */
	public void clickRicerche(String menu) {
		log.entry();
		driverHelper.waitForPageLoaded();
		switch(menu){
		case "CALENDARIO":
			driverHelper.scrollIntoView(link_RicercheCalendario);
			driverHelper.jsClick(link_RicercheCalendario);
            break;
		case "CONCORSO":
			driverHelper.scrollIntoView(link_RicercheConcorso);
			driverHelper.jsClick(link_RicercheConcorso);
            break;
        default:
        	break;
    	}
	}
	
	/**
	 * Click Operativita from the submenu list
	 */
	public void clickOperativita() {
		log.entry();
		driverHelper.waitForPageLoaded();
		driverHelper.scrollIntoView(link_OperativitaCalendario);
		driverHelper.jsClick(link_OperativitaCalendario);
	}
	
	/**
	 * Click the final sub menu choices
	 * @param finalSubMenu
	 */
	public void clickFinalSubMenu(String finalSubMenu) {
		log.entry();
		driverHelper.waitForPageLoaded();
		By finalSubMenuList = By.xpath("//a[@title='"+ finalSubMenu + "']");
		driverHelper.scrollIntoView(finalSubMenuList);
		driverHelper.clickButton(finalSubMenuList);
	}
	
	/**
	 * Verify if corrrect Landing Page is shown
	 * @param finalMenu
	 * @return
	 */
	public boolean isQuadroFinalLandingPageShown(String finalMenu) {
		log.entry();
		try {
			Thread.sleep(5000);
			driverHelper.waitForPageLoaded();
			if(driverHelper.isElementPresent(title_LandingPage)) {
				String titleName = title_LandingPage.getText();
				switch (finalMenu) {
		        case "Gestione post-Plenum":
					if(PropertyUtil.getTestDataProp("landing.page.gestione.post-Plenum").equals(titleName)) {
						log.info("Navigate to page successfully.");
						log.exit();
						return true;
					}
		            break;
		        case "Visualizza":
					if(PropertyUtil.getTestDataProp("landing.page.visualizza").equals(titleName)) {
						log.info("Navigate to page successfully.");
						log.exit();
						return true;
					}
		            break;
		        case "ODG di Consiglio Giudiziario e Direttivo di Cassazione":
					if(PropertyUtil.getTestDataProp("landing.page.ODG.di.consiglio.giudiziario.e.direttivo.di.cassazione").equals(titleName)) {
						log.info("Navigate to page successfully.");
						log.exit();
						return true;
					}
		            break;
		        case "ODG di Commissione":
					if(PropertyUtil.getTestDataProp("landing.page.ODG.di.Commissione").equals(titleName)) {
						log.info("Navigate to page successfully.");
						log.exit();
						return true;
					}
		            break;
		        case "ODG Proposta per il Plenum":
					if(PropertyUtil.getTestDataProp("landing.page.ODG.proposta.per.il.plenum").equals(titleName)) {
						log.info("Navigate to page successfully.");
						log.exit();
						return true;
					}
		            break;
		        case "ODG di Plenum":
					if(PropertyUtil.getTestDataProp("landing.page.ODG.di.plenum").equals(titleName)) {
						log.info("Navigate to page successfully.");
						log.exit();
						return true;
					}
		            break;
		        case "Bandi in lavorazione":
					if(PropertyUtil.getTestDataProp("landing.page.bandi.in.lavorazione").equals(titleName)) {
						log.info("Navigate to page successfully.");
						log.exit();
						return true;
					}
		            break;
		        default:
		        	break;
		    	}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Navigate to page unsuccessful.");
		log.exit();
		return false;	
	}
}
