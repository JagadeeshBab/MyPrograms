package com.automation.selenium.java;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datatyping_JavaScript_WD {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.gmail.com");
		WebElement un=driver.findElement(By.id("identifierId"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='jbabu294'", un);
		
		//performing clickable actions using javascriptexecutor
		WebElement next=driver.findElement(By.id("identifierNext"));
		js.executeScript("arguments[0].click();", next);
		
		
		
	}

}
