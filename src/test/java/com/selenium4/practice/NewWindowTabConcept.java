package com.selenium4.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowTabConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://app.hubspot.com/login");
		driver.manage().window().maximize();
		
		System.out.println("the title of the parent window : "+driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allWinList = new ArrayList<String>(windowHandles);
		
		String parentWindowID = allWinList.get(0);
		String childWindowID = allWinList.get(1);
		
		System.out.println("the parent window ID : "+parentWindowID);
		System.out.println("the child window ID : "+childWindowID);
		
		System.out.println("The title after switching new window : "+ driver.getTitle());
		driver.get("https://google.com");
		
		System.out.println("The title after switching new window : "+ driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		
		System.out.println("the title of the parent window : "+driver.getTitle());
		
		driver.quit();
	}

}
