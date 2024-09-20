package com.selenium4.practice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GeoLocation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		Map<String, Object> locationParams = new HashMap<String, Object>();
		
		locationParams.put("latitude", 31.106);
		locationParams.put("longitude", -97.6475);
		locationParams.put("accuracy", 100);
		
		driver.executeCdpCommand("Emulation.setGeolocationOverride", locationParams);
		
		driver.get("https://oldnavy.gap.com/stores");
	}

}
