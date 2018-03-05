package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class FlipkartPom extends FunctionalLibrary  {
	
	@FindBy(xpath="//*[@id='container']/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input")
	public static WebElement searchTab;

	public static WebElement getSearchTab() {
		return searchTab;
	}
	
	@FindBy(xpath="//div[contains(text(), 'Apple iPhone 7 (Black, 32 GB)')]")
	public static WebElement product1;

	public static WebElement getProduct1() {
		return product1;
	}

	@FindBy(xpath="//div[contains(text(), 'Apple iPhone SE (Space Grey, 32 GB)')]")
	public static WebElement product2;
	
	@FindBy(xpath="//div[contains(text(), 'Apple iPhone SE (Rose Gold, 32 GB)')]")
	public static WebElement product3;
	
	@FindBy(xpath="//div[contains(text(), 'Apple iPhone 6 (Gold, 32 GB)')]")
	public static WebElement product4;
	
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div/div/div/div[1]/div/div[1]/div[2]/ul/li[1]/button")
	public static WebElement cart;
	
	public static WebElement getCart() {
		return cart;
	}

	//*[@id="container"]/div/div[1]/div/div/div[1]/div[2]/div/div[2]/div[1]/div/button[2]
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div/div/div[1]/div[3]/div/div/a/button")
	public static WebElement plus;
	
	public static WebElement getPlus() {
		return plus;
	}
	public static WebElement getProduct2() {
		return product2;
	}



	public static WebElement getProduct3() {
		return product3;
	}



	public static WebElement getProduct4() {
		return product4;
	}



	public FlipkartPom() {
		PageFactory.initElements(driver, this);
	}
}
