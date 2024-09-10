package com.selemiun.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragNDropTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebElement iFrame = driver.findElement(By.xpath("//iframe[starts-with(@class,'demo-frame')]"));
		
		//driver.switchTo().frame(iFrame);
		
		WebElement drag = driver.findElement(By.id("angular"));
		
		WebElement drop = driver.findElement(By.id("droparea"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(drag, drop).build().perform();
	}

}
