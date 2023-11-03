package com.phptravels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.phptravels.actions.PhpTravelActions;
import com.phptravels.utility.ConfigFileReader;

public class LoginPage extends PhpTravelActions{
	
	public WebDriver driver;
	ConfigFileReader configFileReader;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		configFileReader = new ConfigFileReader();
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
	public void launchApplication()
	{
		driver.get(configFileReader.getApplicationUrl());
	}

}
