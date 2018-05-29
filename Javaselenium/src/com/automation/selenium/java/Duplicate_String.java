package com.automation.selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Duplicate_String {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.adp.com");
	List<WebElement> list=driver.findElements(By.xpath("//*[contains(text(),'ADP')]"));
System.out.println(list.size());
int count=0;
		for(WebElement element:list) {
			//System.out.println(element.getText());
			
			if(element.getTagName().equalsIgnoreCase("a")) {
				//System.out.println("Anchor tags are :" + element);
				count++;
				
			}
		}

		System.out.println("anchor tags are :"+count);


	}

}
