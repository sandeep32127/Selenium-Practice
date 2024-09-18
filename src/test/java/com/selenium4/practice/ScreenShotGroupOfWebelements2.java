package com.selenium4.practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotGroupOfWebelements2 {

	public static void main(String[] args) throws WebDriverException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromiumDriver driver= new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement signInSection = driver.findElement(By.cssSelector("#hs-login"));
		FileUtils.copyFile(signInSection.getScreenshotAs(OutputType.FILE), new File("./screenshots/login.png"));
		driver.quit();
	}

}
