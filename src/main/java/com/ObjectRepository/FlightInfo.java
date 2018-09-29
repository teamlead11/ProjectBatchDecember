package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightInfo {

	@FindBy(xpath="//img[@id='ctryIcon']")
	private WebElement routeDownArrow;
	
	@FindBy(xpath="//span[text()='Route']")
	private WebElement drpDwn_Route;
	
	@FindBy(id="fromAirport")
	private WebElement txtBox_Origin;
	
	@FindBy(id="ui-id-15")
	private WebElement sourceDrpdwnOption;
	
	@FindBy(id="toAirport")
	private WebElement txtBox_Destination;
	
	@FindBy(id="ui-id-16")
	private WebElement destinationDrpdwnOption;
	
	@FindBy(id="departureDateIcon")
	private WebElement depatureDateIcon;
	
	@FindBy(xpath="//td[contains(@aria-label,'29')]")
	private WebElement DateSeptember29;
	
	@FindBy(xpath="//div[contains(@class,'flightstatuscall')]//button")
	private WebElement flightStatusButton;

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

	public WebElement getDateSeptember29() {
		return DateSeptember29;
	}

	public WebElement getFlightStatusButton() {
		return flightStatusButton;
	}
	
	
	
}
