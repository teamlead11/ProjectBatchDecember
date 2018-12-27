package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class SearchCarAction {

	public SearchCarAction() {
		PageFactory.initElements(FunctionalLibrary.driver, this);

	}

	@FindBy(xpath = "//input[@value='Book a Car']")
	private WebElement btn_BookACar;

	@FindBy(xpath = "//a[@data-form='searchCarForm']")
	private WebElement msg_errormessageHeader;
	
	@FindBy(xpath = "//div[@id='pickupLocationFieldset']//label[@class='errIcon']")
	private WebElement msg_pickupLocationError;

	public WebElement getBtn_BookACar() {
		return btn_BookACar;
	}

	public WebElement getMsg_errormessageHeader() {
		return msg_errormessageHeader;
	}

	public WebElement getMsg_pickupLocationError() {
		return msg_pickupLocationError;
	}
	
	
}
