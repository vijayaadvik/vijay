package com.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_prac {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PBN\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.google.com");
		 
		 WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		 Actions a = new Actions(driver);
		 a.contextClick(gmail).build().perform();
		 
		 Robot K = new Robot();
		 K.keyPress(KeyEvent.VK_PAGE_DOWN);
		 K.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 
		 K.keyPress(KeyEvent.VK_PAGE_DOWN);
		 K.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 
		 K.keyPress(KeyEvent.VK_PAGE_DOWN);
		 K.keyRelease(KeyEvent.VK_PAGE_DOWN);

		 K.keyPress(KeyEvent.VK_ENTER);
		 K.keyRelease(KeyEvent.VK_ENTER);
		 
	}

}
