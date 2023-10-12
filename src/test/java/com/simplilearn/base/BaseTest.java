package com.simplilearn.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	public static WebDriver driver;
		
	@BeforeSuite
	public static void openBrowser() throws InterruptedException {
		driver =new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

	}
	@AfterSuite
	public static void closeBrowser() {
		System.out.println("Browser closed");
		driver.quit();
	}

	
}
