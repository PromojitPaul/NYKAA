package com.sweetdonut.stepdefs.base;

import com.sweetdonut.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BaseSteps {
    protected WebDriver driver;

    @Before
    public void setup() {
        driver = DriverManager.getDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Handle screenshot capture
        }
        DriverManager.quitDriver();
    }
}