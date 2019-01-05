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

	@FindBy(xpath = "//input[@id='input_origin_1']")
	private WebElement txt_sourceText;

	@FindBy(xpath = "//input[@id='input_destination_1']")
	private WebElement txt_destinationText;

	@FindBy(xpath = "(//span[@class='dl-modal-component-calling-element']//a[@class='tblHeadBigtext fliReslnkfltNum wrapWords'])[i]")
	private List<WebElement> lnk_FlightNum;
	
	@FindBy(xpath = "//div[text()='Atlanta, GA to Minneapolis/St Paul, MN']")
	private WebElement Flightsearchresult ;

	public WebElement getFlightsearchresult() {
		return Flightsearchresult;
	}

	public List<WebElement> getLnk_FlightNum() {
		return lnk_FlightNum;
	}

	public WebElement getTxt_sourceText() {
		return txt_sourceText;
	}

	public WebElement getTxt_destinationText() {
		return txt_destinationText;
	}

}
