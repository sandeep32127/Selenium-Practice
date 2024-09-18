package com.selenium4.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDOM {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*
		 * SearchContext shadowRoot =
		 * driver.findElement(By.cssSelector("#userName")).getShadowRoot(); String text
		 * = shadowRoot.findElement(By.cssSelector(".learningHub")).getText();
		 * System.out.println(text);
		 */
		WebElement shadowHost = driver.findElement(By.cssSelector("#userName"));
		SearchContext shadowRoot = (SearchContext) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot", shadowHost);
		String text = shadowRoot.findElement(By.cssSelector(".learningHub")).getText();
		System.out.println(text);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
