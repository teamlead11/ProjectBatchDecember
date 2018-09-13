package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class FlightSearchResultsPage {

	public FlightSearchResultsPage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);

	}

	@FindBy(xpath = "//div[@class='flightNumber paddingTop2']//a")
	private List<WebElement> lnk_FlightNum;

	public List<WebElement> getLnk_FlightNum() {
		return lnk_FlightNum;
	}

}
