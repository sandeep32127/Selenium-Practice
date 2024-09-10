package com.browserstack;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBrowserStack extends BaseTest {
	
	@Test(priority = 0)
	public void loginTest() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.cssSelector("#input-email")).sendKeys("sandep@gmail.com");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("sandeep100");
		driver.findElement(By.xpath("//input[@value= 'Login']")).click();
		
		//System.out.println("URL is : " + driver.getCurrentUrl());
		Assert.assertEquals(driver.getTitle(), "My Account");
	}
	
	@Test(priority = 1)
	public void loginTest2() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.cssSelector("#input-email")).sendKeys("sandep@gmail.com");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("sandeep100");
		driver.findElement(By.xpath("//input[@value= 'Login']")).click();
		
		//System.out.println("URL is : " + driver.getCurrentUrl());
		Assert.assertEquals(driver.getTitle(), "My Account");
	}
	
	@Test(priority = 2)
	public void loginTest3() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.cssSelector("#input-email")).sendKeys("sandep@gmail.com");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("sandeep100");
		driver.findElement(By.xpath("//input[@value= 'Login']")).click();
		
		//System.out.println("URL is : " + driver.getCurrentUrl());
		Assert.assertEquals(driver.getTitle(), "My Account");
	}

}
