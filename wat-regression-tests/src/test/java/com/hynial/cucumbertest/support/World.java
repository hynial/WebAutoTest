package com.hynial.cucumbertest.support;

import io.cucumber.guice.ScenarioScoped;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

// Scenario scoped it is used to show Guice
// what will be the shared classes/variables and instantiate them only in here
@ScenarioScoped
public class World {
    public WebDriver driver = new DriverFactory().getManager();
    public Support support = new Support().load();
    public WebDriverWait wait = new WebDriverWait(driver, 5, 100);
}
