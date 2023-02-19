package com.test.NHC.pages;

import com.test.NHC.Utils.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public DashboardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "patientsInRooms")
    WebElement patientsWithRoomsBox;
    @FindBy(xpath = "//div/div[contains(text(),'Patients with rooms')]")
    WebElement headerOfBlueBox;
    @FindBy(id="patients-waiting-live")
    WebElement patientsWaitingBox;
    @FindBy(xpath = "//div/div[contains(text(),'Patients waiting')]")
    WebElement headerOfRedBox;
    @FindBy(id = "free-rooms-live")
    WebElement freeRoomsBox;
    @FindBy(xpath = "//div/div[contains(text(),'Free rooms')]")
    WebElement headerOfOrangeBox;

    public void validationOfBlueBox() {
        Assert.assertTrue(patientsWithRoomsBox.isDisplayed());

    }

    public String validateHeaderOfBlueBox() throws InterruptedException {
        Thread.sleep(2000);
        return BrowserUtils.getText(headerOfBlueBox);
    }

    public void validationOfRedBox() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(patientsWaitingBox.isDisplayed());


    }

    public String validateHeaderOfRedBox() throws InterruptedException {
        Thread.sleep(2000);
        return BrowserUtils.getText(headerOfRedBox);
    }

    public void validationOfOrangeBox() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(freeRoomsBox.isDisplayed());

    }

    public String validateHeaderOfOrangeBox() throws InterruptedException {
        Thread.sleep(3000);
        return BrowserUtils.getText(headerOfOrangeBox);

    }
}