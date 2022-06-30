package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_scroll {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PBN\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);

		JavascriptExecutor sc = (JavascriptExecutor) driver;

		sc.executeScript("window.scroll(0,3000)", "");
		Thread.sleep(2000);

		sc.executeScript("window.scroll(0,-3000)", "");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);

		WebElement Grocery = driver.findElement(By.xpath("//img[@alt='Grocery']"));
		Thread.sleep(2000);
		JavascriptExecutor Flipkart = (JavascriptExecutor) driver;
		Flipkart.executeScript("arguments[0].click()", Grocery);

	}

}
