package com.browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBrowserStack extends BaseTest {
	
	@Test(priority = 0)
	public void loginTest() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.cssSelector("#input-email")).sendKeys("sandep@gmail.com");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("sandeep100");
		driver.findElement(By.xpath("//input[@value= 'Login']")).click();		
		Assert.assertEquals(driver.getTitle(), "My Account");
		//Object executeScript = ((JavascriptExecutor)driver).executeScript("", "");
		//ChromeDriver driver1 = new ChromeDriver();
		//SearchContext v1 = (SearchContext) driver1.executeScript("", "");
	}
	
	@Test(priority = 1)
	public void loginTest2() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.cssSelector("#input-email")).sendKeys("sandep@gmail.com");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("sandeep100");
		driver.findElement(By.xpath("//input[@value= 'Login']")).click();
		Assert.assertEquals(driver.getTitle(), "My Account");
	}
	
	@Test(priority = 2)
	public void loginTest3() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.cssSelector("#input-email")).sendKeys("sandep@gmail.com");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("sandeep100");
		driver.findElement(By.xpath("//input[@value= 'Login']")).click();
		Assert.assertEquals(driver.getTitle(), "My Account");
	}

}
