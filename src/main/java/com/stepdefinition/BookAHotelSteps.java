package com.stepdefinition;

import com.ObjectRepository.HomePage;
import com.ObjectRepository.ShopAHotel;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookAHotelSteps extends FunctionalLibrary {
	@Given("^The user navigates to shop a hotel page$")
	public void the_user_navigates_to_shop_a_hotel_page() throws Throwable {
	   ShopAHotel bookhotel= new ShopAHotel();
	   HomePage btn = new HomePage();
	   click(btn.getLnk_moreMenu());
	   click(bookhotel.getShop_Hotel());
	   
	 }

	@When("^The user enters the values to the fields \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_the_values_to_the_fields_and(String location, String checkIn, String checkOut, String rooms, String adults) throws Throwable {
		ShopAHotel bookhotel= new ShopAHotel();
		HomePage btn = new HomePage();
		setText(bookhotel.getHotelLocation(), location);
		setText(bookhotel.getHotelCheckInDate(), checkIn);
		setText(bookhotel.getHotelCheckOutDate(), checkOut);
		//btn.SelectDateFromWebCalendar(checkIn);
		//btn.SelectDateFromWebCalendar(checkIn);	
		selectByValue(bookhotel.getNoOfRooms(), rooms);
        setText(bookhotel.getDrpdown_Adults(), adults);
	}



	@Then("^The user clicks the book a hotel and earn miles$")
	public void the_user_clicks_the_book_a_hotel_and_earn_miles() throws Throwable {
		ShopAHotel bookhotel= new ShopAHotel();
 click(bookhotel.getBtn_bookAHotel());
// click(bookhotel.getBtn_RoomSubmit());
	}


}
