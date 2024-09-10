package com.testng.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListner.class)
public class TestClass extends Base {

	@BeforeMethod
	public void launchBrowser() {
		initDriver();
	}


	@Test
	public void testFailedcaseScreenshot() {
		Assert.assertEquals(false, true);
	}

	@AfterMethod
	public void endTest() {
		driver.quit();
	}

}
