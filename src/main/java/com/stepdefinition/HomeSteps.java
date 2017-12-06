package com.stepdefinition;

import org.junit.Assert;

import com.ObjectRepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeSteps extends FunctionalLibrary {
	@Given("^I am in PHP travel home page$")
	public void i_am_in_PHP_travel_home_page() throws Throwable {
		FunctionalLibrary.driver.get("http://www.phptravels.net/");
	}

	@When("^I select language \"([^\"]*)\" from dropdown$")
	public void i_select_language_from_dropdown(String language) throws Throwable {
		HomePage homepage = new HomePage();
		clickjs(homepage.getlnkLanguage());
		switch (language) {
		case "English":
			click(homepage.getLnkEnglishLanguage());
			break;
		case "French":
			click(homepage.getLnkFrenchLanguage());
			break;
		}

	}

	@Then("^I verify the selected \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_verify_the_selected_and(String language, String value) throws Throwable {
		HomePage homepage = new HomePage();
		switch (language) {
		case "English":
			Assert.assertEquals(value, getText(homepage.getLblLocation()));
			break;
		case "French":
			Assert.assertEquals(value, getText(homepage.getLblLocation()));
			break;
		}
	}
}
