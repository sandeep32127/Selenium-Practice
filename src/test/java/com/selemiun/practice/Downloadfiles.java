package com.selemiun.practice;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Downloadfiles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		
		HashMap<String, Object> setPath = new HashMap<String, Object> ();
		
		String downloadPath = "C:\\Users\\Papu\\eclipse-workspace\\Selenium_Practice\\Downloaded";
		setPath.put("download.default_directory", downloadPath);
		setPath.put("safebrowsing.enabled", "false");
		
		options.setExperimentalOption("prefs", setPath);
		options.addArguments("--disable-extensions");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		/*
		 * cap.setBrowserName("chrome"); cap.setPlatform(Platform.WINDOWS);
		 */
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		
		driver = new ChromeDriver(options);
		driver.get("https://www.win-rar.com/download.html?&L=05");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text() = 'WinRAR 7.01 Arabic 64 bit']")).click();
		
		/*driver = new ChromeDriver(cap);
		driver.get("https://www.win-rar.com/download.html?&L=05");
		driver.manage().window().maximize();*/
	}

}
