package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PBN\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
	    act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
	}

}
