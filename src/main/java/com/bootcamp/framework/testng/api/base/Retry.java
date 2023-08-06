package com.bootcamp.framework.testng.api.base;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	private int count = 0;
	private int maxRetry = 2;

	public boolean retry(ITestResult result) {
		if (count < maxRetry) {
			count++;
			return true;
		}
		return false;
	}

}