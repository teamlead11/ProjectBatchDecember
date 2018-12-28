package com.stepdefinition;

import java.util.List;

import org.junit.Assert;

import com.ObjectRepository.SearchHotelAction;
import com.resources.FunctionalLibrary;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchHotelActionSteps extends FunctionalLibrary {
	@When("^user click submit button without entering informations$")
	public void user_click_submit_button_without_entering_informations() throws Throwable {
		SearchHotelAction s=new SearchHotelAction();
		click(s.getButton_SearchHotel());
	}

	@Then("^user should see tbe error message$")
	public void user_should_see_tbe_error_message(DataTable errormsg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<String> asList = errormsg.asList(String.class);
		SearchHotelAction s=new SearchHotelAction();
		Assert.assertEquals(asList.get(0),s.getError_Message_1().getText());
		Assert.assertEquals(asList.get(1),s.getError_Message_2().getText());
		Assert.assertEquals(asList.get(2),s.getError_Message_3().getText());
	}

}
