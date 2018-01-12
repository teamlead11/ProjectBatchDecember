package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class HotelsPage {

	@FindBy(xpath = "//h4[@class='RTL go-text-right mt0 list_title']//b")
	private List<WebElement> hotelNames;

	@FindBy(className = "padding-zero")
	private static List<WebElement> btnDetails;

	@FindBy(xpath = "//*[@href='http://www.phptravels.net/hotels']")
	private WebElement hoteltitlelink;

	@FindBy(xpath = "//*[@class='btn btn-warning btn-xs btn-block']")
	private WebElement filterbtn;

	@FindBy(xpath = " //*[@data-target='#collapse1']")
	private WebElement stargradebtn;

	@FindBy(xpath = " //*[@data-target='#collapse2']")
	private WebElement pricerangebtn;

	@FindBy(xpath = " //*[@data-target='#collapse3']")
	private WebElement propertytypesbtn;

	@FindBy(xpath = " //*[@data-target='#collapse4']")
	private WebElement amenitiesbtn;

	@FindBy(className = "rating")
	private WebElement lnkRating;

	public List<WebElement> getHotelNames() {
		return hotelNames;
	}

	public List<WebElement> getBtnDetails() {
		return btnDetails;
	}

	@FindBy(xpath = "//button[text()= 'Details']")
	private List<WebElement> btnDetail;

	public List<WebElement> getBtnDetail() {
		return btnDetail;
	}

	public HotelsPage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}

	public WebElement getLnkRating() {
		return lnkRating;
	}

	public WebElement getfilerbtn() {
		return filterbtn;
	}

	public WebElement getstargradebtn() {
		return stargradebtn;
	}

	public WebElement getpricerangebtn() {
		return pricerangebtn;
	}

	public WebElement getpropertytypesbtn() {
		return propertytypesbtn;
	}

	public WebElement getamenitiesbtn() {
		return amenitiesbtn;
	}

	public WebElement gethoteltitlelink() {
		return hoteltitlelink;
	}

	public void goToHotelDetails(String name) {
		WebElement reqdBtn = null;
		List<WebElement> allHotelNames = getHotelNames();
		List<WebElement> reqBtnDetail = getBtnDetail();
		for (int i = 0; i <= allHotelNames.size(); i++) {
			String actualHtlNames = allHotelNames.get(i).findElement(By.xpath("..")).getText();
			if (actualHtlNames.equals(name)) {
				reqdBtn = reqBtnDetail.get(i);
				break;
			}

		}
		FunctionalLibrary.click(reqdBtn);
	}

	public void getRating(String number) {

		WebElement getrating = null;

		WebElement ratingLink = getLnkRating();

		List<WebElement> details = ratingLink.findElements(By.xpath("//*[@class='iradio_square-grey']"));

		int size = details.size();

		System.out.println(size);
		for (int i = 0; i < size; i++) {

			if (details.get(i).getText().equals(number)) {

				getrating = details.get(i);

				break;
			}
		}

		getrating.click();
	}

}
