package com.tyss.RetryDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer{

	int retryCount = 0;
	final int maxRetryCount =3;

	public boolean retry(ITestResult result) {
		
		if(retryCount<maxRetryCount) {
			retryCount++;
			return true;
		}
		
		return false;
	}

	
}
