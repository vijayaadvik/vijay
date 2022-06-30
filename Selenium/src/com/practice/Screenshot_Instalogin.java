package com.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Instalogin {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PBN\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/?hl=en");
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("+919380861989");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("YoYoBiatch@138");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		 
		 File source = ts.getScreenshotAs(OutputType.FILE);
		
		 File destination = new File("C:\\Users\\PBN\\eclipse-workspace\\Selenium\\Screenshots\\Sugy.png");
		 
		 FileUtils.copyFileToDirectory(source, destination);
	}

}
