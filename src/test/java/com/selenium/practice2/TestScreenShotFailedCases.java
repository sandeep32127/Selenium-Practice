package com.selenium.practice2;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class TestScreenShotFailedCases extends Base{
	
	@Test
	public void test() {
		Assert.assertEquals(true, false);
	}

}
