package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.ObjectRepository.VacationPackages;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VacationPackagesSteps extends FunctionalLibrary {
	@Given("^I am on delta login page$")
	public void i_am_on_delta_login_page() throws Throwable {
		driver.get("https://www.delta.com");
	}

	@When("^I enter the valid details$")
	public void i_enter_the_valid_details() throws Throwable {
		VacationPackages v = new VacationPackages();
		click(v.getLnkVacation());
		click(v.getCloseBtn());
		setText(v.getTxtFromLocation(), "LAX");
		selectByIndex(v.getTxtFromLocation(), 0);
		setText(v.getTxtToLocation(), "cal");
		selectByValue(v.getTxtToLocation(), "YYC");
		setText(v.getDepartureDate(), "02/01/2018");
		setText(v.getReturnDate(), "02/15/2018");
		click(v.getDrpdwnAdult());
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight,15");
		Thread.sleep(5000);
		v.dropDown("5");
		click(v.getBtnSubmit());
	}

	@When("^Check wether the application navigates to next page$")
	public void check_wether_the_application_navigates_to_next_page() throws Throwable {
		VacationPackages v = new VacationPackages();
		Thread.sleep(2500);
		v.sortingTheHotel("price");
		click(v.getBtnSelect());
		click(v.getLoadBtn());
		Thread.sleep(5000);
		v.sortingOutboundFlight("price");
		Thread.sleep(1500);
		click(v.getBtnSelectOutboundFlight());
		click(v.getLoadBtn());
		Thread.sleep(5000);
		v.sortingOutboundFlight("price");
		Thread.sleep(1500);
		click(v.getBtnSelectOutboundFlight());
		click(v.getLoadBtn());
		v.rentingCarBasedOnPrice("Intermediate car");
		click(driver.findElement(By.xpath("(//button[text()='ADD'])[3]")));

	}

	@Then("^I verify all the details$")
	public void i_verify_all_the_details() throws Throwable {
	}

}
