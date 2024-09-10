package com.selemiun.practice;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsTest {

	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(html);
		ExtentTest test = reports.createTest("Demo Test Reports", "Checking the html demo report");
		test.assignAuthor("Sandeep");
		test.assignCategory("Smoke check");
		test.pass("The test case validated successfully", 
				MediaEntityBuilder.createScreenCaptureFromPath("./../images/image1.png").build());
		reports.flush();
	}

}
