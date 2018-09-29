package com.stepdefinition;

import com.ObjectRepository.FlightInfo;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FlightInfoSteps extends FunctionalLibrary {

	@When("^The search by route for the details \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_search_by_route_for_the_details_and(String source, String destination, String date)
			throws Throwable {
		FlightInfo flightinfo = new FlightInfo();

		click(flightinfo.getRouteDownArrow());
		click(flightinfo.getDrpDwn_Route());
		click(flightinfo.getTxtBox_Origin());
		setText(flightinfo.getTxtBox_Origin(), source);
		click(flightinfo.getSourceDrpdwnOption());
		click(flightinfo.getTxtBox_Destination());
		setText(flightinfo.getTxtBox_Destination(), destination);
		click(flightinfo.getDestinationDrpdwnOption());
		click(flightinfo.getDepatureDateIcon());
		click(flightinfo.getDateSeptember29());

	}

	@When("^Click search button$")
	public void click_search_button() throws Throwable {
		FlightInfo flightinfo = new FlightInfo();
		click(flightinfo.getFlightStatusButton());
	}

}
