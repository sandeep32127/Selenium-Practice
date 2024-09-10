package com.testng.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRetry {


	/*
	 * @Test(retryAnalyzer = com.testng.RetryAnalyzer.class) public void test1() {
	 * Assert.assertEquals(false, true); }
	 * 
	 * @Test(retryAnalyzer = com.testng.RetryAnalyzer.class) public void test2() {
	 * Assert.assertEquals(false, true); }
	 */


	@Test
	public void test3() {
		Assert.assertEquals(false, true);
	}

	@Test
	public void test4() {
		Assert.assertEquals(false, true);
	}

}
