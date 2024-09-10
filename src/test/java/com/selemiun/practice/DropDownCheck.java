package com.selemiun.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownCheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		
		driver.findElement(By.xpath("(//button[text() = 'Contact Sales'])[2]")).click();
		
		Thread.sleep(6000);
		
		//driver.findElement(By.id("Form_getForm_Country")).click();
		
		Select select = new Select(driver.findElement(By.id("Form_getForm_Country")));
		
		//select.selectByValue("Albania");
		
		//select.selectByVisibleText("Argentina ");
		
		//select.selectByIndex(5);
		
		List<WebElement> options = select.getOptions();
		
		System.out.println("The country size : " +options.size());
		
		select.selectByIndex(options.size() - 1);
	}

}
