package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.resources.FlightPOM;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightStep extends FunctionalLibrary {
	
	
	@Given("^I want to launch delta website$")
	public void i_want_to_launch_delta_website() throws Throwable {
	  	driver.get("https://www.delta.com/");
			//FlightPOM FPOM1=new FlightPOM();
			//FPOM1.getAdvSearch().click();
			
			
			// driver.findElement(By.xpath("//a[@id='air-shopping-moreOptions-link']")).click();
		
	}

	@When("^I Book oneway trip$")
	public void i_Book_oneway_trip() throws Throwable {
		
		
	  
		
	}

	@When("^I Book RoundTrip$")
	public void i_Book_RoundTrip() throws Throwable {
		
		FlightPOM FPOM1=new FlightPOM();
		//FPOM1.getOneway().click();
		click(FPOM1.getRoundTrip());
		
		setText(FPOM1.getRFromCity(),"ATL");
		setText(FPOM1.getRdestCity(),"ABY");
		
		setText(FPOM1.getRDepDate(),"01/31/2018");
		setText(FPOM1.getRRetDate(),"02/04/2018");
		setText(FPOM1.getRPassenger(),"2");
	click(FPOM1.getRFindbtn());
	}

	@When("^I Book Multicity trip$")
	public void i_Book_Multicity_trip() throws Throwable {
		}

	@Then("^I click lower price flight$")
	public void i_click_lower_price_flight() throws Throwable {
	 
	}


}
