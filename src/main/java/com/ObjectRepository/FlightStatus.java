package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class FlightStatus extends FunctionalLibrary {

	@FindBy(id = "navFlightStatus")
	private WebElement flightStatusLink;

	@FindBy(xpath = "(//*[@class='ui-selectmenu-text'])[17]")
	private WebElement flightDateDdn;

	@FindBy(xpath = "(//*[@id='FLIFO_flightNumber'])")
	private WebElement flightNumber;

	@FindBy(xpath = "(//*[@id='FLIFO_departureAirport'])")
	private WebElement from;

	@FindBy(xpath = "(//*[@id='FLIFO_arrivalAirport'])")
	private WebElement to;

	@FindBy(xpath = "(//*[@id='FLIFO_go'])")
	private WebElement viewStatusBtn;
	
	@FindBy(id="filghtdownarrow")
	private WebElement flightDownArrow;
	
	@FindBy(xpath = "//*[@class='baf']")
	private WebElement bookThisFlight;

	public WebElement getBookThisFlight() {
		return bookThisFlight;
	}

	public WebElement getFlightDownArrow() {
		return flightDownArrow;
	}

	public WebElement getFlightStatusLink() {
		return flightStatusLink;
	}

	public WebElement getFlightDateDdn() {
		return flightDateDdn;
	}

	public WebElement getFlightNumber() {
		return flightNumber;
	}

	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getViewStatusBtn() {
		return viewStatusBtn;
	}

	public FlightStatus() {
		PageFactory.initElements(driver, this);
	}

}
