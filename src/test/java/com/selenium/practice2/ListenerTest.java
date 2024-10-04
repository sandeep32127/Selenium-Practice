package com.selenium.practice2;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest extends Base implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		takeSnap();
	}

}
