package com.phptravels;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import com.phptravels.actions.PhpTravelActions;
import com.phptravels.driverFactory.DriverFactory;

import com.phptravels.pages.LoginPage;
import com.phptravels.pages.PIMPage;

public class ReportsTest extends DriverFactory {
	PhpTravelActions aqctions;
	PIMPage pimPage;
	LoginPage loginPage;
	Actions a;
	@BeforeTest
	public void startPhpTravelsApp() throws IOException, InterruptedException
	{
		init_Driver();
		getDriver().get(prop.getProperty("AppHRM"));
		Thread.sleep(5000);
	}
	
	@Test
	public void deleteEmployee() throws InterruptedException
	{
	     loginPage = new LoginPage(getDriver());
		 loginPage.userLogin("Admin", "admin123");
		 Thread.sleep(4000);
		 
		 pimPage = new 	PIMPage(getDriver());
		 pimPage.PIMLink();
		 
		 Thread.sleep(4000);
		 pimPage.clickOnReports();
		 
		 Thread.sleep(4000);
		 pimPage.editReportsPage();
		 
	}
}
	
	
	