package com.sweetdonut.stepdefs;

import com.sweetdonut.config.BrowserConfig;
import com.sweetdonut.pages.HomePage;
import com.sweetdonut.stepdefs.base.BaseSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class HomePageSteps extends BaseSteps {
    private HomePage homePage;

    @Given("I am on the Sweet Donut homepage")
    public void iAmOnHomepage() {
        driver.get(BrowserConfig.BASE_URL);
        homePage = new HomePage(driver);
    }

    @Then("I should see the main navigation menu")
    public void iShouldSeeNavigationMenu() {
        Assert.assertTrue(homePage.isNavigationMenuDisplayed(), 
            "Navigation menu is not displayed");
    }

    @Then("I should see the featured products section")
    public void iShouldSeeFeaturedProducts() {
        Assert.assertTrue(homePage.isFeaturedProductsSectionDisplayed(), 
            "Featured products section is not displayed");
    }
}