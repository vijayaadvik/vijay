package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_select {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PBN\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://letcode.in/dropdowns");
		 
		 driver.manage().window().maximize();
		 
		 WebElement drop = driver.findElement(By.id("superheros"));
		  
		
		 Select s = new Select((WebElement) drop);
		 
		 boolean multiple = s.isMultiple();
		 
		 System.out.println(multiple);
		 
		 List<WebElement> Multi = s.getOptions(); 
		 
		 for(WebElement print:Multi) {
			 
			 System.out.println(print.getText());
		 }
		 
		 int size = Multi.size();
		 
		 System.out.println(size);
		 
		 WebElement India = driver.findElement(By.id("country"));
		 
		 Select C = new Select(India);
		 C.selectByValue("India");
		 
		 
		 System.out.println("....Select....");
		 for (int i = 0; i <= size;i++) {
		 if (i==18||i==26) {
		 s.selectByIndex(i);
		 }
		 
		 
		 }
		 System.out.println("....Allselected....");
		 List<WebElement> allselect = s.getAllSelectedOptions();
		 for (WebElement All : allselect) {
			 System.out.println(All.getText());
		}
		 
			
		WebElement first = s.getFirstSelectedOption();
		String F = first.getText();
		System.out.println(F);	 
		
		
	}

}
