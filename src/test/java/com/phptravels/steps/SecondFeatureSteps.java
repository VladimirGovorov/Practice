package com.phptravels.steps;

import org.testng.Assert;

import com.phptravels.driverFactory.DriverFactory;
import com.phptravels.pages.LeavePage;
import com.phptravels.pages.LoginPage;
import com.phptravels.pages.PIMPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecondFeatureSteps extends DriverFactory {
	

	LoginPage loginPage ;
	PIMPage pimPage ;
	LeavePage leavePage;
	
	@Given("The user is logged into Orange HRM Demo application")
	public void userIsLoggedIntoOrangeHRMApplication() {
		  loginPage = new LoginPage(getDriver());
		    loginPage.launchApplication();
		   loginPage.userLogin("Admin","admin123");
	}
	
	@When("User has navigated to the {string} Page")
	public void userHasNavigatedToPage(String pageName) throws InterruptedException {
		
		leavePage = new LeavePage(getDriver());
        Thread.sleep(4000);
		leavePage.verifyDashBoardTitle(pageName);
	}
	
	@When("User clicks on the Leave tab")
	public void user_clicks_on_the_leave_tab() {
		leavePage = new LeavePage(getDriver());
		leavePage.clickOnLeavebutton();
	}
	
	@And("User makes the necessary changes")
	public void userMakesNecessaryChanges() throws InterruptedException {
		Thread.sleep(4000);
		leavePage = new LeavePage(getDriver());
		leavePage.clickOnCalendar();
		Thread.sleep(4000);
		leavePage.clickOnDate();
		Thread.sleep(4000);
		leavePage.selectDate("23");
		Thread.sleep(4000);
		leavePage.clickSecondCalendarButton();
		Thread.sleep(3000);
		leavePage.monthSelection();
		Thread.sleep(3000);
		leavePage.selectDay("25");
		Thread.sleep(3000);
		leavePage.clickSearchButton();
		Thread.sleep(2000);
		
	
	}
	
	@Then("Successfully updated Pop Up should appear")
	public void successfullyUpdatedPopUpShouldAppear() throws InterruptedException {
		leavePage = new LeavePage(getDriver());
		leavePage.getRecordMessage("Record");
	

	}
}
