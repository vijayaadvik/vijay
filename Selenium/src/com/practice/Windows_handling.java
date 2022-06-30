package com.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_handling {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PBN\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/");
		
		 WebElement Fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
		 Actions F = new Actions(driver);
		 F.contextClick(Fashion).build().perform();
		 Robot Ac = new Robot();
		 Ac.keyPress(KeyEvent.VK_PAGE_DOWN);
		 Ac.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 Ac.keyPress(KeyEvent.VK_ENTER);
		 Ac.keyRelease(KeyEvent.VK_ENTER);
		 
		 WebElement  Mobiles = driver.findElement(By.xpath("//a[text()= 'Mobiles']"));
		 Actions E = new Actions(driver);
		 E.contextClick(Mobiles).build().perform();
		 Ac.keyPress(KeyEvent.VK_PAGE_DOWN);
		 Ac.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 Ac.keyPress(KeyEvent.VK_ENTER);
		 Ac.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 
		 
		 int size = driver.getWindowHandles().size();
		 System.out.println(size);
		 
		 Set<String> tags = driver.getWindowHandles();
		 System.out.println(tags);
		 
		 
	}
	
}
