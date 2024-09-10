package com.selemiun.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClicknHold {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement element1 = driver.findElement(By.xpath("//ul[@id = 'sortable']/li[1]"));
		WebElement element2 = driver.findElement(By.xpath("//ul[@id = 'sortable']/li[4]"));
		
		Actions action = new Actions(driver);
		//action.clickAndHold(element1).release(element2).build().perform();
		action.dragAndDropBy(element1, element2.getLocation().getX(), element2.getLocation().getY()).perform();
	}

}
