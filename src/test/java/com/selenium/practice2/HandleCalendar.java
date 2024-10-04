package com.selenium.practice2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCalendar {

	public static void main(String[] args) throws ParseException {
		
		String targetDate = "02-05-2018";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date date = sdf.parse(targetDate);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int targetDay = calendar.get(Calendar.DAY_OF_MONTH);
		int targetMonth = calendar.get(Calendar.MONTH);
		int targetYear = calendar.get(Calendar.YEAR);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("second_date_picker")).click();
		
		String actualMonthYear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		System.out.println("The actual Month Year : "+actualMonthYear);
		calendar.setTime(new SimpleDateFormat("MMMM yyyy").parse(actualMonthYear));
		
		int actualMonth = calendar.get(Calendar.MONTH);
		int actualYear = calendar.get(Calendar.YEAR);
		
		while(targetMonth < actualMonth || targetYear < actualYear) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".ui-datepicker-prev span")));
			WebElement btnPrev = driver.findElement(By.cssSelector(".ui-datepicker-prev span"));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", btnPrev);
			
			actualMonthYear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
			System.out.println("The actual Month Year : "+actualMonthYear);
			calendar.setTime(new SimpleDateFormat("MMMM yyyy").parse(actualMonthYear));
			
			actualMonth = calendar.get(Calendar.MONTH);
			actualYear = calendar.get(Calendar.YEAR);
		}
		
		driver.findElement(By.xpath("//table[@class = 'ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+targetDay+"]")).click();
		
		driver.quit();
	}

}
