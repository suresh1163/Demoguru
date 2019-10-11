package com.stepdefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	public static WebDriver driver;
	@Before
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Java\\workspace\\Cucumber\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	@After
	public void close()
	{
		driver.quit();
	}
}
