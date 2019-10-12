package com.stepdefinition;
import com.demoguru.BookingPage;
import com.repository.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingWithExcel extends Base{
	BookingPage bk=new BookingPage();
	
	@Given("booking screen")
	public void booking_screen() {
		launch("http://demo.guru99.com/telecom/addcustomer.php");
		System.out.println("Browser launched");
		}

	@When("entering details")
	public void entering_details() {
		click(bk.getCheck());
		type(bk.getFname(),readvalue().get(1).get("Firstname"));
		type(bk.getLname(),readvalue().get(1).get("Lastname"));
		type(bk.getEmail(),readvalue().get(1).get("Email"));
		type(bk.getAddress(),readvalue().get(1).get("Address"));
		type(bk.getMobno(),readvalue().get(1).get("MobileNo"));
		}

	@Then("booking confirmaiton screen")
	public void booking_confirmaiton_screen() {
	 System.out.println("Booking sucess");
	}



}
