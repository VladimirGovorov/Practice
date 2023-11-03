package com.phptravels;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.phptravels.actions.PhpTravelActions;
import com.phptravels.driverFactory.DriverFactory;
import com.phptravels.pages.LoginPage;
import com.phptravels.pages.PIMPage;
import com.phptravels.utility.Screenshot;

@Listeners(com.phptravels.customListeners.Log.class)


public class EditEmployeeTest extends DriverFactory {
	 String expectedMessage = "Successfully Updated";
	 
 // WebElement popUp = driver.findElement(By.xpath("//div[@class='oxd-toast-content oxd-toast-content--success']//p[2]"));
    Actions a;
	LoginPage loginPage;
	PIMPage pimPage;
	
	WebDriverWait w;
	@BeforeTest
	public void startPhpTravelsApp() throws IOException, InterruptedException
	{
		init_Driver();
		getDriver().get(prop.getProperty("AppHRM"));
		Thread.sleep(5000);
		
	}
		
		@Test
		public void editEmployeeTest() throws InterruptedException, IOException
		{
			//Screenshot.testName="AddEmployee";
		     loginPage = new LoginPage(getDriver());
		     Thread.sleep(5000);
			 loginPage.userLogin("Admin", "admin123");
			 Thread.sleep(5000);
			 pimPage = new PIMPage(getDriver());
			 pimPage.PIMLink();
			 Thread.sleep(5000);
		
			
			 pimPage.editEmployee("Tony", "Romero");
			 //pimPage.getAlertMessage("Successfully Updated");
			// expectedMessage = "Successfully Updated";			 
		    Assert.assertEquals(pimPage.alertSuccessMessage, expectedMessage);
			
			
			
			 
			
// w.until(ExpectedConditions.visibilityOfElement("//div[@class='oxd-toast-content oxd-toast-content--success']//p[2]"));
		
		// pimPage.getAlertMessage("Successfully Updated");
		
	}
	

		
	
	
	
	

}
