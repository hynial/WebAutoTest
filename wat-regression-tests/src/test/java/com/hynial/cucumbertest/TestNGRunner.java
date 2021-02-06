package com.hynial.cucumbertest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        dryRun = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features"},
        glue = {"com.hynial.cucumbertest.steps"},
        tags = "",
        publish = false
)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
