package com.sweetdonut.utils;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;

public class AssertionUtils {
    public static void assertElementsVisible(List<WebElement> elements, String message) {
        Assert.assertTrue(
            elements.stream().allMatch(WebElement::isDisplayed),
            message
        );
    }

    public static void assertTextPresent(WebElement element, String expectedText) {
        Assert.assertTrue(
            element.getText().contains(expectedText),
            String.format("Expected text '%s' not found", expectedText)
        );
    }
}