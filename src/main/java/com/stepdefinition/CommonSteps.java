
package com.stepdefinition;

import com.ObjectRepository.FlightStatus;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;

public class CommonSteps extends FunctionalLibrary {
	FlightStatus fs = new FlightStatus();

	@Given("^I am on delta website page$")
	public void i_am_on_delta_website_page() throws Throwable {
		driver.get("https://www.delta.com/");
	}

}
