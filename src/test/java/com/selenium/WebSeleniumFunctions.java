package com.selenium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Selenium fuctions
 * 
 * When it comes to identifying DOM elements in the HTML, Chrome debugging tools are very handy. (F12)
 * 
 * for instance if you want to look at a link element, right click and select 'Inspect Element'
 * 
 * @author ramp
 *
 */
public class WebSeleniumFunctions {
	public static WebDriver webDriver = null;
	public static WebDriverWait webDriverWait = null;

	public static String clonesURL = "https://codecenter.commonlanguage.com/";

	/**
	 * Runs the instance of the selenium driver (in this case it is chrome, we can
	 * download for firefox too.) Not sure if there is a driver for IE
	 * 
	 * Or which I like the best : headless (we will go over it later. not important now.
	 * ).
	 * 
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	public void createDriver() throws MalformedURLException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./seleniumdrivers/chromedriver.exe");
		webDriver = new ChromeDriver();

		// webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		webDriver.get(clonesURL);

		webDriverWait = new WebDriverWait(webDriver, 15);
	}

	/**
	 * Cleanup and exit
	 */
	public void teardown() {
		webDriver.quit();
	}

	/**
	 * Generic function to click on a link..
	 * 
	 * Best thing to do is, create these generic functions to do basic operations
	 * like.. clicking on links, checking for HTML elements with ID, to input data
	 * to a form and use them everywhere..
	 * 
	 * as we do this, we will quickly learn more advanced selenium functions..
	 * 
	 * @param linkName
	 */
	public void isLinkPresent(String linkName) {
		webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkName)));
		webDriver.findElement(By.linkText(linkName)).isDisplayed();
	}

	/**
	 * Click on a  link..
	 * 
	 * @param link
	 */
	public void clickOnLink(String link) {
		isLinkPresent(link);
		webDriver.findElement(By.linkText(link)).click();
	}

}
