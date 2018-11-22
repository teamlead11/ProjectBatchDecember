package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class EnrollPage {

	@FindBy(xpath = "//span[@id='aType-1-button']/span[@class='ui-icon ui-icon-triangle-1-s']")
	private WebElement drpdwn_adressType;

	@FindBy(xpath = "//ul[@id='aType-1-menu']/li[@role='option']")
	private WebElement drpDwn_adressType_options;

	public WebElement getDrpDwn_adressType_options() {
		return drpDwn_adressType_options;
	}

	public WebElement getDrpdwn_adressType() {
		return drpdwn_adressType;
	}

	EnrollPage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}
}
