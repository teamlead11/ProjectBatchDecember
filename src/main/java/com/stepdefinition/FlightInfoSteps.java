package com.stepdefinition;

import org.openqa.selenium.NoAlertPresentException;

import com.ObjectRepository.FlightInfo;
import com.ObjectRepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FlightInfoSteps extends FunctionalLibrary {

	@When("^The user search by route for the details \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_search_by_route_for_the_details_and(String source, String destination, String date)
			throws Throwable {
		FlightInfo flightinfo = new FlightInfo();
		HomePage home = new HomePage();
		click(flightinfo.getDepatureDateIcon());
		home.SelectDateFromWebCalendar(date);
		click(flightinfo.getDepartCityIcon());
		setText(flightinfo.getTxt_SearchInput(), source);
		click(flightinfo.getAirportList());
		click(flightinfo.getArrivalCityIcon());
		setText(flightinfo.getTxt_SearchInput(), destination);
		click(flightinfo.getAirportList());
		
	}

	@When("^Click search button$")
	public void click_search_button() throws Throwable {
		FlightInfo flightinfo = new FlightInfo();
		click(flightinfo.getFlightSubmitButton());
	}

}
