package com.sweetdonut.pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
    @FindBy(css = ".logo")
    private WebElement logo;

    @FindBy(css = ".cart-icon")
    private WebElement cartIcon;

    @FindBy(css = ".cart-count")
    private WebElement cartCount;

    @FindBy(css = ".mobile-menu-button")
    private WebElement mobileMenuButton;

    public Header(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

    public void clickCartIcon() {
        cartIcon.click();
    }

    public String getCartCount() {
        return cartCount.getText();
    }

    public void toggleMobileMenu() {
        if (mobileMenuButton.isDisplayed()) {
            mobileMenuButton.click();
        }
    }
}