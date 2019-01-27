package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);

	}

	@FindBy(xpath = "//button[@class='donebutton']")
	private WebElement Select_Date_Done;

	@FindBy(id = "fromAirportName")
	private WebElement lnk_SourceName;

	@FindBy(id = "search_input")
	private WebElement txt_SearchInputName;

	@FindBy(id = "toAirportName")
	private WebElement lnk_DestName;

	@FindBy(id = "ui-list-selectTripType1")
	private WebElement DropDown_TripType;

	@FindBy(xpath = "(//span[@class='select-ui-icon icon-Dropdown-caret'])[1]")
	private WebElement DropDown_TriptypeSelect;

	@FindBy(id = "btn-book-submit")
	private WebElement Btn_bookSubmit;

	@FindBy(id = "calDepartLabelCont")
	private WebElement Btn_Depart;

	@FindBy(xpath = "(//li[@class='airport-list ng-star-inserted'])[1]")
	private WebElement List_Airport;

	@FindBy(xpath = "(//span[@class='select-ui-icon icon-Dropdown-caret'])[1]")
	private WebElement tripType_Arrow;

	@FindBy(xpath = "(//span[@class='select-ui-icon icon-Dropdown-caret'])[2]")
	private WebElement passengerCount_Arrow;

	@FindBy(xpath = "//a[contains(@class,'flightstatus')]")
	private WebElement menuFlighStatus;

	@FindBy(xpath = "(//a[text()='More '])[1]")
	private WebElement lnk_moreMenu;

	@FindBy(xpath = "//a[contains(@id,'primary-static-link-')]")
	private List<WebElement> morePrimaryMenu;

	@FindBy(xpath = "(//a[text()='Travel Info '])[1]")
	private WebElement lnk_travelInfo;

	@FindBy(id = "secondary-static-link-9")
	private WebElement lnk_aircraft;

	@FindBy(id = "flightNo")
	private WebElement txt_flightNumber;

	@FindBy(id = "input_departureDate_1")
	private WebElement cal_departureDate;

	@FindBy(id = "btn-book-submit")
	private WebElement Btn_submit;

	@FindBy(xpath = "(//a[text()='Sign Up'])[1]")
	private WebElement lnk_signup;

	@FindBy(xpath = "//a[text()='BOOK' and @role='menuitem'] ")
	private WebElement menu_book;

	@FindBy(id = "input_returnDate_1")
	private WebElement cal_departDate;

	@FindBy(xpath = "(//a[contains(@class,'static-link-more')])[1]")
	private WebElement menu_More;

	@FindBy(xpath = "//a[text()='Rent a Car']")
	private WebElement menu_RentACar;

	@FindBy(xpath = "//a[text()='Shop Hotels']")
	private WebElement menu_ShopHotel;

	public WebElement getMenu_ShopHotel() {
		return menu_ShopHotel;
	}

	public WebElement getMenu_More() {
		return menu_More;
	}

	public WebElement getDropDown_TriptypeSelect() {
		return DropDown_TriptypeSelect;
	}

	public WebElement getMenu_RentACar() {
		return menu_RentACar;
	}

	public WebElement getMenu_book() {
		return menu_book;
	}

	public WebElement getLnk_signup() {
		return lnk_signup;
	}

	public WebElement getTxt_flightNumber() {
		return txt_flightNumber;
	}

	public WebElement getCal_departureDate() {
		return cal_departureDate;
	}

	public WebElement getBtn_submit() {
		return Btn_submit;
	}

	public WebElement getLnk_moreMenu() {
		return lnk_moreMenu;
	}

	public List<WebElement> getMorePrimaryMenu() {
		return morePrimaryMenu;
	}

	public WebElement getLnk_SourceName() {
		return lnk_SourceName;
	}

	public WebElement getLnk_FlightStatus() {
		return menuFlighStatus;
	}

	public WebElement getDrp_tripTypeDownArrow() {
		return tripType_Arrow;
	}

	public WebElement getDrp_PassengerCountDownArrow() {
		return passengerCount_Arrow;
	}

	public WebElement getEle_AiportList() {
		return List_Airport;
	}

	public WebElement getBtn_Depart() {
		return Btn_Depart;
	}

	public WebElement getTxt_txt_SearchInputName() {
		return txt_SearchInputName;
	}

	public WebElement getLnk_DestName() {
		return lnk_DestName;
	}

	public WebElement getDropDown_TripType() {
		return DropDown_TripType;
	}

	public WebElement getBtn_bookSubmit() {
		return Btn_bookSubmit;
	}

	public WebElement getCal_departDate() {
		return cal_departDate;
	}

	public WebElement getSelect_Date_Done() {
		return Select_Date_Done;
	}

	public WebElement getLnk_travelInfo() {
		return lnk_travelInfo;
	}

	public WebElement getLnk_aircraft() {
		return lnk_aircraft;
	}

	public void SelectDateFromWebCalendar(String date) {

		String locator = "//div//table//tbody//tr//td//a[contains(@data-date,'$')]";
		locator = locator.replace("$", date);
		FunctionalLibrary.click(FunctionalLibrary.driver.findElement(By.xpath(locator)));
	}

	public void SelectByText(String value) {
		String locator = "//li[text()='$']";
		locator = locator.replace("$", value);
		FunctionalLibrary.driver.findElement(By.xpath(locator)).click();

	}
}