package com.automation.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WDTestDemo
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe");
		//WebDriver webdriver=new FirefoxDriver();
		WebDriver webdriver=new ChromeDriver();
		webdriver.get("https://gmail.com");
		WebElement username = webdriver.findElement(By.id("identifierId"));
		username.clear();
		username.sendKeys("jbabu294@gmail.com");
	}
}
