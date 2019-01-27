package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class AircraftPage {

	public AircraftPage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);

	}

	@FindBy(xpath = "//a[contains(text(),'Our Aircraft ')]")
	private WebElement lnk_ourAirCratft;

	@FindBy(xpath = "//a[contains(text(),'Boeing') and @class='nav-item nav-item-drawer-link ']")
	private WebElement lnk_boeing;

	@FindBy(xpath = "//div[@id='collapseInner2']//li")
	private List<WebElement> list_boeingAirCratft;

	public WebElement getLnk_ourAirCratft() {
		return lnk_ourAirCratft;
	}

	public WebElement getLnk_boeing() {
		return lnk_boeing;
	}

	public List<WebElement> getList_boeingAirCratft() {
		return list_boeingAirCratft;
	}

}
