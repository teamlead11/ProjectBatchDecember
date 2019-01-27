package com.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.ObjectRepository.AircraftPage;
import com.resources.FunctionalLibrary;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AircraftSteps extends FunctionalLibrary {

	@When("^The user selects the boeing under our aircraft section$")
	public void the_user_selects_the_boeing_under_our_aircraft_section() throws Throwable {
		AircraftPage air = new AircraftPage();
		click(air.getLnk_ourAirCratft());
		click(air.getLnk_boeing());
	}

	@Then("^The user should see the list of aircrafts$")
	public void the_user_should_see_the_list_of_aircrafts(DataTable aircraftList) throws Throwable {
		List<String> expectedAirCraftList = aircraftList.asList(String.class);
		List<String> actualAircraftList = new ArrayList<String>();
		AircraftPage air = new AircraftPage();
		List<WebElement> airCraftElements = air.getList_boeingAirCratft();
		for (WebElement airCraftElement : airCraftElements) {
			actualAircraftList.add(airCraftElement.getText());
		}
		Assert.assertEquals(expectedAirCraftList, actualAircraftList);
	}

}
