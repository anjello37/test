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
	
	@FindBy (xpath = "//div[contains(@id, '_:j_idt18:5:j_idt34')]//div[text()='GESTIONE TABELLE TIPOLOGICHE']")
	private WebElement link_GestioneTabelleTipologicheSistema;
	
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
		if(menu.equals("DATI DI SISTEMA")) {
			String datiDiSistema = "SISTEMA";
			By menuList = By.xpath("//img[@class='iconAppMenuClosed"+ datiDiSistema +"']");
			driverHelper.scrollIntoView(menuList);
			driverHelper.embedScreenshot(scenario);
			driverHelper.jsClick(menuList);
		}else {
			By menuList = By.xpath("//img[@class='iconAppMenuClosed"+ menu +"']");
			driverHelper.scrollIntoView(menuList);
			driverHelper.embedScreenshot(scenario);
			driverHelper.jsClick(menuList);
		}
	}
	
	/**
	 * Click Gestione from the submenu list
	 */
	public void clickGestione() {
		log.entry();
		driverHelper.waitForPageLoaded();
		driverHelper.scrollIntoView(link_GestioneCalendario);
		driverHelper.embedScreenshot(scenario);
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
			driverHelper.embedScreenshot(scenario);
			driverHelper.jsClick(link_RicercheCalendario);
            break;
		case "CONCORSO":
			driverHelper.scrollIntoView(link_RicercheConcorso);
			driverHelper.embedScreenshot(scenario);
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
		driverHelper.embedScreenshot(scenario);
		driverHelper.jsClick(link_OperativitaCalendario);
	}
	
	/**
	 * Click Gestione Tabelle Tipologiche from the submenu list
	 */
	public void clickGestioneTabelleTipologiche() {
		log.entry();
		driverHelper.waitForPageLoaded();
		driverHelper.scrollIntoView(link_GestioneTabelleTipologicheSistema);
		driverHelper.embedScreenshot(scenario);
		driverHelper.jsClick(link_GestioneTabelleTipologicheSistema);
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
			driverHelper.embedScreenshot(scenario);
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
				driverHelper.embedScreenshot(scenario);
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
		        case "Atti":
					if(PropertyUtil.getTestDataProp("landing.page.atti").equals(titleName)) {
						log.info("Navigate to page successfully.");
						log.exit();
						return true;
					}
		            break;
		        case "Attivazione Provvedimento":
					if(PropertyUtil.getTestDataProp("landing.page.attivazione.povvedimento").equals(titleName)) {
						log.info("Navigate to page successfully.");
						log.exit();
						return true;
					}
		        case "Azione Provvedimento":
					if(PropertyUtil.getTestDataProp("landing.page.azione.provvedimento").equals(titleName)) {
						log.info("Navigate to page successfully.");
						log.exit();
						return true;
					}
		            break;
		        case "Azione e Variazione Programma Organizzativo":
					if(PropertyUtil.getTestDataProp("landing.page.azione.e.variazione.programma.organizzativo").equals(titleName)) {
						log.info("Navigate to page successfully.");
						log.exit();
						return true;
					}
		            break;
		        case "Cause Servizio":
					if(PropertyUtil.getTestDataProp("landing.page.cause.servizio").equals(titleName)) {
						log.info("Navigate to page successfully.");
						log.exit();
						return true;
					}
		            break;
		        case "Cessazioni e Riammissioni":
					if(PropertyUtil.getTestDataProp("landing.page.cessazioni.e.riammissioni").equals(titleName)) {
						log.info("Navigate to page successfully.");
						log.exit();
						return true;
					}
		            break;
		        case "Conferimento Funzioni":
					if(PropertyUtil.getTestDataProp("landing.page.conferimento.funzioni").equals(titleName)) {
						log.info("Navigate to page successfully.");
						log.exit();
						return true;
					}
		            break;
		        case "Disagi":
					if(PropertyUtil.getTestDataProp("landing.page.disagi").equals(titleName)) {
						log.info("Navigate to page successfully.");
						log.exit();
						return true;
					}
		            break;
		        case "Esiti Ricorsi":
					if(PropertyUtil.getTestDataProp("landing.page.esiti.ricorsi").equals(titleName)) {
						log.info("Navigate to page successfully.");
						log.exit();
						return true;
					}
		            break;
		        case "Esecuzione e Variazione Programma Organizzativo":
					if(PropertyUtil.getTestDataProp("landing.page.esecuzione.e.variazione.programma.organizzativo").equals(titleName)) {
						log.info("Navigate to page successfully.");
						log.exit();
						return true;
					}
		            break;
		        case "Esiti Valutazioni":
					if(PropertyUtil.getTestDataProp("landing.page.esiti.valutazioni").equals(titleName)) {
						log.info("Navigate to page successfully.");
						log.exit();
						return true;
					}
		            break;
		        case "Fonte Incarico Magistrato":
					if(PropertyUtil.getTestDataProp("landing.page.fonte.incarico.magistrato").equals(titleName)) {
						log.info("Navigate to page successfully.");
						log.exit();
						return true;
					}
		            break;
		        case "Fonti Autorizzanti":
					if(PropertyUtil.getTestDataProp("landing.page.fonti.autorizzanti").equals(titleName)) {
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
