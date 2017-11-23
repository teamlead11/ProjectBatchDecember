package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class AdactinLoginPage {

	@FindBy(id = "username")
	private WebElement txtUserName;

	@FindBy(id = "password")
	private WebElement txtPassword;

	@FindBy(id = "login")
	private WebElement btnLogin;

	@FindBy(linkText = "New User Register Here")
	private WebElement lnkNewRegistration;

	@FindBy(partialLinkText = "Forgot Password")
	private WebElement lnkForgotPassword;

	@FindBy(xpath = "//a[@href='../HotelAppBuild2']")
	private WebElement lnkBuild2;

	/**
	 * Constructor to instantiate the page elements
	 */
	public AdactinLoginPage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}

	// getter methods to access elements

	public WebElement getUserNameTextField() {
		return txtUserName;
	}

	public WebElement getPasswordTextField() {
		return txtPassword;
	}

	public WebElement getSignInButton() {
		return btnLogin;
	}

}
