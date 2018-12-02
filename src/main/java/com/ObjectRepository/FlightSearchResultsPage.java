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

	@FindBy(xpath = "//div[@class='row flightPathWrapper']/div[2]/div/div[1]")
	private List<WebElement> txt_sourceText;

	@FindBy(xpath = "//div[@class='row flightPathWrapper']/div[2]/div/div[2]")
	private List<WebElement> txt_destinationText;

	@FindBy(xpath = "//div[@class='flightNumber paddingTop2']//a")
	private List<WebElement> lnk_FlightNum;

	public List<WebElement> getLnk_FlightNum() {
		return lnk_FlightNum;
	}

	public List<WebElement> getTxt_sourceText() {
		return txt_sourceText;
	}

	public List<WebElement> getTxt_destinationText() {
		return txt_destinationText;
	}

}
