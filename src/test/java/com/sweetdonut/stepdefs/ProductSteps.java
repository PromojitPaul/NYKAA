package com.sweetdonut.stepdefs;

import com.sweetdonut.pages.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductSteps {
    private WebDriver driver;
    private ProductPage productPage;

    @Given("I am on the products page")
    public void iAmOnProductsPage() {
        driver.get("https://sweet-donut-1ca8e9.netlify.app/products");
        productPage = new ProductPage(driver);
    }

    @When("I select the {string} category")
    public void iSelectCategory(String category) {
        productPage.selectCategory(category);
    }

    @Then("I should see product cards displayed")
    public void iShouldSeeProductCards() {
        Assert.assertTrue(productPage.areProductCardsDisplayed(), 
            "Product cards are not displayed");
    }
}