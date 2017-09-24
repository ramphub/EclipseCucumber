package com.cucu;

import org.openqa.selenium.By;

import com.selenium.WebSeleniumFunctions;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Steps to execute in cucumber. These steps will in turn call the selenium
 * functions in {@link WebSeleniumFunctions}}
 * 
 * @author ramp
 *
 */
@CucumberOptions(features = "src/Features", glue = "com.cucu.CloneSimpleSteps")
public class CloneSimpleSteps {
	private WebSeleniumFunctions webFunc = new WebSeleniumFunctions();

	@Given("^I browse to CLONES website$")
	public void i_browse_to_CLONES_website() throws Throwable {
		webFunc.createDriver();
	}

	@And("^I check for \"([^\"]*)\" link$")
	public void check_for_link(String linkName) throws Throwable {
		webFunc.isLinkPresent(linkName);
	}

	@When("^User clicks on the \"([^\"]*)\" Link$")
	public void click_training_link(String link) throws Throwable {
		webFunc.clickOnLink(link);
	}

	@Then("^Display training PDF$")
	public void displayTrainingPDF() {

	}

}
