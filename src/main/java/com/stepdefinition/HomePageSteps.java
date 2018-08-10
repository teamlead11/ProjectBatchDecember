package com.stepdefinition;

import com.ObjectRepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends FunctionalLibrary {

	@Given("^The User is in Delta homepage$")
	public void the_User_is_in_Delta_homepage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://www.delta.com/");
	}

	@Given("^The User clicks the OneWay button$")
	public void the_User_clicks_the_OneWay_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HomePage home = new HomePage();
		click(home.getBtnOneWay());
	}

	@When("^The User enters the input for origin,destination and journey date$")
	public void the_User_enters_the_input_for_origin_destination_and_journey_date() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("^The user clicks find a flight button$")
	public void the_user_clicks_find_a_flight_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^The user should be in search results page$")
	public void the_user_should_be_in_search_results_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

}
