package com.stepdefinition;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import com.ObjectRepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends FunctionalLibrary {

	@Given("^The User is in Delta homepage$")
	public void the_User_is_in_Delta_homepage() throws Throwable {
		driver.get("https://www.delta.com/");
	}

	@When("^The user enters source and destination$")
	public void the_user_enters_source_and_destination() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HomePage home = new HomePage();
		click(home.getLnk_SourceName());
		setText(home.getTxt_sourceName(), "ATL");
		home.getTxt_sourceName().sendKeys(Keys.ENTER);
		click(home.getLnk_DestName());
		setText(home.getTxt_DestName(), "MSP");
		home.getTxt_DestName().sendKeys(Keys.ENTER);

	}

	@When("^The user select oneway trip$")
	public void the_user_select_oneway_trip() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		// selectByValue((home.getDropDown_TripType(),);
	}

	@When("^The user selct date from Web calendar \"([^\"]*)\"$")
	public void the_user_selct_date_from_Web_calendar(String date) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HomePage home = new HomePage();
		click(home.getBtn_Depart());
		home.SelectDateFromWebCalendar(date);
	}

	@When("^The user selct date from Web calendar \"([^\"]*)\" ,\"([^\"]*)\"$")
	public void the_user_selct_date_from_Web_calendar(String depDate, String RetDate) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HomePage home = new HomePage();
		click(home.getBtn_Depart());
		home.SelectDateFromWebCalendar(depDate);
		home.SelectDateFromWebCalendar(RetDate);
	}

	@When("^The user clicks submit button$")
	public void the_user_clicks_submit_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HomePage home = new HomePage();
		click(home.getBtn_Submit());
	}

}
