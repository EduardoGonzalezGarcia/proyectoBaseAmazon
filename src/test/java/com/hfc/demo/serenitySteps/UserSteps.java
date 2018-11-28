package com.hfc.demo.serenitySteps;

import com.hfc.demo.pageObjects.AmazonHome;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import java.util.concurrent.TimeUnit;

public class UserSteps {
    private AmazonHome amazonHome;

    @Step
    public void iAmInAmazonWebPage() {
        amazonHome.open();
        amazonHome.waitLoad();
    }
}
