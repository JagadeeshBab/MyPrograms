package com.automation.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Datatyping_JavaScript_RWD {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe" );
	RemoteWebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("https://www.gmail.com");
	WebElement un=driver.findElement(By.id("identifierId"));
	
	driver.executeScript("arguments[0].value='jbabu294'", un);
	
	//performing clickable actions using javascriptexecutor
	WebElement next=driver.findElement(By.id("identifierNext"));
	driver.executeScript("arguments[0].click();", next);
	
}
}
