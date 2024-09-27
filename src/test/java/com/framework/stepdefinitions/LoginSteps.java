package com.framework.stepdefinitions;

import com.framework.pages.LoginPage;
import com.framework.utilities.DriverHelpers;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private static final String Check = null;
	private static final String CheckAll = null;
	WebDriver driver;
    LoginPage loginPage;

    @Given("I open the browser and navigate to Saucelabs login page")
    public void iOpenTheBrowserAndNavigateToSaucelabsLoginPage() {
        driver = DriverHelpers.startDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        loginPage = new LoginPage(driver);
    }

    @When("I enter valid username {string} and password {string}")
    public void iEnterValidUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        loginPage.clickLogin();
    }
    

 }
