package com.setmore.login;

import java.awt.Toolkit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("disable-infobars");
		System.setProperty("webdriver.chrome.driver", "/Users/munavar/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(op);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height =  toolkit.getScreenSize().height;
		int width =  toolkit.getScreenSize().width;
		driver.manage().window().setPosition(new Point(0,0));
		driver.manage().window().setSize(new Dimension(width,height));
		driver.get("https://www.setmore.com");
		
		Simplelogin sl = PageFactory.initElements(driver, Simplelogin.class);
		Settings st=sl.doLogin("munna2594@gmail.com", "setmore");
		customers c=st.doSettings();
		
		if(driver.getCurrentUrl().equals("https://my.setmore.com/customers/#customers/new")){
			
			c.docustomers();	
		}
		else{
			Thread.sleep(3000);
			c.addcustomers();
		}
	}

}
