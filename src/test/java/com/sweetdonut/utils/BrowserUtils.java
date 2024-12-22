package com.sweetdonut.utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class BrowserUtils {
    public static void setViewportSize(WebDriver driver, String size) {
        switch (size.toLowerCase()) {
            case "desktop":
                driver.manage().window().setSize(new Dimension(1920, 1080));
                break;
            case "tablet":
                driver.manage().window().setSize(new Dimension(768, 1024));
                break;
            case "mobile":
                driver.manage().window().setSize(new Dimension(375, 812));
                break;
        }
    }

    public static void refreshPage(WebDriver driver) {
        driver.navigate().refresh();
    }
}