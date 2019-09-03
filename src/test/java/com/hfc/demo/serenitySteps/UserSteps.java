package com.hfc.demo.serenitySteps;

import com.hfc.demo.pageObjects.AmazonHome;
import com.hfc.demo.support.Configuration;
import com.hfc.demo.support.RequestHelper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class UserSteps {
    private AmazonHome amazonHome;

    @Step
    public void getInformationFromApi() {
        Response response = RequestHelper.getInformationFromAPI();
        JsonPath jsonPathEvaluator = response.jsonPath();
        String userAgent = jsonPathEvaluator.getString("headers.user-agent");
        Serenity.setSessionVariable(Configuration.FUTURE_DATA).to(userAgent);
        Assert.assertTrue(userAgent.length() > 0);
    }

    @Step
    public void lookForTermsInAmazonWebPage() {
        amazonHome.open();
        amazonHome.waitLoad();
        amazonHome.lookForPreviousTerms();
    }
}
