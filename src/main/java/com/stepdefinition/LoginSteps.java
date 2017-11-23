package com.stepdefinition;

import org.openqa.selenium.By;

import com.ObjectRepository.AdactinLoginPage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends FunctionalLibrary {

	@Given("^I access the appllication$")
	public void i_access_the_appllication() throws Throwable {

	}

	@When("^I enter the valid \"([^\"]*)\" and \"([^\"]*)\" without email verification$")
	public void i_enter_the_valid_and_without_email_verification(String username, String password) throws Throwable {
		AdactinLoginPage loginpage = new AdactinLoginPage();
		setText(loginpage.getUserNameTextField(), username);
		setText(loginpage.getPasswordTextField(), password);
		click(loginpage.getSignInButton());

	}

	@Then("^I verify the \"([^\"]*)\"$")
	public void i_verify_the(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}
}
