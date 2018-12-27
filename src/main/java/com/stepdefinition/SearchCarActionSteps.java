package com.stepdefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import org.junit.Assert;

import com.ObjectRepository.*;
import com.resources.FunctionalLibrary;

public class SearchCarActionSteps extends FunctionalLibrary {

	@When("^The user clicks the book a car buton$")
	public void the_user_clicks_the_book_a_car_buton() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SearchCarAction carrent = new SearchCarAction();
		click(carrent.getBtn_BookACar());

	}

	@Then("^The user should see the error messages$")
	public void the_user_should_see_the_error_messages(DataTable errorMessage) throws Throwable {
		SearchCarAction carrent = new SearchCarAction();
		List<String> errorMessageList = errorMessage.asList(String.class);
		Assert.assertEquals(errorMessageList.get(0), carrent.getMsg_errormessageHeader().getText().trim());
	}

}
