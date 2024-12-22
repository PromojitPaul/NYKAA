package com.sweetdonut.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class AccessibilityUtils {
    public static boolean hasValidAltText(WebElement image) {
        String alt = image.getAttribute("alt");
        return alt != null && !alt.trim().isEmpty();
    }

    public static boolean hasValidAriaLabel(WebElement element) {
        String ariaLabel = element.getAttribute("aria-label");
        return ariaLabel != null && !ariaLabel.trim().isEmpty();
    }

    public static boolean hasValidTabIndex(List<WebElement> interactiveElements) {
        return interactiveElements.stream()
                .map(e -> e.getAttribute("tabindex"))
                .noneMatch(index -> index != null && Integer.parseInt(index) < 0);
    }
}