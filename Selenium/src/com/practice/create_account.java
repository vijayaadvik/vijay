package com.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class create_account {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PBN\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.instagram.com/?hl=en");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.name("emailOrPhone")).sendKeys("+919380861989");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.name("fullName")).sendKeys("Jessie Pinkman");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@maxlength='30']")).sendKeys("JessiePink758");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("YoYoBiatch@138");

		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 Thread.sleep(2000);
		 
		 WebElement month = driver.findElement(By.xpath("//select[@title='Month:']"));
		
		 Select S = new Select(month);
		 S.selectByValue("4");
		 
		 Thread.sleep(2000);
		 
		 WebElement date = driver.findElement(By.xpath("//select[@title='Day:']"));
			
		 Select S1 = new Select(date);
		 S1.selectByValue("7");
		 
		 Thread.sleep(2000);
		 
		 WebElement year = driver.findElement(By.xpath("//select[@title='Year:']"));
			
		 Select S2 = new Select(year);
		 S2.selectByValue("1992");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[text()='Next']")).click();
		 
		 driver.manage().window().maximize();
		 
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 
		 File source = ts.getScreenshotAs(OutputType.FILE);
		
		 File destination = new File("C:\\Users\\PBN\\eclipse-workspace\\Selenium\\Screenshots\\insta.jpg");
		 
		
		 FileUtils.copyFileToDirectory(source, destination);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
