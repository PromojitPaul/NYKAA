package com.nykaa.stepdefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.sweetdonut.pages.HomePage;

public class HomePageSteps {
    private WebDriver driver;
    private HomePage homePage;

    @Given("I am on the Nykaa homepage")
    public void iAmOnHomepage() {
        driver.get("https://sweet-donut-1ca8e9.netlify.app/");
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