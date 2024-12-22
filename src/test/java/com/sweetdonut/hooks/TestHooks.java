package com.sweetdonut.hooks;

import com.sweetdonut.utils.DriverManager;
import com.sweetdonut.utils.ScreenshotHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class TestHooks {
    private WebDriver driver;
    private ScreenshotHelper screenshotHelper;

    @Before
    public void setup() {
        driver = DriverManager.getDriver();
        screenshotHelper = new ScreenshotHelper(driver);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotPath = screenshotHelper.captureScreenshot(scenario.getName());
            scenario.attach(screenshotPath, "image/png", "Screenshot");
        }
        DriverManager.quitDriver();
    }
}