package com.selemiun.practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicGoogleSearch {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//textarea[@class = 'gLFyf']")).sendKeys("testing");
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@id = 'Alh6id']/descendant::div[@class = 'wM6W7d']/span"));
		System.out.println("The total elements :" + elements.size());
		
		for (WebElement ele : elements) {
			if(ele.getText().contains("interview questions")) {
				ele.click();
			}
		}
		List<String> lst = new ArrayList<String>();
		lst.add("C:\\Users\\Papu\\eclipse-workspace\\Selenium_Practice\\test-output\\RetryFailedTestCases\\testng-failed.xml");
		TestNG runner = new TestNG();
		runner.setTestSuites(lst);
		runner.run();
	}
}
