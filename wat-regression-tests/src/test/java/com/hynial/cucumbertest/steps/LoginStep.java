package com.hynial.cucumbertest.steps;

import com.google.inject.Inject;
import com.hynial.cucumbertest.pages.LoginPage;
import com.hynial.cucumbertest.support.World;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
    @Inject
    private World world;

    @Inject
    private LoginPage loginPage;

    @Given("^I have opened the browser$")
    public void iHaveOpenedTheBrowser() {
        loginPage.navigate();
    }

    @When("^I send my credentials$")
    public void iSendMyCredentials() {
        loginPage.login(world.support.user, world.support.pass);
    }

    @Then("^I should see the \"([^\"]*)\" title of the page$")
    public void iShouldSeeTheTitleOfThePage(String title) {
        loginPage.assertTitle(title);
    }
}
