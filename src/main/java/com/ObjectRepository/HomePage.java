package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);

	}

	@FindBy(xpath = "//span[text()='One Way']")
	private WebElement btnOneWay;

	@FindBy(id = "originCity")
	private WebElement btnOrigin;

	@FindBy(id = "destinationCity")
	private WebElement btnDest;

	@FindBy(id = "departureDate")
	private WebElement btnDate;

	@FindBy(xpath = "//span[text()='Exact Dates']")
	private WebElement btnExactDate;

	@FindBy(xpath = "//span[text()='Flexible Days']")
	private WebElement btnFlexibleDays;

	@FindBy(xpath = "//span[text()='Money']")
	private WebElement btnMoney;

	@FindBy(xpath = "//span[text()='Miles']")
	private WebElement btnMiles;

	@FindBy(xpath = "//span[@id='paxCount-button'])")
	private WebElement btnPassengers;

	@FindBy(id = "findFlightsSubmit")
	private WebElement btnFindFlight;

	public WebElement getBtnOneWay() {
		return btnOneWay;
	}

	public void setBtnOneWay(WebElement btnOneWay) {
		this.btnOneWay = btnOneWay;
	}

	public WebElement getBtnOrigin() {
		return btnOrigin;
	}

	public void setBtnOrigin(WebElement btnOrigin) {
		this.btnOrigin = btnOrigin;
	}

	public WebElement getBtnDestination() {
		return btnDest;
	}

	public void setBtnDestination(WebElement btnDest) {
		this.btnDest = btnDest;
	}

	public WebElement getBtnDate() {
		return btnDate;
	}

	public void setBtnDate(WebElement btnDate) {
		this.btnDate = btnDate;
	}

	public WebElement getBtnExactDate() {
		return btnExactDate;
	}

	public void setBtnExactDate(WebElement btnExactDate) {
		this.btnExactDate = btnExactDate;
	}

	public WebElement getBtnFlexibleDays() {
		return btnFlexibleDays;
	}

	public void setBtnFlexibleDays(WebElement btnFlexibleDays) {
		this.btnFlexibleDays = btnFlexibleDays;
	}

	public WebElement getBtnMoney() {
		return btnMoney;
	}

	public void setBtnMoney(WebElement btnMoney) {
		this.btnMoney = btnMoney;
	}

	public WebElement getBtnMiles() {
		return btnMiles;
	}

	public void setBtnMiles(WebElement btnMiles) {
		this.btnMiles = btnMiles;
	}

	public WebElement getBtnPassengers() {
		return btnPassengers;
	}

	public void setBtnPassengers(WebElement btnPassengers) {
		this.btnPassengers = btnPassengers;
	}

	public WebElement getBtnFindFlight() {
		return btnFindFlight;
	}

	public void setBtnFlight(WebElement btnFlight) {
		this.btnFindFlight = btnFlight;
	}

}
