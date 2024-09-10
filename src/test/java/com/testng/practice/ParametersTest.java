package com.testng.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersTest {
	
	public static WebDriver driver;
	
	@Parameters({"browser", "url"})
	@Test(priority = 0,groups = "smoke")
	public void launchURL(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Parameters({"username","password"})
	@Test(priority = 1,groups = "check")
	public void login(String userName, String password) {
		
		driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
	}

}
