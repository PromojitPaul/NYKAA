package com.sweetdonut.pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class NavigationMenu {
    @FindBy(css = "nav a")
    private List<WebElement> menuItems;

    public NavigationMenu(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickMenuItem(String menuText) {
        menuItems.stream()
                .filter(item -> item.getText().equalsIgnoreCase(menuText))
                .findFirst()
                .ifPresent(WebElement::click);
    }

    public boolean isMenuItemPresent(String menuText) {
        return menuItems.stream()
                .anyMatch(item -> item.getText().equalsIgnoreCase(menuText));
    }

	public boolean isDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
}