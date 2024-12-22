package com.sweetdonut.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenshotHelper {
    private WebDriver driver;
    private static final String SCREENSHOT_DIR = "test-output/screenshots/";

    public ScreenshotHelper(WebDriver driver) {
        this.driver = driver;
        createScreenshotDirectory();
    }

    public String captureScreenshot(String testName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
            String fileName = SCREENSHOT_DIR + testName + "_" + timestamp + ".png";
            Files.copy(source.toPath(), Paths.get(fileName));
            return fileName;
        } catch (Exception e) {
            return null;
        }
    }

    private void createScreenshotDirectory() {
        try {
            Files.createDirectories(Paths.get(SCREENSHOT_DIR));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}