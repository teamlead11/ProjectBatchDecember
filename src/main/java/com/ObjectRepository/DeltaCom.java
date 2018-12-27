package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.resources.FunctionalLibrary;

public class DeltaCom extends FunctionalLibrary {

	@FindBy(id = "book-delta-vacations-content-trigger")
	private WebElement btnVacation;

	private static String name;

	public WebElement getbtnVacation() {
		System.out.println("element retrived");
		return btnVacation;
	}

	public DeltaCom() {
		PageFactory.initElements(FunctionalLibrary.driver, this);

	}

}
