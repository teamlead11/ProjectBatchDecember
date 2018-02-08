package com.stepdefinition;

import org.openqa.selenium.By;

import com.objectRepository.TravelersInformation;
import com.objectRepository.VacationPackages;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Vacation extends FunctionalLibrary {
	@Given("^I am on delta home page$")
	public void i_am_on_delta_home_page() throws Throwable {
		driver.get("https://www.delta.com");
	}

	@When("^I enter the valid details in the vacation and hotle module$")
	public void i_enter_the_valid_details_in_the_vacation_and_hotle_module() throws Throwable {
		VacationPackages v = new VacationPackages();
		click(v.getLnkVacation());
		click(v.getCloseBtn());
		setText(v.getTxtFromLocation(), "LAX");
		selectByIndex(v.getTxtFromLocation(), 0);
		setText(v.getTxtToLocation(), "cal");
		selectByValue(v.getTxtToLocation(), "YYC");
		setText(v.getDepartureDate(), "02/15/2018");
		setText(v.getReturnDate(), "02/18/2018");
		click(v.getDrpdwnAdult());
		Thread.sleep(5000);
//		v.dropDown("1");
		click(v.getBtnSubmit());
		Thread.sleep(5000);
	}

	@When("^I book the hotel with lowest price$")
	public void i_book_the_hotel_with_lowest_price() throws Throwable {
		VacationPackages v = new VacationPackages();
		Thread.sleep(5000);
		v.sortingTheHotel("price");
		Thread.sleep(5000);
		click(v.getBtnSelect());
		click(v.getLoadBtn());
		Thread.sleep(2500);
		
	}

	@When("^I book the flight with lowest price$")
	public void i_book_the_flight_with_lowest_price() throws Throwable {
		VacationPackages v = new VacationPackages();
		v.sortingOutboundFlight("price");
		click(v.getBtnSelectOutboundFlight());
		click(v.getLoadBtn());

	}

	@When("^I book the return flight with lowest price$")
	public void i_book_the_return_flight_with_lowest_price() throws Throwable {
		VacationPackages v = new VacationPackages();
		v.sortingOutboundFlight("price");
		Thread.sleep(1500);
		click(v.getBtnSelectOutboundFlight());
		click(v.getLoadBtn());

	}

	@When("^I select the typr of car that required$")
	public void i_select_the_typr_of_car_that_required() throws Throwable {
		VacationPackages v = new VacationPackages();
		v.rentingCarBasedOnPrice("Intermediate");
		click(driver.findElement(By.xpath("(//button[text()='ADD'])[3]")));
	}

	@When("^I enter the travellers information for proceeding for payment checkout$")
	public void i_enter_the_travellers_information_for_proceeding_for_payment_checkout() throws Throwable {
		TravelersInformation t = new TravelersInformation();
		t.namePrefix("mr");
		setText(t.getAdultFirstName(), "rajasekar");
		setText(t.getAdultLastName(), "arunachalam");
		t.genderSelectionAdult("male");
		t.dobMonth("may");
		t.dobDay("24");
		t.dobYear("1991");
		t.countryCode("United States(+001)");
		setText(t.getTxtPhone(), "9876543");
		t.countryNames("United States");
		setText(t.getAddressLine1(), "no.6, vivekanandhar street,near califormia bus stand,usa");
		setText(t.getTxtCity(), "California");
		t.StateNames("california");
		setText(t.getTxtZipCode(), "90001");
		setText(t.getTxtEmail(), "raj@gmail.com");
		setText(t.getTxtConfirmEmail(), "raj@gmail.com");
		t.RoomRequestBedSize("king bed");
		t.RoomRequestSmoking("smoking");
		click(t.getBedCribAmenities());
		click(t.getBedRollAwayAmenities());
		t.primaryDriverSelection("rajasekar");
		click(t.getNextButton());

	}

	@Then("^I verify the travellers information$")
	public void i_verify_the_travellers_information() throws Throwable {
	}

}
