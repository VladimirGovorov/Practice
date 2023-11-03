package com.phptravels;

//package com.phptravels;

import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.phptravels.actions.PhpTravelActions;
import com.phptravels.driverFactory.DriverFactory;
import com.phptravels.pages.LoginPage;
import com.phptravels.pages.PIMPage;
import com.phptravels.utility.Screenshot;

@Listeners(com.phptravels.customListeners.Log.class)
public class chatgptEdit extends DriverFactory {
    String expectedMessage = "Successfully Updated";

    LoginPage loginPage;
    PIMPage pimPage;
    PhpTravelActions actions;

    @BeforeTest
    public void startPhpTravelsApp() throws IOException, InterruptedException {
        init_Driver();
        getDriver().get(prop.getProperty("AppHRM"));
        Thread.sleep(5000);
    }

    @Test
    public void editEmployeeTest() throws InterruptedException, IOException {
        loginPage = new LoginPage(getDriver());
        loginPage.userLogin("Admin", "admin123");
        pimPage = new PIMPage(getDriver());
        Thread.sleep(5000);
        pimPage.PIMLink();
        Thread.sleep(5000);
        // Edit employee details and wait for success message
        pimPage.editEmployee("Tony", "Romero");
        actions = new PhpTravelActions(getDriver());
        actions.waitForElementToAppear(pimPage.alertSuccessMessage);

        // Locate and interact with the success message
        WebElement popUp = getDriver().findElement(By.xpath("//div[@class='oxd-toast-content oxd-toast-content--success']//p[2]"));
        Actions a = new Actions(getDriver());
        Thread.sleep(3000);
        a.moveToElement(popUp).perform();
        

        // Verify the success message
        String actualMessage = actions.readText(pimPage.alertSuccessMessage, "Success Message");
        Assert.assertEquals(actualMessage, expectedMessage, "Success message does not match");
    }
}
