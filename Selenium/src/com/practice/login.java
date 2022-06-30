package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PBN\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.facebook.com");
		  
		  WebElement name = driver.findElement(By.name("email"));
		  name.sendKeys("whynot@123");
		  
		  WebElement password = driver.findElement(By.id("pass"));
		  password.sendKeys("ofcourse");
		  
		  WebElement login = driver.findElement(By.name("login"));		  
		  login.click();
		  
		  
	}
	
}
