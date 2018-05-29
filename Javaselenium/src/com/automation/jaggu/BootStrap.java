package com.automation.jaggu;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootStrap {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver webdriver=new FirefoxDriver();
		webdriver.manage().window().maximize();
		webdriver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_1");
		webdriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		webdriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//for none selected button
		webdriver.findElement(By.cssSelector(".multiselect-selected-text")).click();
		//for text of a
		List<WebElement> list =webdriver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li/a/label"));
		System.out.println(list.size());

			//text of the lables
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getText());
				
			}
		
		//clicking all the checkboxes
//		for (int i = 0; i <list.size(); i++) {
//			list.get(i).click();
//			
//		}
		
		for (int i = 0; i < list.size(); i++) {

			if(list.get(i).getText().equalsIgnoreCase("jQuery tutorial")) {
				WebElement ele = list.get(i);
				ele.click();
				Thread.sleep(3000);
		System.out.println(ele.isEnabled());		
}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
