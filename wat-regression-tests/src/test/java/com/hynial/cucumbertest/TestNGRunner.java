package com.hynial.cucumbertest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@CucumberOptions(
        dryRun = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features"},
        glue = {"com.hynial.cucumbertest.steps"},
        tags = "",
        publish = false
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
    private static final Logger logger = LoggerFactory.getLogger(TestNGRunner.class);
    public TestNGRunner(){
        logger.info("new a testng runner");
    }
}
