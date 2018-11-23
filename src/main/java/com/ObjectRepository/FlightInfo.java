package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class FlightInfo {

	public FlightInfo() {

		PageFactory.initElements(FunctionalLibrary.driver, this);

	}

	@FindBy(id = "departcitylink")
	private WebElement departcitylink;

	@FindBy(id = "arrivalcitylink")
	private WebElement arrivalcitylink;

	@FindBy(id = "search_input")
	private WebElement txt_SearchInput;

	@FindBy(className = "airport-list")
	private WebElement airportList;

	@FindBy(xpath = "//img[@id='ctryIcon']")
	private WebElement routeDownArrow;

	@FindBy(xpath = "//span[text()='Route']")
	private WebElement drpDwn_Route;

	@FindBy(id = "fromAirport")
	private WebElement txtBox_Origin;

	@FindBy(id = "ui-id-15")
	private WebElement sourceDrpdwnOption;

	@FindBy(id = "toAirport")
	private WebElement txtBox_Destination;

	@FindBy(id = "ui-id-16")
	private WebElement destinationDrpdwnOption;

	@FindBy(id = "input_departureDate_1")
	private WebElement depatureDateIcon;

	@FindBy(id = "btn-flight-sts-submit")
	private WebElement flightSubmitButton;

	public WebElement getDepartCityIcon() {
		return departcitylink;
	}

	public WebElement getArrivalCityIcon() {
		return arrivalcitylink;
	}

	public WebElement getTxt_SearchInput() {
		return txt_SearchInput;
	}

	public WebElement getAirportList() {
		return airportList;
	}

	public WebElement getRouteDownArrow() {
		return routeDownArrow;
	}

	public WebElement getDrpDwn_Route() {
		return drpDwn_Route;
	}

	public WebElement getTxtBox_Origin() {
		return txtBox_Origin;
	}

	public WebElement getSourceDrpdwnOption() {
		return sourceDrpdwnOption;
	}

	public WebElement getTxtBox_Destination() {
		return txtBox_Destination;
	}

	public WebElement getDestinationDrpdwnOption() {
		return destinationDrpdwnOption;
	}

	public WebElement getDepatureDateIcon() {
		return depatureDateIcon;
	}

	public WebElement getFlightSubmitButton() {
		return flightSubmitButton;
	}

}
