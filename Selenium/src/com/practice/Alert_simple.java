package com.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_simple {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "http://demo.automationtesting.in/Alerts.html";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PBN\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	    Alert simple = driver.switchTo().alert();
		simple.accept();	
		
		
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Alert confirm = driver.switchTo().alert();
		confirm.dismiss();	
		
		
		
        driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Alert prompt = driver.switchTo().alert();
		String text = prompt.getText();
		prompt.sendKeys("Heisenberg");
		System.out.println(text);
		prompt.accept();
	
		
	}

}
