package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PBN\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		driver.findElement(By.xpath("//*[@type='checkbox'][3]")).click();
		
		WebElement Sl = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
		
	    System.out.println("Chechbox is selection state is ="+Sl.isSelected());
		
	    driver.findElements(By.xpath("//*[@class='example'][2]"));
	   
		
	}

}
