package com.setmore.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class customers {
	
	WebDriver driver;
	
	public customers(WebDriver driver){
			this.driver = driver;
			}

	@FindBy(xpath="//*[@id='side-customers']")
	public WebElement customer;
	@FindBy(xpath="//*[@id='newCustomer']")
	public WebElement newCustomer;
	@FindBy(xpath="//input[@id='customerNewName']")
	public WebElement customerName;
	@FindBy(xpath="//input[@id='customerNewEmail']")
	public WebElement customerEmail;
	@FindBy(xpath="//input[@id='customerNewMobile']")
	public WebElement customerMobile;
	@FindBy(xpath="//button[@id='addnewCustomer']")
	public WebElement addcustomer;
	
	public void docustomers(){
	customer.click();
	customerName.sendKeys("Munavar1");
	customerEmail.sendKeys("12345@gmail.com");
	customerMobile.sendKeys("9840000000");
	addcustomer.click();
	}
	
	public void addcustomers(){
		customer.click();
		newCustomer.click();
		customerName.sendKeys("Munavar1");
		customerEmail.sendKeys("12345@gmail1.com");
		customerMobile.sendKeys("9840000000");
		addcustomer.click();
	}

}
