package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice_project {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PBN\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//a[@rel='nofollow'][1]")).click();
		
		driver.findElement(By.id("email")).sendKeys("nadodi.vijay@gmail.com");
		
		driver.findElement(By.id("passwd")).sendKeys("Gamer@7");
		
		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
		
		WebElement Women = driver.findElement(By.xpath("//a[@title='Women']"));
		
		Actions W = new Actions(driver);
		
		W.moveToElement(Women).build().perform();
		
		driver.findElement(By.xpath("//a[@title='T-shirts']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement image = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
	
		Actions I = new Actions(driver);
		I.moveToElement(image).build().perform();
		
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
		
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
		
        
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
		
		driver.findElement(By.id("cgv")).click();
		
        driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
		
		driver.findElement(By.xpath("//a[@class='cheque']")).click();
		
		driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
		
		
	}

}
