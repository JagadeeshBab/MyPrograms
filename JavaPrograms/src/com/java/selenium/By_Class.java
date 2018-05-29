package com.java.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.FindsById;
import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import bsh.Capabilities;

public class By_Class {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\JavaPrograms\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id(""));
		driver.findElement(By.ById.id(""));
		
		
		RemoteWebDriver driver1 = new ChromeDriver();
		driver1.findElement(By.id(""));
		driver1.findElement(By.ById.id(""));
		
		driver1.findElementById("");
		
		FindsById id = new FirefoxDriver();
		id.findElementById("");
	
			FindsByXPath xpath = new RemoteWebElement();
			WebElement element = new RemoteWebElement();
			//abstract By class and inner classes 
			By.ById by = new By.ById(null);
				String str = by.toString();
				WebElement by12 = by.findElement(element);
				List<WebElement > list = by.findElements(driver1);
				}
}
