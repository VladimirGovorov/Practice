package com.phptravels;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.phptravels.driverFactory.DriverFactory;
import com.phptravels.pages.LoginPage;
import com.phptravels.pages.PIMPage;
import com.phptravels.utility.Screenshot;

@Listeners(com.phptravels.customListeners.Log.class)
public class AddEmployeeTest extends DriverFactory {
	
	LoginPage loginPage;
	PIMPage pimPage;
	@BeforeTest
	public void startPhpTravelsApp() throws IOException, InterruptedException
	{
		init_Driver();
		getDriver().get(prop.getProperty("AppHRM"));
		Thread.sleep(5000);
		
	}
	
	@Test
	public void addEmployeeVerification() throws InterruptedException
	{
		Screenshot.testName="AddEmployee";
	     loginPage = new LoginPage(getDriver());
		 loginPage.userLogin("Admin", "admin123");
		 Thread.sleep(5000);
		 pimPage = new PIMPage(getDriver());
		 pimPage.PIMLink();
		 Thread.sleep(5000);
		 pimPage.ClickOnAddButton();
		 pimPage.addEmployee("Vladimir ", "Govorov");
	}


}
