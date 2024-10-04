package com.selenium.practice2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	public void takeSnap() {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./images/image"+System.currentTimeMillis()+".png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
