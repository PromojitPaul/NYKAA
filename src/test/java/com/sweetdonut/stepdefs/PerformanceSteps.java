package com.sweetdonut.stepdefs;

import com.sweetdonut.utils.PerformanceUtils;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.util.Map;

public class PerformanceSteps {
    private WebDriver driver;
    private static final long PAGE_LOAD_THRESHOLD = 3000; // 3 seconds

    @Then("the page should load within {int} seconds")
    public void pageLoadsShouldBeWithinThreshold(int seconds) {
        Map<String, Long> metrics = PerformanceUtils.getPageLoadMetrics(driver);
        long loadTime = metrics.get("pageLoadTime");
        Assert.assertTrue(
            PerformanceUtils.isPageLoadedWithinThreshold(loadTime, seconds * 1000),
            String.format("Page load time of %dms exceeded threshold of %dms", loadTime, seconds * 1000)
        );
    }
}