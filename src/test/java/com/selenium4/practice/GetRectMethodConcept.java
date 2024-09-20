package com.selenium4.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetRectMethodConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://app.hubspot.com/login");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement btnLogin = driver.findElement(By.id("loginBtn"));
		
		//selenium 3 :
		Dimension dimBtnLogin = btnLogin.getSize();
		System.out.println(dimBtnLogin.getHeight());
		System.out.println(dimBtnLogin.getWidth());
		
		Point point = btnLogin.getLocation();
		System.out.println(point.getX());
		System.out.println(point.getY());
		
		//selenium 4 : 		
		Rectangle rect = btnLogin.getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		
		driver.quit();
	}

}
