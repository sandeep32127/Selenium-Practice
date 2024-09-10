package com.selemiun.practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksImages {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("commonModal__close")));
		
		driver.findElement(By.className("commonModal__close")).click();
		
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		List<WebElement> imgElements = driver.findElements(By.tagName("img"));
		
		System.out.println("The size of the links : "+ linkElements.size()+imgElements.size());
		
		List<String> activeLinks = new ArrayList<String> ();
		
		for (WebElement lnkEle : linkElements) {
			if(lnkEle.getAttribute("href") != null) {
				activeLinks.add(lnkEle.getAttribute("href"));
			}
		}
		
		for (WebElement imgEle : imgElements) {
			if(imgEle.getAttribute("src") != null) {
				activeLinks.add(imgEle.getAttribute("src"));
			}
		}
		
		System.out.println("The size of the active links : "+ activeLinks.size());
		
		for (String links : activeLinks) {
			HttpURLConnection con = (HttpURLConnection)new URL(links).openConnection();
			con.connect();
			String responseMessage = con.getResponseMessage();
			int responseCode = con.getResponseCode();
			con.disconnect();
			System.out.println("The links : " + links + " The message : "+ responseMessage+ " The responsecode : " + responseCode);
		}
		
	}

}
