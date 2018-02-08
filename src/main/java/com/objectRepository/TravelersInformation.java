package com.objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class TravelersInformation extends FunctionalLibrary {

	@FindBy(xpath = "//span[@id='adltPrefix-button']")
	private WebElement prefixDropDown;

	@FindBy(id = "adltFname")
	private WebElement adultFirstName;

	@FindBy(id = "adltLname")
	private WebElement adultLastName;

	@FindBy(id = "adltGender-button")
	private WebElement adultGender;

	@FindBy(id = "adltMonth-button")
	private WebElement adultDOBMonth;

	@FindBy(id = "adltDay-button")
	private WebElement adultDOBDay;

	@FindBy(id = "adltYear-button")
	private WebElement adultDOBYear;

	@FindBy(id = "deviceCountry-button")
	private WebElement countryCodeDropDown;

	@FindBy(id = "countryCode-menu")
	private WebElement countryCodeMenu;

	@FindBy(id = "phone")
	private WebElement txtPhone;

	@FindBy(id = "countryCode-button")
	private WebElement countryDropDown;

	@FindBy(id = "addrLine1")
	private WebElement addressLine1;

	@FindBy(id = "city")
	private WebElement txtCity;

	@FindBy(id = "state-button")
	private WebElement stateDropDown;

	@FindBy(id = "zip")
	private WebElement txtZipCode;

	@FindBy(id = "emailAddr")
	private WebElement txtEmail;

	@FindBy(id = "confirmEmailAddr")
	private WebElement txtConfirmEmail;

	@FindBy(id = "chPrefix1-button")
	private WebElement adultPrefix2;

	@FindBy(id = "chFname1")
	private WebElement adultFirstName2;

	@FindBy(id = "chLname1")
	private WebElement adultLastName2;

	@FindBy(id = "adltFlyerGender1-button")
	private WebElement genderAdult2;

	@FindBy(id = "dobMonth1-button")
	private WebElement dobMonth2;

	@FindBy(id = "dobDay1-button")
	private WebElement dobDay2;

	@FindBy(id = "dobYear1-button")
	private WebElement dobYear2;

	@FindBy(id = "bedsize0-button")
	private WebElement bedSizePreference;

	@FindBy(id = "smokingStat0-button")
	private WebElement smokingPrefernece;

	@FindBy(id = "Crib0")
	private WebElement bedCribAmenities;

	@FindBy(id = "Rollaway0")
	private WebElement bedRollAwayAmenities;

	@FindBy(id = "primary_driver-button")
	private WebElement primaryDriverDetails;

	@FindBy(xpath = "//div[@class='roomReqUl']")
	private WebElement checkBoxCarRequest;

	@FindBy(id = "adltGender-menu")
	private WebElement GenderMenu;

	@FindBy(id = "adltPrefix-menu")
	private WebElement PrefixTitle;

	@FindBy(id = "adltMonth-menu")
	private WebElement adlutMonthList;

	@FindBy(id = "	adltDay-menu")
	private WebElement adlutDayList;

	@FindBy(id = "adltYear-menu")
	private WebElement adlutYearList;

	@FindBy(id = "deviceCountry-menu")
	private WebElement countryCodeList;

	@FindBy(id = "state-menu")
	private WebElement StateList;

	@FindBy(id = "bedsize0-menu")
	private WebElement BedMenu;

	@FindBy(id = "smokingStat0-menu")
	private WebElement smokingMenu;

	@FindBy(id = "primary_driver-menu")
	private WebElement primaryDiver;
	
	@FindBy(xpath = "//button[text()='next']")
	private WebElement nextButton;
	

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getPrimaryDiver() {
		return primaryDiver;
	}

	public WebElement getSmokingMenu() {
		return smokingMenu;
	}

	public WebElement getBedMenu() {
		return BedMenu;
	}

	public WebElement getCountryCodeList() {
		return countryCodeList;
	}

	public WebElement getAdlutYearList() {
		return adlutYearList;
	}

	public WebElement getAdlutDayList() {
		return adlutDayList;
	}

	public WebElement getAdlutMonthList() {
		return adlutMonthList;
	}

	public WebElement getPrefixTitle() {
		return PrefixTitle;
	}

	public WebElement getGenderMenu() {
		return GenderMenu;
	}

	public WebElement getPrefixDropDown() {
		return prefixDropDown;
	}

	public WebElement getAdultFirstName() {
		return adultFirstName;
	}

	public WebElement getAdultLastName() {
		return adultLastName;
	}

	public WebElement getAdultGender() {
		return adultGender;
	}

	public WebElement getAdultDOBMonth() {
		return adultDOBMonth;
	}

	public WebElement getAdultDOBDay() {
		return adultDOBDay;
	}

	public WebElement getAdultDOBYear() {
		return adultDOBYear;
	}

	public WebElement getCountryCodeDropDown() {
		return countryCodeDropDown;
	}

	public WebElement getTxtPhone() {
		return txtPhone;
	}

	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getAddressLine1() {
		return addressLine1;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getTxtZipCode() {
		return txtZipCode;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtConfirmEmail() {
		return txtConfirmEmail;
	}

	public WebElement getAdultPrefix2() {
		return adultPrefix2;
	}

	public WebElement getAdultFirstName2() {
		return adultFirstName2;
	}

	public WebElement getAdultLastName2() {
		return adultLastName2;
	}

	public WebElement getGenderAdult2() {
		return genderAdult2;
	}

	public WebElement getDobMonth2() {
		return dobMonth2;
	}

	public WebElement getDobDay2() {
		return dobDay2;
	}

	public WebElement getDobYear2() {
		return dobYear2;
	}

	public WebElement getBedSizePreference() {
		return bedSizePreference;
	}

	public WebElement getSmokingPrefernece() {
		return smokingPrefernece;
	}

	public WebElement getBedCribAmenities() {
		return bedCribAmenities;
	}

	public WebElement getBedRollAwayAmenities() {
		return bedRollAwayAmenities;
	}

	public WebElement getPrimaryDriverDetails() {
		return primaryDriverDetails;
	}

	public WebElement getCheckBoxCarRequest() {
		return checkBoxCarRequest;
	}

	public WebElement getStateList() {
		return StateList;
	}

	public WebElement getCountryCodeMenu() {
		return countryCodeMenu;
	}

	public TravelersInformation() {
		PageFactory.initElements(driver, this);
	}

	public void genderSelectionAdult(String Gender) {
		WebElement genderTab = getAdultGender();
		click(genderTab);
		if (getGenderMenu().isDisplayed()) {
			List<WebElement> listOfGender = getGenderMenu().findElements(By.tagName("li"));
			for (WebElement adult : listOfGender) {
				String gender = adult.getText();
				if (gender.equalsIgnoreCase(Gender)) {
					click(adult);

				}
			}
		}
	}

	public void namePrefix(String prefixName) {
		WebElement NameTitle = getPrefixDropDown();
		click(NameTitle);
		if (getPrefixTitle().isDisplayed()) {
			List<WebElement> listOfPrefixs = getPrefixTitle().findElements(By.tagName("li"));
			for (WebElement title : listOfPrefixs) {
				String prefixes = title.getText();
				if (prefixes.equalsIgnoreCase(prefixName)) {
					click(title);

				}
			}

		}

	}

	public void dobMonth(String dobMonth) {
		WebElement adultDOBMonth2 = getAdultDOBMonth();
		click(adultDOBMonth2);
		if (getAdlutMonthList().isDisplayed()) {
			List<WebElement> listOfMonths = getAdlutMonthList().findElements(By.tagName("li"));
			for (WebElement months : listOfMonths) {
				String month = months.getText();
				if (month.equalsIgnoreCase(dobMonth)) {
					click(months);

				}

			}

		}

	}

	public void dobDay(String dobDay) {
		WebElement adultDOBdays = getAdultDOBDay();
		click(adultDOBdays);
		if (getAdlutDayList().isDisplayed()) {
			List<WebElement> listOfDays = getAdlutMonthList().findElements(By.tagName("li"));
			for (WebElement days : listOfDays) {
				String month = days.getText();
				if (month.equalsIgnoreCase(dobDay)) {
					click(days);

				}

			}

		}

	}

	public void dobYear(String dobYear) {
		WebElement adultDOByear = getAdultDOBDay();
		click(adultDOByear);
		if (getAdlutYearList().isDisplayed()) {
			List<WebElement> listOfyears = getAdlutMonthList().findElements(By.tagName("li"));
			for (WebElement years : listOfyears) {
				String month = years.getText();
				if (month.equalsIgnoreCase(dobYear)) {
					click(years);

				}

			}

		}

	}

	public void countryCode(String CountryCode) {
		WebElement CountryCodes = getCountryCodeDropDown();
		click(CountryCodes);
		if (getCountryCodeList().isDisplayed()) {
			List<WebElement> listOfCodes = getCountryCodeList().findElements(By.tagName("li"));
			for (WebElement countryCode : listOfCodes) {
				String month = countryCode.getText();
				if (month.equalsIgnoreCase(CountryCode)) {
					click(countryCode);

				}

			}

		}

	}

	public void countryNames(String countryName) {
		WebElement country = getCountryDropDown();
		click(country);
		if (getCountryCodeMenu().isDisplayed()) {
			List<WebElement> listOfCountry = getCountryCodeMenu().findElements(By.tagName("li"));
			for (WebElement countries : listOfCountry) {
				String month = countries.getText();
				if (month.equalsIgnoreCase(countryName)) {
					click(countries);

				}

			}

		}

	}

	public void StateNames(String StateName) {
		WebElement state = getCountryDropDown();
		click(state);
		if (getStateList().isDisplayed()) {
			List<WebElement> listOfStates = getStateList().findElements(By.tagName("li"));
			for (WebElement states : listOfStates) {
				String month = states.getText();
				if (month.equalsIgnoreCase(StateName)) {
					click(states);

				}

			}

		}

	}

	public void RoomRequestBedSize(String Bedsize) {
		WebElement BedPreference = getBedSizePreference();
		click(BedPreference);
		if (getBedMenu().isDisplayed()) {
			List<WebElement> listOfBedSize = getBedMenu().findElements(By.tagName("li"));
			for (WebElement Beds : listOfBedSize) {
				String month = Beds.getText();
				if (month.equalsIgnoreCase(Bedsize)) {
					click(Beds);

				}

			}

		}

	}

	public void RoomRequestSmoking(String Smoking) {
		WebElement smokingPreference = getSmokingPrefernece();
		click(smokingPreference);
		if (getSmokingMenu().isDisplayed()) {
			List<WebElement> smokingPref = getSmokingMenu().findElements(By.tagName("li"));
			for (WebElement Pref : smokingPref) {
				String month = Pref.getText();
				if (month.equalsIgnoreCase(Smoking)) {
					click(Pref);

				}

			}

		}

	}

	public void primaryDriverSelection(String PrimaryDriver) {
		WebElement primaryDriverPreference = getPrimaryDriverDetails();
		click(primaryDriverPreference);
		if (getPrimaryDiver().isDisplayed()) {
			List<WebElement> driverPref = getPrimaryDiver().findElements(By.tagName("li"));
			for (WebElement Pref : driverPref) {
				String month = Pref.getText();
				if (month.equalsIgnoreCase(PrimaryDriver)) {
					click(Pref);

				}

			}

		}

	}

}
