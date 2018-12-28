package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class SearchHotelAction {
	
	public SearchHotelAction() {
		PageFactory.initElements(FunctionalLibrary.driver, this);

	}
	@FindBy(xpath = "//input[@id='btnSubmit']")
	private WebElement button_SearchHotel;

	@FindBy(xpath = "//label[@id='destinationCityCodeLocation' and @class='errIcon']")
	private WebElement error_Message_1;
	
	@FindBy(xpath="//label[@for='hotelCheckInDate' and @class='errIcon']")
	private WebElement error_Message_2;
	
	@FindBy(xpath="//label[@id='checkOutHotelLabel' and @class='errIcon']")
	private WebElement error_Message_3;

	public WebElement getButton_SearchHotel() {
		return button_SearchHotel;
	}

	public WebElement getError_Message_1() {
		return error_Message_1;
	}

	public WebElement getError_Message_2() {
		return error_Message_2;
	}

	public WebElement getError_Message_3() {
		return error_Message_3;
	}
}
