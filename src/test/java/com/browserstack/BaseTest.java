package com.browserstack;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class BaseTest {
	
	WebDriver driver;
	MutableCapabilities capabilities;
	HashMap<String, Object> bstackOptions;
	public static final String USERNAME = "sandeepdalei_WVcRHp";
	public static final String AUTOMATE_KEY = "gx2HwdRTvSu7dKoWewBF";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	@Parameters({"os","osVersion","browserName","browserVersion"})
	@BeforeMethod
	public void setUp(String os, String osVersion, String browserName, String browserVersion, Method name) {
		//DesiredCapabilities dc = new DesiredCapabilities();

		/*dc.setCapability("os", "Windows");
		dc.setCapability("osVersion", "11");
		dc.setCapability("browserName", "Chrome");
		dc.setCapability("browserVersion", "latest");*/
		//dc.setCapability("name", name.getName());
		
		capabilities = new MutableCapabilities();
		bstackOptions = new HashMap<String, Object>();
		
		capabilities.setCapability("browserName", browserName);
		capabilities.setCapability("browserVersion", browserVersion);
		bstackOptions.put("os", os);
		bstackOptions.put("osVersion", osVersion);
		bstackOptions.put("sessionName", name.getName());
		bstackOptions.put("buildName", "Browserstack build");
		bstackOptions.put("local", false);
		
		capabilities.setCapability("bstack:options", bstackOptions);
		
		try {
			driver = new RemoteWebDriver(new URL(URL), capabilities);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}

}
