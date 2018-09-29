package com.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.ObjectRepository.FlightSchedule;

import cucumber.api.java.en.Then;

public class FlightScheduleStep {

	@Then("^User validates the list of flights \"([^\"]*)\"$")
	public void user_validates_the_list_of_flights(String expectedFlightList) throws Throwable {
		FlightSchedule flightsch = new FlightSchedule();
		List<String> actualFlightList = new ArrayList<String>();
		List<WebElement> flightListsEle = flightsch.getFlightNumList();
		for (WebElement flightListEle : flightListsEle) {
			actualFlightList.add(flightListEle.getText());
		}
		String[] expectedflight = expectedFlightList.split(",");

		Assert.assertTrue(actualFlightList.contains(expectedflight[0]));
		Assert.assertTrue(actualFlightList.contains(expectedflight[1]));
	}
}
