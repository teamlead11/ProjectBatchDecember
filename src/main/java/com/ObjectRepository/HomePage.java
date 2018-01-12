package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetPageSource;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class HomePage {

	@FindBy(xpath = "html/body/div[4]/div/div/div[2]/ul/ul/ul/li/a")
	private WebElement lnkLanguage;

	@FindBy(xpath = "(//a[@id='fr'])[2]")
	private WebElement lnkFrenchLanguage;

	@FindBy(xpath = "(//a[@id='ir'])[2]")
	private WebElement lnkEnglishLanguage;

	@FindBy(xpath = "html/body/div[4]/div[2]/div[3]/div/div/div/form/div/div/label[1]")
	private WebElement lblLocation;

	@FindBy(className = "RTL_Bar")
	private WebElement searchAreaParent;

	@FindBy(xpath = "//b//small")
	private List<WebElement> ElmUSD;
	
	@FindBy(className="pagination-margin")
	private WebElement pageNation;
	
	@FindBy(xpath="/html/body/nav[1]/div/div/div/ul/li[2]/a")
	private WebElement NavigationHotels;

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

	public WebElement getSearchSectionParent() {
		return searchAreaParent;
	}

	public List<WebElement> getElementUSD() {
		return ElmUSD;
	}

	public WebElement getpageNationParent(){
		return pageNation;
	}
	
	public WebElement elementHotelsPage(){
		return NavigationHotels;
	}
	public void getExpectedUSD(String requiredusd) {
		List<WebElement> allUSD = getElementUSD();
		WebElement requiredElement = null;

		for (int i = 0; i < allUSD.size(); i++) {
			String actualusd = allUSD.get(i).findElement(By.xpath("..")).getText();
			if (actualusd.contains(requiredusd)) {
				List<WebElement> elements = FunctionalLibrary.driver
						.findElements(By.xpath("//button[text()='Details']"));
				requiredElement = elements.get(i);
				break;
			}
		}
		FunctionalLibrary.click(requiredElement);
	}
	
	public void goToPage(String pageNumber){
		WebElement requiredElement=null;
		WebElement pageParent = getpageNationParent();
		List<WebElement> pages = pageParent.findElements(By.tagName("li"));
		System.out.println(pages.size() + "no of pages in the module");
		
		for(int i=0; i<pages.size();i++){
			System.out.println(pages.get(i).getText());
			if(pages.get(i).getText().equals(pageNumber)){
				requiredElement = pages.get(i);
				break;
			}
		}
		requiredElement.findElement(By.linkText("Course Details")).click();
	}
}
