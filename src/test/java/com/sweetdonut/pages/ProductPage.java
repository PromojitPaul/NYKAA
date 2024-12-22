package com.sweetdonut.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class ProductPage {
    private WebDriver driver;

    @FindBy(css = ".product-card")
    private List<WebElement> productCards;

    @FindBy(css = ".category-filter")
    private WebElement categoryFilter;

    @FindBy(css = ".product-price")
    private List<WebElement> productPrices;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean areProductCardsDisplayed() {
        return !productCards.isEmpty() && productCards.get(0).isDisplayed();
    }

    public void selectCategory(String category) {
        // Implementation for category selection
    }

    public List<String> getProductPrices() {
        return productPrices.stream()
                .map(WebElement::getText)
                .toList();
    }
}