package com.test.NHC.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverHelper {
    private static WebDriver driver;
    private DriverHelper(){}//I do not want anyone create an object from this class
    public static WebDriver getDriver(){
        if (driver==null|| ((RemoteWebDriver)driver).getSessionId()==null){
            switch (ConfigReader.readProperty("browser")){
                case"chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
            }
        }
        return driver;
    }

}
