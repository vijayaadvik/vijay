package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PBN\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.flipkart.com");
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
        String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);
		
		
		
		driver.quit();
		
		
		
		
		
	}

}
