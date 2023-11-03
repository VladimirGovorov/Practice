package com.phptravels.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import com.phptravels.actions.PhpTravelActions;
import com.phptravels.driverFactory.DriverFactory;
import com.phptravels.pages.LoginPage;
import com.phptravels.pages.PIMPage;

import io.cucumber.java.en.Given;

public class UserListSteps extends DriverFactory {

	LoginPage loginPage ;
	PIMPage pimPage ;
	//PhpTravelActions actions;
	
	
	@Given("The user is logged in to the OrangeHRM demo application")
	public void the_user_is_logged_in_to_the_orange_hrm_demo_application() throws IOException {
	  // init_Driver();
	    //getDriver().get(prop.getProperty("AppHRM"));
	    loginPage = new LoginPage(getDriver());
	    loginPage.launchApplication();
	   loginPage.userLogin("Admin","admin123");
	}

	@Given("The user is on the Dashboard page")
	public void the_user_is_on_the_dashboard_page() throws InterruptedException {
		
		
	}
		

	@When("The user clicks on the {string} tab in the main navigation menu")
	public void the_user_clicks_on_the_tab_in_the_main_navigation_menu(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		 pimPage = new PIMPage(getDriver());
		 Thread.sleep(3000);
		 pimPage.PIMLink();
	

	}

	@When("Selects the {string} option from the dropdown menu")
	public void selects_the_option_from_the_dropdown_menu(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		pimPage.scroll();
	}

	@When("Waits for the Employee List page to load")
	public void waits_for_the_employee_list_page_to_load() {
	    // Write code here that turns the phrase above throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be able to view the list of employees")
	public void the_user_should_be_able_to_view_the_list_of_employees() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
}
