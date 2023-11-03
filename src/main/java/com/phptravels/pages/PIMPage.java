package com.phptravels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.phptravels.actions.PhpTravelActions;

public class PIMPage extends PhpTravelActions{
	
	
	
	//WebDriverWait w;
	
	public PIMPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	WebElement dropdownButton;
	Select dropdown;
	public WebDriver driver;
	Actions a;
	
	
	
	By PIMLink = By.xpath("//a[@class='oxd-main-menu-item']//*[text()='PIM']");
	By addButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	By firstName = By.xpath("//input[@name='firstName']");
	By middleName = By.xpath("//input[@name='middleName']");
	By lastName = By.xpath("//input[@name='lastName']");
	By saveButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
	By cancelButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']");
	By editButton = By.xpath("//button[@class='oxd-icon-button oxd-table-cell-action-space'][2]");
	By firstName1 = By.name("firstName");
	By lastName1 = By.name("lastName");
	By saveEditButton = By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[1]");
	public By alertSuccessMessage = By.xpath("//div[@class='oxd-toast-content oxd-toast-content--success']//p[2]");
	public By checkBox = By.xpath("(//input[@type='checkbox'])[2]");
	By deleteButton = By.xpath("//i[@class='oxd-icon bi-trash-fill oxd-button-icon']");
	By reportButton =By.linkText("Reports");
	By editButton2 = By.xpath("(//i[@class='oxd-icon bi-pencil-fill'])[2]");
	By arrowButton = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
	By selectBox = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");
	By deleteRecordButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");
	By dropdownOption = By.xpath("(//div[@role='option'])[4]");
	
	
	public void PIMLink()
	{
		click(PIMLink, "Click on PIM Link");
	}
	
	public void ClickOnAddButton()
	{
		click(addButton, "Click on Add Button");
	}
	
	public void addEmployee(String fname, String lname)
	{
		writeText(firstName, fname, "Enter the first Name");
		writeText(lastName, lname, "Enter the last name");
		click(saveButton, "Click on the Save");
	}
	
	public String  getAlertMessage(String expected)
	{
		String alertMessage = readText(alertSuccessMessage, "Success");
		System.out.println(alertMessage);
		Assert.assertEquals(alertMessage, expected);
		return alertMessage;
	}
	
	public void editEmployee(String firName, String lasName) throws InterruptedException
	{
		
		//click(PIMLink, "Click on PIM Link");
		click(editButton, "Click on Edit Button");
		Thread.sleep(5000);

		
		
		
		clear(firstName1);
		writeText(firstName1, firName, "Enter first name");
		clear(lastName1);
		Thread.sleep(2000);
		writeText(lastName1, lasName, "Enter last name");
		scroll();
		//scrollIntoView(saveEditButton);
		click(saveEditButton, "Click on the Save button");
		
		}	
	
	
	public void clickCheckbox() throws InterruptedException
	{
		scroll();
	    javaScriptClick(checkBox, "Click on the Checkbox of selected Record ", "CheckBox");
		//Thread.sleep(5000);
	   //JavascriptExecutor executor = (JavascriptExecutor) driver;
		///executor.executeScript("arguments[0].click();", checkBox);
		//Thread.sleep(5000);
	   //click(checkBox, "click on checkbox");
		}
	
	
	public void clickOnDelete()
	{
		
		click(deleteButton, "click on delete button");
		
	}
	
	public void clickOnReports() throws InterruptedException
	{
		click(reportButton, "click on reports");
		Thread.sleep(4000);
		click(editButton2, "Click edit button");
	}
	
	public void editReportsPage() throws InterruptedException
	{
		scroll();
		Thread.sleep(3000);
		click(arrowButton, "click arrow button for dropdown");
		Thread.sleep(3000);
		//click(dropdownOption, "click on dropdown option");
		click(dropdownOption, "Cliiick on dropdown option");
		 
		 
		/* dropdownButton = driver.findElement(selectBox);
		
		 click(arrowButton, "click arrow button for dropdown");
		
		 dropdown = new Select(dropdownButton);
		 dropdown.selectByVisibleText("Education");
		 dropdown.getFirstSelectedOption().click();*/
		
		
		
		
	}
	
	

	public void deleteRecord()
	{
		
		click(deleteRecordButton, "Delete record");
	}
	

	public void scrolling()
	{
		scroll();
	}
	
}
	
	/*public void clearNames()
	{
		clear(firstName1);
		clear(lastName1);
		
	}
	
	
}*/

