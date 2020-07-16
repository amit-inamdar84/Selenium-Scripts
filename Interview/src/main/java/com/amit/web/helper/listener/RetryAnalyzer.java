package com.amit.web.helper.listener;

import org.testng.IRetryAnalyzer;

//IRetryAnalyzer is an interface to implement to be able to have a chance to retry a failed test.

import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	int counter = 0;
	int retryLimit = 3;

	@Override//Returns true if the test method has to be retried, false otherwise.
	public boolean retry(ITestResult result) {
		if (counter < retryLimit) {
			counter++;
			return true;
		}
		return false;
	}

}
