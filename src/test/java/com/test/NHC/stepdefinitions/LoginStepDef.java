package com.test.NHC.stepdefinitions;

import com.test.NHC.Utils.ConfigReader;
import com.test.NHC.Utils.DriverHelper;
import com.test.NHC.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepDef {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage=new LoginPage(driver);

    @Given("The user navigate to the NHS website")
    public void the_user_navigate_to_the_nhs_website() {
        driver.get(ConfigReader.readProperty("nhcUrl"));

    }
    @Given("User validates the url of the page")
    public void user_validates_the_url_of_the_page() {
        Assert.assertEquals(ConfigReader.readProperty("nhcUrl"),driver.getCurrentUrl());

    }
    @When("The user enter the valid username and valid password")
    public void the_user_enter_the_valid_username_and_valid_password() {
        loginPage.login();

    }
    @When("The user press the SignIn button")
    public void the_user_press_the_sign_in_button() {
        loginPage.singIn();

    }
    @Then("The user validates the title")
    public void the_user_validates_the_title() {
        Assert.assertEquals("NHS patients",driver.getTitle().trim());

    }

}
