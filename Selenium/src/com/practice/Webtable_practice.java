package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_practice {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PBN\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		System.out.println("....Print all data.....");
		
//		List<WebElement> rd = driver.findElements(By.xpath("//table/tbody/tr/td"));
//		
//		for (WebElement data:rd) {
//			String all = data.getText();
//			System.out.println(all);
//			}
//		
//		System.out.println("print tow data");
//		
//		List<WebElement> rdata = driver.findElements(By.xpath("//table/tbody/tr"));
//		for (WebElement rowdata : rdata) {
//			String row = rowdata.getText();
//			System.out.println(row);			
//		}
//		
		
		
		
		
		
	}

}
