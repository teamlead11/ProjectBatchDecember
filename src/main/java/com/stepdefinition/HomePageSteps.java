package com.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

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
		HomePage home = new HomePage();
		click(home.getDropDown_TriptypeSelect());
		click(home.getDropDown_TripType());
	}

	@When("^The user select date from Web calendar \"([^\"]*)\"$")
	public void the_user_selct_date_from_Web_calendar(String date) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HomePage home = new HomePage();
		click(home.getBtn_Depart());
		home.SelectDateFromWebCalendar(date);
		click(home.getSelect_Date_Done());
	}

	@When("^The user select date from Web calendar \"([^\"]*)\",\"([^\"]*)\"$")
	public void the_user_selct_date_from_Web_calendar(String depDate, String RetDate) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HomePage home = new HomePage();
		click(home.getBtn_Depart());
		home.SelectDateFromWebCalendar(depDate);
		home.SelectDateFromWebCalendar(RetDate);
	}

	@When("^The user clicks submit button$")
	public void the_user_clicks_submit_button() throws Throwable {
		// // Write code here that turns the phrase above into concrete actions
		HomePage home = new HomePage();
		click(home.getBtn_submit());
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
		home.getTxt_txt_SearchInputName().sendKeys(Keys.ENTER);
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
		click(home.getBtn_submit());

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

	@Given("^The user navigates to flight status page$")
	public void the_user_navigates_to_flight_status_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HomePage home = new HomePage();
		click(home.getLnk_FlightStatus());
	}

	@When("^The user enters flight number \"([^\"]*)\" and date \"([^\"]*)\"$")
	public void the_user_enters_flight_number_and_date(String flightNum, String date) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HomePage home = new HomePage();
		click(home.getCal_departureDate());
		home.SelectDateFromWebCalendar(date);
		setText(home.getTxt_flightNumber(), flightNum);
		click(home.getBtn_submit());
	}

	@Given("^The user navigates to enrollment page$")
	public void the_user_navigates_to_enrollment_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HomePage home = new HomePage();
		click(home.getLnk_signup());
	}

	@Given("^The user selects book menu option$")
	public void the_user_selects_book_menu_option() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HomePage home = new HomePage();
		click(home.getMenu_book());
	}

	@When("^The user fill in the details$")
	public void the_user_fill_in_the_details(DataTable details) throws Throwable {
		List<String> detailsList = details.asList(String.class);
		HomePage home = new HomePage();
		click(home.getLnk_SourceName());
		setText(home.getTxt_txt_SearchInputName(), detailsList.get(0));
		waitForElementVisibility(home.getEle_AiportList());
		home.getTxt_txt_SearchInputName().sendKeys(Keys.ENTER);
		waitForElementClickable(home.getLnk_DestName());
		click(home.getLnk_DestName());
		setText(home.getTxt_txt_SearchInputName(), detailsList.get(1));
		waitForElementVisibility(home.getEle_AiportList());
		home.getTxt_txt_SearchInputName().sendKeys(Keys.ENTER);
		waitForElementClickable(home.getDrp_tripTypeDownArrow());
		click(home.getDrp_tripTypeDownArrow());
		home.SelectByText(detailsList.get(2));
		click(home.getCal_departureDate());
		home.SelectDateFromWebCalendar(detailsList.get(3));
		click(home.getDrp_PassengerCountDownArrow());
		home.SelectByText(detailsList.get(4));

	}

	@When("^The user clicks the submit button$")
	public void the_user_clicks_the_submit_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HomePage home = new HomePage();
		click(home.getBtn_bookSubmit());
	}

	@Given("^The user navigates to rent a car page$")
	public void the_user_navigates_to_rent_a_car_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HomePage home = new HomePage();
		click(home.getMenu_More());
		click(home.getMenu_RentACar());
	}

	@Given("^user navigate to search for a hotel$")
	public void user_navigate_to_search_for_a_hotel() throws Throwable {
		HomePage home = new HomePage();
		click(home.getMenu_More());
		click(home.getMenu_ShopHotel());
	}
}
	