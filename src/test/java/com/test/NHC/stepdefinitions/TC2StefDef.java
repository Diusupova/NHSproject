package com.test.NHC.stepdefinitions;

import com.test.NHC.Utils.ConfigReader;
import com.test.NHC.Utils.DriverHelper;
import com.test.NHC.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class TC2StefDef {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage=new LoginPage(driver);
    @Given("The user navigate to the NHS website and try to login")
    public void the_user_navigate_to_the_nhs_website_and_try_to_login() {
        driver.get(ConfigReader.readProperty("nhcUrl"));

    }
    @Given("User validates the url of the page of the main page")
    public void user_validates_the_url_of_the_page_of_the_main_page() {
        Assert.assertEquals(ConfigReader.readProperty("nhcUrl"),driver.getCurrentUrl());

    }
    @When("The user enters the invalid username and valid password")
    public void the_user_enters_the_invalid_username_and_valid_password() {
        loginPage.TC2();

    }
    @When("The user click the SignIn button")
    public void the_user_click_the_sign_in_button() {
        loginPage.singIn();


    }

}
