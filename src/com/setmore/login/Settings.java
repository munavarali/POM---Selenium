package com.setmore.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings {
		
	WebDriver driver;
		
	public Settings(WebDriver driver){
		this.driver = driver;
	}
		
	@FindBy(xpath="//li[@id='settings_new']")
	public WebElement settings;
		
	public customers doSettings()
	{
		settings.click();
		
		return PageFactory.initElements(driver, customers.class);
	}
}


