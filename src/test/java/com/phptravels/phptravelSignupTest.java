package com.phptravels;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.phptravels.driverFactory.DriverFactory;

import com.phptravels.pages.LoginPage;

public class phptravelSignupTest extends DriverFactory {
	//Webdriver driver;
	LoginPage loginPage;
	@BeforeTest
	public void startPhpTravelsApp() throws IOException, InterruptedException
	{
		init_Driver();
		getDriver().get(prop.getProperty("AppHRM"));
		Thread.sleep(5000);
	}
	
	@Test
	public void signup()
	{
	     loginPage = new LoginPage(getDriver());
		 loginPage.userLogin("Admin", "admin123");
	}

}
