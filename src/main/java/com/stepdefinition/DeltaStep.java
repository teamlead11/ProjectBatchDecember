package com.stepdefinition;

import com.ObjectRepository.DeltaCom;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeltaStep extends FunctionalLibrary {
	@Given("^Iam in delta\\.com homepage$")
	public void iam_in_delta_com_homepage() throws Throwable {

		driver.get("https://www.delta.com/");
	}

	@When("^I able to see and click the vacation$")
	public void i_able_to_see_and_click_the_vacation() throws Throwable {
		DeltaCom d = new DeltaCom();
		click(d.getbtnVacation());
	}

	@When("^Iam able to book the flight and car$")
	public void iam_able_to_book_the_flight_and_car() throws Throwable {
		DeltaCom d = new DeltaCom();
		click(d.getBtnFlightCar());
		setText(d.getLctnFromCity(), "LAX");
		selectByIndex(d.getLctnFromCity(), 1);
		setText(d.getLctnToCity(), "cal");
		selectByValue(d.getLctnToCity(), "YYC");
		setText(d.getTxtDepDate(), "02/01/2018");
		setText(d.getTxtRetDate(), "02/05/2018");
		click(d.getDrpdwnAdult());
		click(d.getBtnAdultCt());
		click(d.getDrpdwnAdult());
		click(d.getDrpdwnAdult());

	}
}