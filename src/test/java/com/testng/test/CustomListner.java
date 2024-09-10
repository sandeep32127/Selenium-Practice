package com.testng.test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListner extends Base implements ITestListener {

	public void onTestFailure(ITestResult result) {
		System.out.println("takisng screenshot of failed cases");
		screenshotFailedCase();
	}
}
