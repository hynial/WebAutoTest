package com.hynial.cucumbertest.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class ChromeManager extends DriverManager {

    protected ChromeDriver driver;

    //If Windows gets the .exe chromedriver
    @Override
    protected WebDriver createDriver() {
        String driverPath = "/Users/hynial/CustApps/chromedriver_mac64/chromedriver";
        if (System.getProperty("os.name").contains("Windows")) {
            driverPath += ".exe";
        }

        System.setProperty("webdriver.chrome.driver", driverPath);
        return driver = new ChromeDriver(ChromeDriverService.createDefaultService());
    }

    @Override
    public WebDriver getDriver() {
        if (driver == null) {
            this.createDriver();
        }
        return driver;
    }

}