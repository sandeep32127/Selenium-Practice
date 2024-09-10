package com.selemiun.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Highlight {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("(//input[@type = 'submit'])[3]"));
		
		for (int i = 0; i < 5; i++) {
			driver.executeScript("arguments[0].setAttribute('style',arguments[1]);", ele,"color: red");
			Thread.sleep(2000);
			driver.executeScript("arguments[0].setAttribute('style',arguments[1]);", ele,"color: yellow");
			Thread.sleep(2000);
		}
		
		driver.quit();
	}

}
