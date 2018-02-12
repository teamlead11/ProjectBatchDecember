package com.stepdefinition;

import com.ObjectRepository.FlightStatus;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightStatusSetpDefn extends FunctionalLibrary {
	
	@When("^I enter the flight number$")
	public void i_enter_the_flight_number() throws Throwable {
		FlightStatus fs = new FlightStatus();
		click(fs.getFlightStatusLink());
		setText(fs.getFlightNumber(), "2222");
		click(fs.getViewStatusBtn());
	}

	@When("^I enter the from and to location$")
	public void i_enter_the_from_and_to_location() throws Throwable {
		FlightStatus fs = new FlightStatus();
		click(fs.getFlightStatusLink());
		setText(fs.getFrom(), "LAX");
		setText(fs.getTo(), "MIA");
		click(fs.getViewStatusBtn());
	}
	
	@Then("^I validate the flight status based on flight number$")
	public void i_validate_the_flight_status_based_on_flight_number() throws Throwable {
		FlightStatus fs = new FlightStatus();
		isElementPresent(fs.getFlightDownArrow());
	}

	@Then("^I validate the flight status based on location$")
	public void i_validate_the_flight_status_based_on_location() throws Throwable {
		
	}


}
