package com.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.ObjectRepository.EnrollPage;
import com.resources.FunctionalLibrary;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EnrolmentSteps extends FunctionalLibrary {

	@When("^The user selects the adress type dropdown$")
	public void the_user_selects_the_adress_type_dropdown() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		EnrollPage enroll = new EnrollPage();
		waitForElementClickable(enroll.getDrpdwn_adressType());
		clickjs(enroll.getDrpdwn_adressType());
	}

	@Then("^The user should see the options$")
	public void the_user_should_see_the_options(DataTable xpectedOptions) throws Throwable {
		EnrollPage enroll = new EnrollPage();
		List<String> expectedOptionsList = xpectedOptions.asList(String.class);
		List<WebElement> EleActualOptions = enroll.getDrpDwn_adressType_options();

		for (int i = 0; i < EleActualOptions.size(); i++) {
			Assert.assertTrue(expectedOptionsList.contains(EleActualOptions.get(i).getText()));
		}
	}
}
