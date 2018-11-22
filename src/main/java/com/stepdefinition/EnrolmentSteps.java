package com.stepdefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EnrolmentSteps {

	@When("^The user selects the adress type dropdown$")
	public void the_user_selects_the_adress_type_dropdown() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^The user should see the options$")
	public void the_user_should_see_the_options(DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
	}
}
