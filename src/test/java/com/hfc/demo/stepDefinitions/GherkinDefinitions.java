package com.hfc.demo.stepDefinitions;

import com.hfc.demo.serenitySteps.UserSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GherkinDefinitions {
    @Steps
    private UserSteps userSteps;

    @Given("^I retrieve information from the API$")
    public void iRetrieveInformationFromTheAPI() {
        userSteps.getInformationFromApi();
    }

    @When("^I lookfor these terms in amazon$")
    public void iLookforTheseTermsInAmazon() {
        userSteps.lookForTermsInAmazonWebPage();
    }
}
