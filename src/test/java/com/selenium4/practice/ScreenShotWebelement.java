package com.selenium4.practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotWebelement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://app.hubspot.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
		WebElement userName = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement btnLogin = driver.findElement(By.id("loginBtn"));
		
		userName.sendKeys("send@gmail.com");
		password.sendKeys("Sandeep");
		
		takeScreenshot(userName, "emailInput");
		takeScreenshot(password, "passwordIput");
		takeScreenshot(btnLogin, "buttonLogin");
		
		takeScreenshotUsingTakesScreenShotTypeCast(userName, "emailInput");
		takeScreenshotUsingTakesScreenShotTypeCast(password, "passwordIput");
		takeScreenshotUsingTakesScreenShotTypeCast(btnLogin, "buttonLogin");
		
		driver.quit();
	}
	
	/** to take screenshots of webelements  
	 * @param ele
	 * @param fileName
	 */
	public static void takeScreenshot(WebElement ele , String fileName) {
		File srcFile = ele.getScreenshotAs(OutputType.FILE);
		//byte[] screenshotAs = ele.getScreenshotAs(OutputType.BYTES);
		File destFile = new File("./screenshots/"+fileName+System.currentTimeMillis()+".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/** take screenshots of webelements using TakesScreenshot typecast
	 * 
	 * @param ele
	 * @param fileName
	 * @throws IOException
	 */
	public static void takeScreenshotUsingTakesScreenShotTypeCast(WebElement ele , String fileName) {
		File srcFile = ((TakesScreenshot)ele).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./screenshots/new/"+Calendar.getInstance().getTimeInMillis()+fileName+".png");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
