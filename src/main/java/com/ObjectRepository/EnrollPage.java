package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class EnrollPage {

	@FindBy(xpath = "//span[@id='aType-1-button']/span[@class='ui-icon ui-icon-triangle-1-s']")
	private WebElement drpdwn_adressType;

	@FindBy(xpath = "//ul[@id='aType-1-menu']/li[@role='option']")
	private List<WebElement> drpDwn_adressType_options;

	public List<WebElement> getDrpDwn_adressType_options() {
		return drpDwn_adressType_options;
	}

	public WebElement getDrpdwn_adressType() {
		return drpdwn_adressType;
	}

	public EnrollPage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}
}
