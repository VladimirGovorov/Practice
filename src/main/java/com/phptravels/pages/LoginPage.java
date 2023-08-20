package com.phptravels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.phptravels.actions.PhpTravelActions;

public class LoginPage extends PhpTravelActions{
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	By Username = By.xpath("//input[@name='username']");
	By Password = By.xpath("//input[@name='password']");
	
	By loginButton = By.xpath("//button[@type='submit']");
	
	
	public void userLogin(String name, String passwd)
	{
		//click(Username, "Username");
		writeText(Username, name, "Username");
		writeText(Password, passwd,"Password");
		//waitForElementToClickable(loginButton);
	    click(loginButton, "LoginButton");
	}

}
