package com.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.xpath("//*[@id='ctl00_MainContent_username']");
    By password = By.xpath("//input[@name='ctl00$MainContent$password']");
    By loginButton = By.xpath("//input[@name='ctl00$MainContent$login_button']");
   

    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
   
}
