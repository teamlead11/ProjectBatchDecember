package com.objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class VacationPackages extends FunctionalLibrary {

	@FindBy(id = "book-delta-vacations-content-trigger")
	private WebElement lnkVacation;

	@FindBy(id = "fromAirport")
	private WebElement txtFromLocation;

	@FindBy(id = "toAirport")
	private WebElement txtToLocation;

	@FindBy(id = "vacationsdepartureDate")
	private WebElement departureDate;

	@FindBy(xpath = "//div[@id='ui-datepicker-div']//table//tbody/tr")
	private WebElement tableRow;

	@FindBy(xpath = "(//span[@class='ui-selectmenu-text'])[19]")
	private WebElement month;

	@FindBy(id = "vacationsreturnDate")
	private WebElement returnDate;

	@FindBy(id = "adultCount-button")
	private WebElement drpdwnAdult;

	@FindBy(className = "ui-selectmenu-text")
	private WebElement drpDownSort;

	@FindBy(xpath = "//ul[@id='dataSort-menu']")
	private WebElement outboundFlightSorting;

	@FindBy(id = "vacationsSubmit")
	private WebElement btnSubmit;

	public WebElement getOutboundFlightSorting() {
		return outboundFlightSorting;
	}

	@FindBy(xpath = "(//span[@class='ui-button-icon-primary ui-icon ui-icon-closethick'])[1]")
	private WebElement closeBtn;

	@FindBy(xpath = "(//button[text()='select'])[1]")
	private WebElement btnSelectOutboundFlight;

	@FindBy(xpath = "(//button[text()='Select'])[1]")
	private WebElement btnSelect;

	@FindBy(xpath = "//button[text()='Next']")
	private WebElement loadBtn;

	@FindBy(xpath = "(//button[text()='ADD'])[2]")
	private WebElement btnAddCar;

	@FindBy(xpath = "driver.findElements(By.xpath(\"//h4[text()='OUR NEW AIRBUS A350']")
	private WebElement lnkAirBus;

	@FindBy(id = "rentalCarSpotlightContainer")
	private WebElement carRental;

	@FindBy(xpath = "//span[@title='price range minimum']")
	private WebElement sliderMinPrice;

	@FindBy(xpath = "//span[@title='price range maximum']")
	private WebElement sliderMaxPrice;

	public WebElement getSliderMinPrice() {
		return sliderMinPrice;
	}

	public WebElement getSliderMaxPrice() {
		return sliderMaxPrice;
	}

	public WebElement getCarRental() {
		return carRental;
	}

	public WebElement getDrpDownSort() {
		return drpDownSort;
	}

	public WebElement getBtnSelectOutboundFlight() {
		return btnSelectOutboundFlight;
	}

	public WebElement getBtnAddCar() {
		return btnAddCar;
	}

	public WebElement getLoadBtn() {
		return loadBtn;
	}

	public WebElement getLnkAirBus() {
		return lnkAirBus;
	}

	public WebElement getCloseBtn() {
		return closeBtn;
	}

	public WebElement getLnkVacation() {
		return lnkVacation;
	}

	public WebElement getTxtFromLocation() {
		return txtFromLocation;
	}

	public WebElement getBtnSelect() {
		return btnSelect;
	}

	public WebElement getTxtToLocation() {
		return txtToLocation;
	}

	public WebElement getDepartureDate() {
		return departureDate;
	}

	public WebElement getReturnDate() {
		return returnDate;
	}

	public WebElement getDrpdwnAdult() {
		return drpdwnAdult;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getTableRow() {
		return tableRow;
	}

	public VacationPackages() {
		PageFactory.initElements(driver, this);
	}

	public void slideraction() {
		WebElement s = getSliderMinPrice();
		Actions a = new Actions(driver);
		a.dragAndDropBy(s, 30, 0).build().perform();
	}

	public void dropDown(String Count) {
		click(getDrpdwnAdult());
		WebElement adultList = driver.findElement(By.xpath("//ul[@id='adultCount-menu']"));
		if (adultList.isEnabled()) {
			List<WebElement> listOfAdult = adultList.findElements(By.tagName("li"));
			for (WebElement noOfAdults : listOfAdult) {
				String text = noOfAdults.getText();
				System.out.println(text);
				if (text.equals(Count)) {
				}
				click(noOfAdults);
			}
		}
	}

	public void sortingTheHotel(String name) {
		click(getDrpDownSort());
		WebElement hotelList = driver.findElement(By.id("stateProv-menu"));
		if (hotelList.isDisplayed()) {
			List<WebElement> allValues = hotelList.findElements(By.tagName("li"));
			for (WebElement hotelName : allValues) {
				String text = hotelName.getText();
				if (text.equalsIgnoreCase(name)) {
					click(hotelName);

				}
			}

		}
	}

	public void sortingOutboundFlight(String name) {
		WebElement sorting = getDrpDownSort();
		click(sorting);
		WebElement list = driver.findElement(By.xpath("//ul[@id='dataSort-menu']"));
		if (list.isDisplayed()) {
			List<WebElement> allValues = list.findElements(By.tagName("li"));
			for (WebElement x : allValues) {
				String text = x.getText();
				if (text.equalsIgnoreCase(name)) {
					click(x);

				}
			}

		}
	}

	public void rentingCarBasedOnPrice(String nameOfCars) {
		WebElement carRental2 = getCarRental();
		WebElement modeOfCars = carRental2.findElement(By.tagName("ul"));
		List<WebElement> listOfCars = modeOfCars.findElements(By.tagName("li"));
		for (WebElement x : listOfCars) {
			String cars = x.getText();
			if (cars.contains(nameOfCars)) {
				click(x);

			}
		}

	}

}
