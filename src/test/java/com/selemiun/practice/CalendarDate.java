package com.selemiun.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarDate {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.id("second_date_picker")).click();
		
		Calendar calendar = Calendar.getInstance();
		String targetDate = "28-June-2021";
		SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MMM-yyyy");
		Date formattedTargetDate;
		try {
			sdfDate.setLenient(false);
			formattedTargetDate = sdfDate.parse(targetDate);
			System.out.println(formattedTargetDate);
			
			calendar.setTime(formattedTargetDate);
			int targetDay = calendar.get(Calendar.DAY_OF_MONTH);
			int targetMonth = calendar.get(Calendar.MONTH);
			int targetYear = calendar.get(Calendar.YEAR);
			Thread.sleep(3000);
			
			String actualDate = driver.findElement(By.className("ui-datepicker-title")).getText();
			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));
			
			int actualMonth = calendar.get(Calendar.MONTH);
			int actualYear = calendar.get(Calendar.YEAR);
			
			while(targetMonth < actualMonth || targetYear < actualYear) {
				WebElement element = driver.findElement(By.xpath("//a[contains(@class,'ui-datepicker-prev')]/span"));
				((JavascriptExecutor)driver).executeScript("return arguments[0].click();", element);
				
				actualDate = driver.findElement(By.className("ui-datepicker-title")).getText();
				calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));
				
				actualMonth = calendar.get(Calendar.MONTH);
				actualYear = calendar.get(Calendar.YEAR);
			}
	
			driver.findElement(By.xpath("//table[@class = 'ui-datepicker-calendar']/descendant::td[not(contains(@class,' ui-datepicker-other-month '))]/child::a[text() = "+targetDay+"]")).click();
		
		} catch (ParseException e) {
			System.out.println("please enter the correct formatted date : " + e.getMessage());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
