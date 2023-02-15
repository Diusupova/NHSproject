package com.test.NHC.stepdefinitions;

import com.test.NHC.Utils.ConfigReader;
import com.test.NHC.Utils.DriverHelper;
import com.test.NHC.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class TC3StepDef {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage=new LoginPage(driver);

    @Given("the user navigated to the NHS website")
    public void the_user_navigated_to_the_nhs_website() {
        driver.get(ConfigReader.readProperty("nhcUrl"));

    }
    @Given("User validated the url of the page of the main page")
    public void user_validated_the_url_of_the_page_of_the_main_page() {
        Assert.assertEquals(ConfigReader.readProperty("nhcUrl"),driver.getCurrentUrl());

    }
    @When("the user enter the username and blank password")
    public void the_user_enter_the_username_and_blank_password() {
        loginPage.TC3();

    }
    @When("the user press the SingIn button")
    public void the_user_press_the_sing_in_button() {
        loginPage.singIn();

//    }
//    @Then("the user validates error message.")
//    public void the_user_validates_error_message() {
//
    }


}
