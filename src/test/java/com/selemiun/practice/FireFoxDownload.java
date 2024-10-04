package com.selemiun.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxDownload {

	public static void main(String[] args) throws InterruptedException {
		String fileType = "XLS, XLSX";
		WebDriverManager.firefoxdriver().setup();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("pdfjs.disabled", true);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf,application/doc,application/ms-doc,application/msword,application/vnd.openxmlformats-officedocument.wordprocessingml.document");
		profile.setPreference("browser.download.dir", "C:\\Users\\Papu\\Music\\testrDownload");
		profile.setPreference("browser.download.folderList", 2);
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		WebDriver driver = new FirefoxDriver(options);
		
		driver.get("https://file-examples.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text() = 'Sample documents']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[text()='"+fileType+"']/following-sibling::td[2]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[starts-with(text() ,'Download sample')]")).click();
		Thread.sleep(5000);
		
		driver.quit();
	}

}
