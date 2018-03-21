package com.setmore.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Simplelogin {
	
	WebDriver driver;
	
	public Simplelogin(WebDriver driver){
			this.driver = driver;
			}

	@FindBy(xpath="//a[@id='button-login']")
	public WebElement login;
	
	@FindBy(xpath="//input[@id='username']")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@value='Sign In']")
	public WebElement signin;
	
	public Settings doLogin(String myusername, String mypassword){
		
		login.click();
		username.sendKeys(myusername);
		password.sendKeys(mypassword);
		signin.click();
		
		return PageFactory.initElements(driver, Settings.class);
	}
}
