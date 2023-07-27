package taskTwo.implementation;

import org.testng.*;

public class TestMethodListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.printf("The test %s has been started...\n", result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.printf("The test %s has been successfully finished...\n", result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.printf("The test %s has been failed...\n", result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.printf("The test %s has been skipped...\n", result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.printf("The test %s has been failed but success within percentage...\n", result.getName());
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.printf("The test %s has been failed with timeout...\n", result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("The test run has been started...");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("The test run has been finished...");
    }
}
