package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class HomePage {

	@FindBy(xpath = "/html/body/div[3]/div/div/div[2]/ul/ul/ul/li/a")
	private WebElement lnkLanguage;

	@FindBy(xpath = "(//a[@id='fr'])[2]")
	private WebElement lnkFrenchLanguage;

	@FindBy(xpath = "(//a[@id='en'])[2]")
	private WebElement lnkEnglishLanguage;
	
	@FindBy(xpath ="html/body/div[4]/div[2]/div[3]/div/div/div/form/div/div/label[1]")
	private WebElement lblLocation;

	/**
	 * Constructor to instantiate the page elements
	 */
	public HomePage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}

	// getter methods to access elements

	public WebElement getlnkLanguage() {
		return lnkLanguage;
	}

	public WebElement getLnkFrenchLanguage() {
		return lnkFrenchLanguage;
	}

	public WebElement getLnkEnglishLanguage() {
		return lnkEnglishLanguage;
	}
	public WebElement getLblLocation() {
		return lblLocation;
	}

}
