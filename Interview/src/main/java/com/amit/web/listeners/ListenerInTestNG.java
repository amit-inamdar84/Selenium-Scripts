package com.amit.web.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerInTestNG implements ITestListener{
//This listener class will listen to the test methods running in the test class ListenerTest.java.
//The same is done by implementing ITestListener interface.
	
	@Override
	public void onTestStart(ITestResult result) {//This is invoked before the start of each @Test method
		System.out.println("Now running this test: " +getMethodName(result));
		Reporter.log("Now running this test: " +getMethodName(result));
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed: " +getMethodName(result));
		Reporter.log("Test passed: " +getMethodName(result));
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed: " +getMethodName(result));
		Reporter.log("Test failed: " +getMethodName(result));
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped: " +getMethodName(result));
		Reporter.log("Test skipped: " +getMethodName(result));
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test is passed based on percentage: " +getMethodName(result));
		Reporter.log("Test is passed based on percentage: " +getMethodName(result));
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("All tests started");
		Reporter.log("All tests started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("All tests finished");
		Reporter.log("All tests finished");
	}
	
	private static String getMethodName(ITestResult result){
		return result.getMethod().getConstructorOrMethod().getName();
	}

}
