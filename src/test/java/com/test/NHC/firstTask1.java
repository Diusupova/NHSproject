package com.test.NHC;

import com.test.NHC.Utils.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTask1 {
    @Test
    public void nhcTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(ConfigReader.readProperty("nhcUrl"));
        WebElement login = driver.findElement(By.id("inputEmail"));
        login.sendKeys(ConfigReader.readProperty("nhcLogin"));
        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys(ConfigReader.readProperty("nhcPassword"));
        Thread.sleep(3000);
        WebElement singInButton = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
        singInButton.click();
        Assert.assertEquals("NHS patients", driver.getTitle());







    }
}

