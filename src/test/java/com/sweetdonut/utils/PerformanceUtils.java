package com.sweetdonut.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import java.util.HashMap;
import java.util.Map;

public class PerformanceUtils {
    public static Map<String, Long> getPageLoadMetrics(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Long> metrics = new HashMap<>();
        
        Long navigationStart = (Long) js.executeScript("return window.performance.timing.navigationStart");
        Long loadEventEnd = (Long) js.executeScript("return window.performance.timing.loadEventEnd");
        
        metrics.put("pageLoadTime", loadEventEnd - navigationStart);
        return metrics;
    }

    public static boolean isPageLoadedWithinThreshold(long loadTime, long threshold) {
        return loadTime <= threshold;
    }
}