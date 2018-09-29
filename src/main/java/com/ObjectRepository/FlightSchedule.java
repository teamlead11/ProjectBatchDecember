package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class FlightSchedule {

	public FlightSchedule() {
		PageFactory.initElements(FunctionalLibrary.driver, this);

	}

	@FindBy(xpath = "//td[@class='first col-flight']//a")
	private List<WebElement> flightNumList;

	public List<WebElement> getFlightNumList() {
		return flightNumList;
	}

}
