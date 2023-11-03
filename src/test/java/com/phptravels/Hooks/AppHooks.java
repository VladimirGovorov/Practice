package com.phptravels.Hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.phptravels.driverFactory.DriverFactory;
import com.phptravels.utility.ConfigFileReader;
import com.phptravels.utility.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
	
	private DriverFactory driverFactory;
	private WebDriver driver;
	
	private ConfigFileReader configFileReader;
	public Properties properties;
	
	
	@Before(order=0)
	public void getProperty() throws IOException 
	{
		configFileReader = new ConfigFileReader();
		properties = configFileReader.init_prop();
		
	}
	
	@Before(order=1)
	public void launchingBrowser() throws IOException {
		
		String browserName = properties.getProperty("browser");
	
		driverFactory = new DriverFactory();
		driverFactory.init_Driver(browserName);
		
	}
	@After(order=0)
	public void tearDown()
	{
		driver.quit();
	}
	

}
