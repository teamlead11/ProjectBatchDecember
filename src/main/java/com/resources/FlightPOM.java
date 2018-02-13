package com.resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPOM {
	
	//@FindBy(id="air-shopping-moreOptions-link")
	@FindBy(xpath="//a[@id='air-shopping-moreOptions-link']")
	private WebElement AdvSearch;
	
	@FindBy(xpath="//span[text()='One Way']")
	private WebElement Oneway;
	
	
	@FindBy(xpath="//span[text()='Round Trip']")
	private WebElement RoundTrip;
	
	
	@FindBy(id="shopping_originCity_0")
	private WebElement FromCity;
	
	@FindBy(id="originCity")
	private WebElement RFromCity;
	
	@FindBy(xpath="//li[text()='2']")
	private WebElement Roundtrippassenger;
	
	@FindBy(id="destinationCity")
	private WebElement RdestCity;
		
	
	@FindBy(id="shopping_destinationCity_0")
	private WebElement ToCity;
	
	@FindBy(id="departureDate")
	private WebElement RDepDate;

	@FindBy(id="findFlightsSubmit")
	private WebElement RFindbtn;

	
	@FindBy(xpath="//span[text()='1'][1]")
	private WebElement RPassenger;
	
	@FindBy(id="depDateCalIcon")
	private WebElement Roundtripdepdate;
	

	@FindBy(xpath="//a[text()='14']")
	private WebElement Rounddepdateclick;

	@FindBy(id="retDateCalIcon")
	private WebElement RoundRetdateclick;

	@FindBy(xpath="//a[text()='25']")
	private WebElement Roundretdateselect;
	
	@FindBy(id="returnDate")
	private WebElement RRetDate;

	
	@FindBy(id="shopping_departureDate_0")
	private WebElement DepDate;
	
	@FindBy(id="shopping_departureTimeOptions_0-button")
	private WebElement DepTime;
	
	
	@FindBy(xpath="//span[text()='1']")
	private WebElement Passenger;
	
	
	@FindBy(id="submitAdvanced")
	private WebElement Findflightbtn;
	
	
	//multicity webelements
	
	@FindBy(xpath="//label[text()='Multi-City']")
	private WebElement Mulcity;
	
	@FindBy(id="mc_shopping_originCity_0")
	private WebElement MCFromCity;
	
	
	@FindBy(name="mc_shopping_destinationCity_0")
	private WebElement MCToCity;
	
	@FindBy(id="mc_shopping_departureDate_0")
	private WebElement MCDepDate;
	
	@FindBy(id="mc_shopping_departureTimeOptions_0-button")
	private WebElement MCDepTime;
	
	
	@FindBy(id="mc_shopping_originCity_1")
	private WebElement MCFromCity1;
	
	
	@FindBy(name="mc_shopping_destinationCity_1")
	private WebElement MCToCity1;
	
	@FindBy(id="mc_shopping_departureDate_1")
	private WebElement MCDepDate1;
	
	@FindBy(id="mc_shopping_connectionCity_0")
	private WebElement MCConnect1;
	
	@FindBy(id="mc_shopping_connectionCity_1")
	private WebElement MCConnect2;
	
	
	
	
	@FindBy(id="submitAdvanced")
	private WebElement MCfindflightbtn;


	
	
	public WebElement getRFromCity() {
		return RFromCity;
	}




	public void setRFromCity(WebElement rFromCity) {
		RFromCity = rFromCity;
	}




	public WebElement getRdestCity() {
		return RdestCity;
	}




	public void setRdestCity(WebElement rdestCity) {
		RdestCity = rdestCity;
	}





	public WebElement getRoundtrippassenger() {
		return Roundtrippassenger;
	}




	public void setRoundtrippassenger(WebElement roundtrippassenger) {
		Roundtrippassenger = roundtrippassenger;
	}




	public WebElement getSMultitab() {
		return SMultitab;
	}




	public void setSMultitab(WebElement sMultitab) {
		SMultitab = sMultitab;
	}



	
	//simple search multicity webelements
	
	@FindBy(xpath="//span[text()='Multi-City']")
	private WebElement SMultitab;
	
	
	
	public WebElement getRFindbtn() {
		return RFindbtn;
	}




	public void setRFindbtn(WebElement rFindbtn) {
		RFindbtn = rFindbtn;
	}


	

	public WebElement getRoundRetdateclick() {
		return RoundRetdateclick;
	}




	public void setRoundRetdateclick(WebElement roundRetdateclick) {
		RoundRetdateclick = roundRetdateclick;
	}




	public WebElement getRoundretdateselect() {
		return Roundretdateselect;
	}




	public void setRoundretdateselect(WebElement roundretdateselect) {
		Roundretdateselect = roundretdateselect;
	}




	public WebElement getRounddepdateclick() {
		return Rounddepdateclick;
	}




	public void setRounddepdateclick(WebElement rounddepdateclick) {
		Rounddepdateclick = rounddepdateclick;
	}




	public WebElement getRoundtripdepdate() {
		return Roundtripdepdate;
	}




	public void setRoundtripdepdate(WebElement roundtripdepdate) {
		Roundtripdepdate = roundtripdepdate;
	}




	//public void setRdepdate(WebElement rdepdate) {
		//Rdepdate = rdepdate;
	//}




	public WebElement getRPassenger() {
		return RPassenger;
	}




	public void setRPassenger(WebElement rPassenger) {
		RPassenger = rPassenger;
	}




	public WebElement getRDepDate() {
		return RDepDate;
	}




	public void setRDepDate(WebElement rDepDate) {
		RDepDate = rDepDate;
	}




	public WebElement getRRetDate() {
		return RRetDate;
	}




	public void setRRetDate(WebElement rRetDate) {
		RRetDate = rRetDate;
	}





	public WebElement getAdvSearch() {
		return AdvSearch;
	}




	public WebElement getRoundTrip() {
		return RoundTrip;
	}




	public void setRoundTrip(WebElement roundTrip) {
		RoundTrip = roundTrip;
	}




	public void setAdvSearch(WebElement advSearch) {
		AdvSearch = advSearch;
	}




	public WebElement getOneway() {
		return Oneway;
	}




	public void setOneway(WebElement oneway) {
		Oneway = oneway;
	}




	public WebElement getFromCity() {
		return FromCity;
	}




	public void setFromCity(WebElement fromCity) {
		FromCity = fromCity;
	}




	public WebElement getToCity() {
		return ToCity;
	}




	public void setToCity(WebElement toCity) {
		ToCity = toCity;
	}




	public WebElement getDepDate() {
		return DepDate;
	}




	public void setDepDate(WebElement depDate) {
		DepDate = depDate;
	}




	public WebElement getDepTime() {
		return DepTime;
	}




	public void setDepTime(WebElement depTime) {
		DepTime = depTime;
	}




	public WebElement getPassenger() {
		return Passenger;
	}




	public void setPassenger(WebElement passenger) {
		Passenger = passenger;
	}




	public WebElement getFindflightbtn() {
		return Findflightbtn;
	}




	public void setFindflightbtn(WebElement findflightbtn) {
		Findflightbtn = findflightbtn;
	}




	public WebElement getMulcity() {
		return Mulcity;
	}




	public void setMulcity(WebElement mulcity) {
		Mulcity = mulcity;
	}




	public WebElement getMCFromCity() {
		return MCFromCity;
	}




	public void setMCFromCity(WebElement mCFromCity) {
		MCFromCity = mCFromCity;
	}




	public WebElement getMCToCity() {
		return MCToCity;
	}




	public void setMCToCity(WebElement mCToCity) {
		MCToCity = mCToCity;
	}




	public WebElement getMCDepDate() {
		return MCDepDate;
	}




	public void setMCDepDate(WebElement mCDepDate) {
		MCDepDate = mCDepDate;
	}




	public WebElement getMCDepTime() {
		return MCDepTime;
	}




	public void setMCDepTime(WebElement mCDepTime) {
		MCDepTime = mCDepTime;
	}




	public WebElement getMCFromCity1() {
		return MCFromCity1;
	}




	public void setMCFromCity1(WebElement mCFromCity1) {
		MCFromCity1 = mCFromCity1;
	}




	public WebElement getMCToCity1() {
		return MCToCity1;
	}




	public void setMCToCity1(WebElement mCToCity1) {
		MCToCity1 = mCToCity1;
	}




	public WebElement getMCDepDate1() {
		return MCDepDate1;
	}




	public void setMCDepDate1(WebElement mCDepDate1) {
		MCDepDate1 = mCDepDate1;
	}




	public WebElement getMCConnect1() {
		return MCConnect1;
	}




	public void setMCConnect1(WebElement mCConnect1) {
		MCConnect1 = mCConnect1;
	}




	public WebElement getMCConnect2() {
		return MCConnect2;
	}




	public void setMCConnect2(WebElement mCConnect2) {
		MCConnect2 = mCConnect2;
	}




	public WebElement getMCfindflightbtn() {
		return MCfindflightbtn;
	}




	public void setMCfindflightbtn(WebElement mCfindflightbtn) {
		MCfindflightbtn = mCfindflightbtn;
	}
	
	
	public FlightPOM() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}
	


}
