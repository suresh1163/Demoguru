package com.repository;

import org.openqa.selenium.WebElement;

import com.stepdefinition.Hook;



public class Base {
		
	public static void launch(String url)
	{
		Hook.driver.get(url);
	}
	public static void type(WebElement e,String value)
		{
		e.sendKeys(value);
	}
	public static void click(WebElement e1)
	{
		e1.click();
	}

}
