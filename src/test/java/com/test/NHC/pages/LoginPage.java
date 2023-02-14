package com.test.NHC.pages;

import com.test.NHC.Utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="inputEmail")
    WebElement userName;

    @FindBy(id="inputPassword")
    WebElement password;

    @FindBy(xpath="//button[contains(text(),'Sign in')]")
    WebElement singInButton;

    public void login(){
        userName.sendKeys(ConfigReader.readProperty("nhcLogin"));
        password.sendKeys(ConfigReader.readProperty("nhcPassword"));

    }
    public void singIn(){
        singInButton.click();
    }


    }



