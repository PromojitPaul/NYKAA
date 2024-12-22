package com.sweetdonut.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class CartPage {
    private WebDriver driver;

    @FindBy(css = ".cart-item")
    private List<WebElement> cartItems;

    @FindBy(css = ".cart-total")
    private WebElement cartTotal;

    @FindBy(css = ".checkout-button")
    private WebElement checkoutButton;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public int getCartItemCount() {
        return cartItems.size();
    }

    public String getCartTotal() {
        return cartTotal.getText();
    }

    public void proceedToCheckout() {
        checkoutButton.click();
    }
}