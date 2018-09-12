package com.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);

	}

	@FindBy(id = "fromAirportName")
	private WebElement lnk_SourceName;

	@FindBy(id = "search_input")
	private WebElement txt_sourceName;

	@FindBy(id = "toAirportName")
	private WebElement lnk_DestName;

	@FindBy(id = "search_input")
	private WebElement txt_DestName;

	@FindBy(id = "selectTripType-val")
	private WebElement DropDown_TripType;

	@FindBy(id = "btn-book-submit")
	private WebElement Btn_Submit;

	@FindBy(id = "input_departureDate_1")
	private WebElement Btn_Depart;

	@FindBy(xpath = "//li[@class='airport-list']")
	private WebElement List_Airport;

	public WebElement getLnk_SourceName() {
		return lnk_SourceName;
	}

	public WebElement getEle_AiportList() {
		return List_Airport;
	}

	public WebElement getBtn_Depart() {
		return Btn_Depart;
	}

	public WebElement getTxt_sourceName() {
		return txt_sourceName;
	}

	public WebElement getLnk_DestName() {
		return lnk_DestName;
	}

	public WebElement getTxt_DestName() {
		return txt_DestName;
	}

	public WebElement getDropDown_TripType() {
		return DropDown_TripType;
	}

	public WebElement getBtn_Submit() {
		return Btn_Submit;
	}

	public void SelectDateFromWebCalendar(String date) {

		String locator = "//div//table//tbody//tr//td//a[contains(@data-date,'$')]";
		locator = locator.replace("$", date);
		FunctionalLibrary.click(FunctionalLibrary.driver.findElement(By.xpath(locator)));
	}
}