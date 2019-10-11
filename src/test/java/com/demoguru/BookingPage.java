package com.demoguru;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdefinition.Hook;

public class BookingPage {
	public BookingPage()
	{
		PageFactory.initElements(Hook.driver,this);
	}
	
	public WebElement getCheck() {
		return check;
	}
	public void setCheck(WebElement check) {
		this.check = check;
	}
	public WebElement getFname() {
		return fname;
	}
	public void setFname(WebElement fname) {
		this.fname = fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public void setLname(WebElement lname) {
		this.lname = lname;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getAddress() {
		return address;
	}
	public void setAddress(WebElement address) {
		this.address = address;
	}
	public WebElement getMobno() {
		return Mobno;
	}
	public void setMobno(WebElement mobno) {
		Mobno = mobno;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	@FindBy(xpath="//label[@for='done']")
	private WebElement check;
	@FindBy(id="fname")
	private WebElement fname;
	@FindBy(id="lname")
	private WebElement lname;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(xpath="//textarea[@id='message']")
	private WebElement address;
	@FindBy(id="telephoneno")
	private WebElement Mobno;
	@FindBy(name="submit")
	private WebElement submit;
	
	

}
