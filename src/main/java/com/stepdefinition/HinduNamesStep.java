package com.stepdefinition;

import java.util.List;

import org.junit.Assert;

import com.ObjectRepository.HinduNamesPom;
import com.resources.FunctionalLibrary;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HinduNamesStep extends FunctionalLibrary {
	@Given("^I am in hindunames\\.net homepage$")
	public void i_am_in_hindunames_net_homepage() throws Throwable {
		driver.get("https://hindunames.net/");
	}

	@When("^I give the alphabet i want to navigate to$")
	public void i_give_the_alphabet_i_want_to_navigate_to(DataTable alphabet) throws Throwable {
		HinduNamesPom Hinduname = new HinduNamesPom();
		List<String> pageNo = alphabet.asList(String.class);
		for (String x : pageNo) {
			HinduNamesPom.GotoAlphabet(x);
		}
	}

	@Then("^I verify given alphabet pages is navigated$")
	public void i_verify_given_alphabet_pages_is_navigated(DataTable alphabet) throws Throwable {
		HinduNamesPom Hinduname = new HinduNamesPom();
		List<String> pageNo = alphabet.asList(String.class);
		for (String x : pageNo) {
			Assert.assertEquals(x, Hinduname.getVerify());
		}
	}
}
