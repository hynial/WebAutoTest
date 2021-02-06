package com.hynial.cucumbertest.pages;

import com.google.inject.Inject;
import com.hynial.cucumbertest.pages.base.BasePage;
import com.hynial.cucumbertest.support.World;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {
    public String URL = "log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F";

    // Extend the BasePage, inject and pass the world to the constructor
    @Inject
    public LoginPage(World world) {
        super(world);
    }

    @FindBy(id = "usernameOrEmail")
    WebElement username;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(css = "button[type='submit']")
    WebElement submit;

    public void login(String user, String pass) {
        username.clear();
        username.sendKeys(user);
        submit.click();
        world.wait.until(webDriver -> password != null && password.isEnabled() && password.isDisplayed());
        password.clear();
        password.sendKeys(pass);
        submit.click();
    }

    // It is possible to use the driver already instantiate in the World.class
    public void navigate() {
        System.out.print(world.support.baseUrl + URL);
        world.driver.get(world.support.baseUrl + URL);
    }

    public void assertTitle(String expectedTitle) {
        Assert.assertEquals(world.driver.getTitle(), expectedTitle);
    }
}
