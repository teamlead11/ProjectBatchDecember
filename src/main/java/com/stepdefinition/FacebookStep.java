package com.stepdefinition;

import org.openqa.selenium.Keys;

import com.ObjectRepository.FlipkartPom;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookStep extends FunctionalLibrary  {

	@Given("^I am in https://www\\.flipkart\\.com/ homepage$")
	public void i_am_in_https_www_flipkart_com_homepage() throws Throwable {
		driver.get("https://www.flipkart.com/");
	}

	@When("^I want to add four products in cart$")
	public void i_want_to_add_four_products_in_cart() throws Throwable {
		FlipkartPom fkp = new FlipkartPom();
		fkp.searchTab.sendKeys("iphone",Keys.ENTER);
		switchToWindow();
		fkp.product1.click();
		switchToWindow();
		fkp.cart.click();
		switchToWindow();
		fkp.plus.click();
		switchToMainWindow();
	}

	@When("^I want to remove last item from cart$")
	public void i_want_to_remove_last_item_from_cart() throws Throwable {
	
	}

	@Then("^I want to verify only three products in cart$")
	public void i_want_to_verify_only_three_products_in_cart() throws Throwable {
	
	}

}
