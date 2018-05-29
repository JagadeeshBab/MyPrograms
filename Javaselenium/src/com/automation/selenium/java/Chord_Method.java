package com.automation.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Chord_Method {

	public static void main(String[] args) {
		FirefoxDriver webdriver=new FirefoxDriver();
		webdriver.manage().window().maximize();
		webdriver.get("https://www.google.com");
		Actions actions =new Actions(webdriver);
		webdriver.findElement(By.id("lst-ib")).sendKeys("selenium by ramesh");
		actions.sendKeys(Keys.ENTER).build().perform();
		webdriver.findElement(By.linkText("Selenium : Selenium WebDriver By Ramesh Anapati")).click();
		
		//actions.sendKeys(Keys.END);
		//actions.sendKeys(Keys.HOME);
		//actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();

		//1.Control+Operations First Approach
		//actions.sendKeys(Keys.CONTROL,"t").perform();
		actions.sendKeys(Keys.CONTROL,"s").perform();
	
		//2.Control+Operations Second Approach=Chord Method
		//actions.sendKeys(Keys.chord(Keys.CONTROL,"t")).perform();
		//actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"a")).build().perform();
		
	
	
	
	}

}