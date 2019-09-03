package com.hfc.demo.testRunner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/example.feature",
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber-report.json"},
        glue = "com.hfc.demo.stepDefinitions",
        tags = {"@test"}
)
public class TestRunner {

}
