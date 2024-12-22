package com.sweetdonut.pages;

import com.sweetdonut.pages.base.BasePage;
import com.sweetdonut.pages.components.Header;
import com.sweetdonut.pages.components.NavigationMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    private Header header;
    private NavigationMenu navigationMenu;

    @FindBy(css = ".featured-products")
    private WebElement featuredProductsSection;

    public HomePage(WebDriver driver) {
        super(driver);
        this.header = new Header(driver);
        this.navigationMenu = new NavigationMenu(driver);
    }

    public boolean isNavigationMenuDisplayed() {
        return navigationMenu.isDisplayed();
    }

    public boolean isFeaturedProductsSectionDisplayed() {
        return waitHelper.isElementVisible(featuredProductsSection);
    }

    public Header getHeader() {
        return header;
    }

    public NavigationMenu getNavigationMenu() {
        return navigationMenu;
    }
}