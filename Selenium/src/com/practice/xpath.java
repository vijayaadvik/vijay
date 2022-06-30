package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	
	static String url = "https://www.facebook.com/";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PBN\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create')][1]")).click();
		
		driver.navigate().to("https://www.facebook.com");
		
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		user.sendKeys("Selenium@gmail.com");
		
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@type,\"password\")]"));
		password.sendKeys("Java@12");
		
              
        driver.findElement(By.xpath("//button[@name='login']")).click();
        
        
		
		
		
		
		
		
		
		
		
		
				
	}
	

}
