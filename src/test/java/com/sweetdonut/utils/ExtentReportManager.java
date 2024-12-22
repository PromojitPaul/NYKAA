package com.sweetdonut.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            extent = createInstance();
        }
        return extent;
    }

    private static ExtentReports createInstance() {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("test-output/ExtentReport.html");
        htmlReporter.config().setDocumentTitle("Sweet Donut Test Report");
        htmlReporter.config().setReportName("Automation Test Results");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Browser", "Chrome");

        return extent;
    }
}