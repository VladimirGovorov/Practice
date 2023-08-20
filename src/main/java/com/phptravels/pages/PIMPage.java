package com.phptravels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.phptravels.actions.PhpTravelActions;

public class PIMPage extends PhpTravelActions{
	
	public PIMPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public WebDriver driver;
	
	
	By PIMLink = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'] [text()='PIM']");
	By addButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	By firstName = By.xpath("//input[@name='firstName']");
	By middleName = By.xpath("//input[@name='middleName']");
	By lastName = By.xpath("//input[@name='lastName']");
	By saveButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
	By cancelButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']");
	
	
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
	
}

