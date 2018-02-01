package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.resources.FunctionalLibrary;



public class DeltaCom extends FunctionalLibrary {
	
	@FindBy(id="book-delta-vacations-content-trigger")
	private WebElement btnVacation;
	
	@FindBy(id="flightCarTab")
	private WebElement btnFlightCar;
	
	@FindBy(id="flightCarFromCityLookup")
	private WebElement lctnFromCity;
	
	@FindBy(id="id='flightCarToCityLookup'")
	private WebElement lctnToCity;
	
	@FindBy(id="flightCarVacationsdepartureDate")
	private WebElement txtDepDate;
	
	@FindBy(id="id='flightCarVacationsreturnDate'")
	private WebElement txtRetDate;
	
	@FindBy(id="flightCarAdultCount-menu")
	private WebElement btnAdultCt;
	
	@FindBy(className = "ui-selectmenu-text")
	private WebElement drpDownadult;
	
	@FindBy(id="flightCarVacationsSubmit")
	private WebElement clkSubmit;
	
	public WebElement getbtnVacation() {
		return btnVacation;
	}
	
	public WebElement getBtnFlightCar() {
		return btnFlightCar;
	}
	
	public WebElement getLctnFromCity() {
		return lctnFromCity;
	}
	
	public WebElement getLctnToCity() {
		return lctnToCity;
	}
	
	public WebElement getTxtDepDate() {
		return txtDepDate;
	}
	
	public WebElement getTxtRetDate() {
		return txtRetDate;
	}
	
	public WebElement getBtnAdultCt() {
		return btnAdultCt;
	}
	
	public WebElement getDrpdwnAdult() {
		return drpDownadult;
	}
	
	public WebElement getClkSubmit() {
		return clkSubmit;
	}
	
	 public DeltaCom() {
		 PageFactory.initElements(driver, this);	 
		
	}
	
	public void dropDown(String Count) {
		click(getDrpdwnAdult());
		WebElement drpDown = driver.findElement(By.xpath("//ul[@id='adultCount-menu']"));
		if (drpDown.isEnabled()) {
			List<WebElement> listOfElements = drpDown.findElements(By.tagName("li"));
			for (WebElement value : listOfElements) {
				String text = value.getText();
				if (text.equals(Count)) {
				}
				WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.visibilityOf(value));
				value.click();
			}
		}
	}
}

	
	
	
	
	
