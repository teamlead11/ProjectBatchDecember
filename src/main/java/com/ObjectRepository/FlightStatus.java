package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class FlightStatus {

	@FindBy(xpath = "//div[@id='flightn']//div")
	private WebElement flightNumber;

	@FindBy(xpath = "(//span[@class='datapanelfrom'])[1]")
	private WebElement sourceLocation;

	@FindBy(xpath = "(//span[@class='datapanelto'])[1]")
	private WebElement destinationLocation;

	public FlightStatus() {
		PageFactory.initElements(FunctionalLibrary.driver, this);

	}

	public WebElement getFlightNumber() {
		return flightNumber;
	}

	public WebElement getSourceLocation() {
		return sourceLocation;
	}

	public WebElement getDestinationLocation() {
		return destinationLocation;
	}

}
