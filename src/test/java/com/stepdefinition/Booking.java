package com.stepdefinition;

import java.util.List;

import com.demoguru.BookingPage;
import com.repository.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Booking extends Base{
	BookingPage b=new BookingPage();
	@Given("customer on booking page")
	public void customer_on_booking_page() {
	 System.out.println("booking page");
	 launch("http://demo.guru99.com/telecom/addcustomer.php");
	}
	

	@When("enter booking detials")
	public void enter_booking_detials(DataTable dataTable) throws InterruptedException {
		List<String> li=dataTable.asList(String.class);
		click(b.getCheck());
	    type(b.getFname(), li.get(0));
	    type(b.getLname(),li.get(1));
	    type(b.getEmail(),li.get(2));
	    type(b.getAddress(),li.get(3));
	    type(b.getMobno(),li.get(4));
	    Thread.sleep(5000);
	    click(b.getSubmit());
	    	}
	@When("enter details{string},{string},{string},{string},{string}")
	public void enter_details(String s1, String s2, String s3, String s4, String s5) throws InterruptedException {
		click(b.getCheck());
		type(b.getFname(),s1);
		type(b.getLname(),s2);
		type(b.getEmail(),s3);
		type(b.getAddress(),s4);
		type(b.getMobno(),s5);
		Thread.sleep(20000);
		click(b.getSubmit());
	}
	
	@Then("customer see ID")
	public void customer_see_ID() {
	  Hook.driver.getCurrentUrl();
	  System.out.println("sucess");
	  	}


	}
