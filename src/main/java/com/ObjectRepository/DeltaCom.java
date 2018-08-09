package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.resources.FunctionalLibrary;

public class DeltaCom extends FunctionalLibrary {

	@FindBy(id = "book-delta-vacations-content-trigger")
	private WebElement btnVacation;

	public WebElement getbtnVacation() {
		return btnVacation;
	}

	public DeltaCom() {
		PageFactory.initElements(driver, this);

	}

}
