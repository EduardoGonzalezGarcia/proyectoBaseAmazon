package com.hfc.demo.pageObjects;

import com.hfc.demo.support.Configuration;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

@DefaultUrl(Configuration.FRONT_URL)
public class AmazonHome extends PageObject {

    @FindBy(id = "twotabsearchtextbox")
    private WebElementFacade searchBox;

    public AmazonHome(WebDriver driver) {
        super(driver);
        maximize(driver);
    }

    private void maximize(WebDriver driver) {
        driver.manage().window().maximize();
    }

    public void waitLoad() {
        this.getDriver().manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    }

    public void lookForPreviousTerms() {
        searchBox.waitUntilVisible();
        searchBox.waitUntilClickable();
        searchBox.typeAndEnter(Serenity.sessionVariableCalled(Configuration.FUTURE_DATA));
    }
}
