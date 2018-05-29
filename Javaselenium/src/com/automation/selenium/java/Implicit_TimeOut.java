package com.automation.selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Implicit_TimeOut {

	public static void main(String[] args) {
		
		WebDriver webdriver=new FirefoxDriver();
		webdriver.manage().window().maximize();
		webdriver.get("https://www.gmail.com");
		
		//1st approach to write implicitlywait
		//Options options= webdriver.manage();
		//Timeouts timeouts=options.timeouts();
		//timeouts.implicitlyWait(100, TimeUnit.MILLISECONDS);
		
		//2nd approach to write implicitly		for implicitwait every webelement wait for 130 seconds 
		webdriver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
		webdriver.findElement(By.id("identifierId")).sendKeys("jbabu294@gmail.com");
		webdriver.findElement(By.id("identifierNext")).click();
		webdriver.findElement(By.name("password")).sendKeys("babu4569");
		webdriver.findElement(By.id("passwordNext")).click();
	
	
	}

}
