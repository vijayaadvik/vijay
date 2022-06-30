package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_s {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PBN\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
	
	 WebDriver driver = new ChromeDriver();
	
	 driver.get("http://demo.automationtesting.in/Frames.html");
	 List<WebElement> frames = driver.findElements(By.className("analystic"));
	 int size = frames.size();
	 System.out.println(size);
	 
	 driver.switchTo().frame("singleframe");
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("single");
	 
	 driver.switchTo().defaultContent();
	 driver.findElement(By.xpath("//*[text()='Iframe with in an Iframe']")).click();
	 
	 WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	 driver.switchTo().frame(outerframe);
	 
	 WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	 driver.switchTo().frame(innerframe);
	 
	 WebElement multi = driver.findElement(By.xpath("//input[@type='text']"));
	 multi.sendKeys("multiframe");
	 
}

}
