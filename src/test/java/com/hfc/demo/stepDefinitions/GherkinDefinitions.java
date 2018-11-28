package com.hfc.demo.stepDefinitions;

import com.hfc.demo.serenitySteps.UserSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GherkinDefinitions {
    @Steps
    private UserSteps user;

    @Given("^I am in amazon webpage$")
    public void iAmInAmazonWebPage() {
        user.iAmInAmazonWebPage();
    }

}
