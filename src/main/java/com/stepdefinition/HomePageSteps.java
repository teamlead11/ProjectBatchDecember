package com.stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
	public void the_user_enters_source_and_destination(DataTable TravelDetails) throws Throwable {
		List<String> myList = TravelDetails.asList(String.class);
		HomePage home = new HomePage();
		click(home.getLnk_SourceName());
		setText(home.getTxt_txt_SearchInputName(), myList.get(0));
		waitForElementVisibility(home.getEle_AiportList());
		home.getTxt_txt_SearchInputName().sendKeys(Keys.ENTER);
		click(home.getLnk_DestName());
		setText(home.getTxt_txt_SearchInputName(), myList.get(1));
		waitForElementVisibility(home.getEle_AiportList());
		home.getTxt_txt_SearchInputName().sendKeys(Keys.ENTER);

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

	@When("^The user selects source and destination$")
	public void the_user_selects_source_and_destination(DataTable Traveldetails) throws Throwable {
		List<String> tripList = Traveldetails.asList(String.class);

		HomePage home = new HomePage();
		click(home.getLnk_SourceName());
		setText(home.getTxt_txt_SearchInputName(), tripList.get(0));
		waitForElementVisibility(home.getEle_AiportList());
		home.getTxt_txt_SearchInputName().sendKeys(Keys.ENTER);
		click(home.getLnk_DestName());
		setText(home.getTxt_txt_SearchInputName(), tripList.get(1));
		waitForElementVisibility(home.getEle_AiportList());
		home.getTxt_txt_SearchInputName().sendKeys("Hi", "");
	}

	@When("^The user selects trip type, dates and number of passengers$")
	public void the_user_selects_trip_type_dates_and_number_of_passengers(DataTable TripDetails) throws Throwable {
		HomePage home = new HomePage();
		List<String> tripList = TripDetails.asList(String.class);
		click(home.getDrp_tripTypeDownArrow());
		home.SelectByText(tripList.get(0));
		click(home.getBtn_Depart());
		home.SelectDateFromWebCalendar(tripList.get(1));
		home.SelectDateFromWebCalendar(tripList.get(2));
		click(home.getDrp_PassengerCountDownArrow());
		home.SelectByText(tripList.get(3));
		click(home.getBtn_Submit());

	}

	@Given("^The user naviagates to flight status page$")
	public void the_user_naviagates_to_flight_status_page() throws Throwable {
		HomePage home = new HomePage();
		click(home.getLnk_FlightStatus());
	}

	@When("^The user clicks more menu option$")
	public void the_user_clicks_more_menu_option() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HomePage home = new HomePage();
		click(home.getLnk_moreMenu());
	}

	@Then("^The user should see the list of menu items$")
	public void the_user_should_see_the_list_of_menu_items(DataTable menuList) throws Throwable {
		List<String> listMenuItems = menuList.asList(String.class);
		HomePage home = new HomePage();
		List<WebElement> menuElements = home.getMorePrimaryMenu();
		List<String> actualMenuList = new ArrayList<String>();
		for (WebElement menuElement : menuElements) {
			actualMenuList.add(menuElement.getText());
		}
		Assert.assertEquals(listMenuItems, actualMenuList);
	}

}
