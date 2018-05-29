package com.automation.selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_isDisabled_isEnabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://rameshselenium.blogspot.in/");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		int count=0;
		for(WebElement ele:list)
		{
			//System.out.println(ele.getText());
			//System.out.println(ele.getSize());
			boolean b=ele.isDisplayed()&&ele.isEnabled();
			if(b)
			{
				//System.out.println("element is dispalyed and enabled:"+ b);

					count++;
					
			}
			else {
				//System.out.println("element is not enabled and disabled:" +b);
				
				System.out.println("num of not enabled and  not displayed elements ");
			}
			
		}
	
		System.out.println("num of enabled and display elements :" +count);
		System.out.println("num of not enabled and  not displayed elements :"+(list.size()-count));
	
	
	}

}
