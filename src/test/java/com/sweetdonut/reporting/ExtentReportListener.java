package com.sweetdonut.reporting;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.sweetdonut.utils.ExtentReportManager;
import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.*;

public class ExtentReportListener implements ConcurrentEventListener {
    private ExtentTest currentScenario;

    @Override
    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(TestCaseStarted.class, this::scenarioStarted);
        publisher.registerHandlerFor(TestStepFinished.class, this::stepFinished);
        publisher.registerHandlerFor(TestCaseFinished.class, this::scenarioFinished);
    }

    private void scenarioStarted(TestCaseStarted event) {
        String scenarioName = event.getTestCase().getName();
        currentScenario = ExtentReportManager.getInstance().createTest(scenarioName);
    }

    private void stepFinished(TestStepFinished event) {
        if (event.getResult().getStatus().isOk(true)) {
            currentScenario.log(Status.PASS, event.getTestStep().getCodeLocation());
        } else if (event.getResult().getStatus().isOk(false)) {
            currentScenario.log(Status.FAIL, event.getResult().getError());
        }
    }

    private void scenarioFinished(TestCaseFinished event) {
        ExtentReportManager.getInstance().flush();
    }
}