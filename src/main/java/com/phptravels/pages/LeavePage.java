package com.phptravels.pages;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.phptravels.actions.PhpTravelActions;
import com.phptravels.utility.ConfigFileReader;

public class LeavePage  extends PhpTravelActions{
	
	
	
	public WebDriver driver;
	ConfigFileReader configFileReader;
	SoftAssert softassert;
	
	
	public LeavePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		configFileReader = new ConfigFileReader();
	}
	
	By DashBoard = By.xpath("//div[@class='oxd-topbar-header-title']");
	By leaveButton =By.xpath("//a[@class='oxd-main-menu-item']//span[text()='Leave']");
	By calendarButton = By.xpath("(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]");
	By calendarHeader = By.xpath("//ul[@class='oxd-calendar-selector']");
	By nextButton = By.xpath("//i[@class='oxd-icon bi-chevron-right']");
	By dateButton = By.xpath("//div[@class='oxd-calendar-date-wrapper']");
	By calendarHeader2 = By.xpath("//div[@class='oxd-calendar-header']");
	By nextButton2 = By.xpath("//i[@class='oxd-icon bi-chevron-right']");
	By calendarButton2 = By.xpath("(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[2]");
	By popUp = By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']");
	public By searchButton = By.xpath("//button[@type='submit']");
	//public String expected = "No Records Found";
	
	public void clickOnLeavebutton()
	{
		click(leaveButton, "Click on leave button");
	}
	
    public void verifyDashBoardTitle(String expected)
    {
    	String title = readText(DashBoard, "Dashboard Page Title");
    	softassert = new SoftAssert();
    	softassert.assertEquals(title, expected);
    }
    
   public void clickOnCalendar()
   {
	   
	   click(calendarButton, "click on calendar");
	   
   }
   
   public void clickOnDate()
   {
	   
	   while(!driver.findElement(By.xpath("//div[@class='oxd-calendar-header']"))
			   .getText().contains("March"))
	   {
		   
		 click(nextButton, "click on the next button");
		 
		   
			   }
	   
   }
   
   
   public void selectDate(String desiredDate) {
	    getElements(dateButton);

	    for (WebElement dateElement : driver.findElements(dateButton)) {
	        if (dateElement.getText().equals(desiredDate)) {
	            dateElement.click();
	            break;
	        }
	    }
	}

	
	
	
	public void clickSecondCalendarButton()
	{
		click(calendarButton2, "click on the second calendar");
	}
	
	public void monthSelection()
	{
		
		  
		   while(!driver.findElement(By.xpath("//ul[@class='oxd-calendar-selector']"))
				   .getText().contains("September"))
		   {
			   
			 click(nextButton2, "click on the next button");
			 
			   
				   }
		
	}
	
	
	public void selectDay(String selectedDate)
	{
		getElements(dateButton);
		
		for(WebElement dayButton: driver.findElements(dateButton))
		{
			
			if(dayButton.getText().equals(selectedDate))
			{
				dayButton.click();
				break;
			}
			
		}
		
			}
				public void clickSearchButton()
				{
						
					click(searchButton, "click on the search button");
				}

				
				public String getRecordMessage(String expected)
				{
					
					String recordMessage = readText(popUp, "shows record of leave request");
					System.out.println(recordMessage);
					Assert.assertEquals(recordMessage, expected);
					return recordMessage;
					
				}
   
	
  
	    
	}
	

	// 
	

	        

	        
	    
	
	
	



	  
   
   
	

