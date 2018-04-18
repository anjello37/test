package com.csm.utils;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.csm.constants.CommonConstants;

public class WebDriverHelper {
	private static final Logger log = LogManager.getLogger(WebDriverHelper.class);
	private WebDriver driver;

    public WebDriverHelper(WebDriver driver) {
        this.driver = driver;
    }
    
    public WebDriver getDriver() {
        return driver;
    }
    
    
    /**
     * Description: Switch to a specified frame
     */
    public void switchToFrame(By elementBy) {
        log.info("Switch to default content.");
        driver.switchTo().defaultContent();
        log.info("Switch to frame: " + elementBy);
        driver.switchTo().frame(driver.findElement(elementBy));
        log.info("Successfully Switched to frame: " + elementBy);
    }
    
    /**
     * Check if element is present
     * @param locator
     * @return
     */
    public boolean isElementPresent(By locator) {
    	driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    	WebDriverWait wait = new WebDriverWait(driver, CommonConstants.DEFAULT_WEBDRIVER_TIMEOUT);
    	try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			return true;
		} catch (Exception e) {
			log.error("Element is NOT present.",  e);
		} finally {
			driver.manage().timeouts().implicitlyWait(CommonConstants.DEFAULT_IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
		}
    	return false;
    }
    
    /**
     * Check if element is present
     * @param element
     * @return
     */
    public boolean isElementPresent(WebElement element) {
    	try {
    		element.isDisplayed();
    		return true;
		} catch (Exception e) {
			log.error("Element is NOT present.", e);
		}
    	return false;
    }
    
    /**
     * Check if element is visible in the page.
     * @param element
     * @return
     */
    public boolean isElementVisible(WebElement element) {
    	driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    	WebDriverWait wait = new WebDriverWait(driver, CommonConstants.DEFAULT_WEBDRIVER_TIMEOUT);
    	try {
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (Exception e) {
			log.error("Element is NOT visible.",  e);
		} finally {
			driver.manage().timeouts().implicitlyWait(CommonConstants.DEFAULT_IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
		}
    	return false;
    }

    /**
     * Click a button
     * @param buttonElement
     */
    public void clickButton(WebElement buttonElement) {
    	if (isElementPresent(buttonElement)) {
    		buttonElement.click();
    		log.info("Button is clicked.");
    	} else {
    		log.error("Button is NOT present.");
    	}
    }
    
    /**
     * Click a button
     * @param buttonElement
     */
    public void clickButton(By buttonElement) {
    	if (isElementPresent(buttonElement)) {
    		driver.findElement(buttonElement).click();
    		log.info("Button is clicked.");
    	} else {
    		log.error("Button is NOT present.");
    	}
    }
    
    /**
     * Description: Method to wait for page to get loaded
     */
    public void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver webdriver) {
                return ((JavascriptExecutor) webdriver).executeScript("return document.readyState").equals("complete");
            }
        };

        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(expectation);
        } catch (Exception e) {
            // Technically not an error so simply log as information
            log.error("document.readyState status not completed after {} seconds", 30);
        }
    }
    
    /**
     * Go to default content
     * 
     */
    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }
    
    /**
     * Scroll until the specified element is visible on screen
     * @param elementBy
     */
    public void scrollIntoView(By elementBy) {

        WebElement objElement = driver.findElement(elementBy);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView();", objElement);

    }
    
    /**
     * Scroll until the specified element is visible on screen
     * @param webElement
     */
    public void scrollIntoView(WebElement webElement) {

        WebElement objElement = webElement;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView();", objElement);
    }
    
    /**
     * Method to double click using actions
     * @param webElement        
     */
    public void doubleClickUsingAction(WebElement webElement) {

        try {

            if (isElementPresent(webElement)) {
                Actions actions = new Actions(driver);
                actions.doubleClick(webElement).build().perform();
            }

        } catch (Exception e) {
            log.info("Exception " + e);
        }
    }
    
    /**
     * Method to get text of an element
     * 
     * @param elementBy
     * @return
     * @throws InterruptedException
     */
    public String getText(WebElement webElement) {

        if (isElementPresent(webElement)) {

            return webElement.getText().trim();

        } else {
            return "";
        }
    }
    
    /**
     * Method to click element using javascript
     * 
     * @param elementBy
     * @throws InterruptedException
     */
    public void jsClick(By elementBy) {

        WebElement weElement = driver.findElement(elementBy);
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", weElement);
        } catch (Exception e) {
            log.info("Check element: " + elementBy);
        }
    }
    
    /**
     * Method to click element using javascript
     * 
     * @param WebElement
     * @throws InterruptedException
     */
    public void jsClick(WebElement webElement) {

        WebElement weElement = webElement;
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", weElement);
        } catch (Exception e) {
            log.info("Check element: " + webElement);
        }
    }
    
    /**
     * Method to select value for dropdown list
     * 
     * @param webElement
     * @param label
     */
    public void selectValue(WebElement webElement, String label) {
     Select actualSelect = new Select(webElement);
     actualSelect.selectByVisibleText(label);
    }
    
    public void get(String url) {
    	try {
    		driver.get(url);
    	} catch (TimeoutException e) {
    		Assert.fail("Page Load Timeout occurred after " + 30 + " seconds waiting time: " + e);
    	} catch (UnreachableBrowserException e) {
    		Assert.fail("Unreachable Browser Exception occurred: " + e);
    	} catch (Exception e) {
    		Assert.fail("Exception: " + e);
    	}
    }
}
