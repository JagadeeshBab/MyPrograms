package com.automation.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click_Operations {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe");
		WebDriver webdriver=new FirefoxDriver();
		webdriver.manage().window().maximize();
		webdriver.get("https://www.google.com");
		Actions actions =new Actions(webdriver);
		webdriver.findElement(By.id("lst-ib")).sendKeys("selenium by ramesh");
		actions.sendKeys(Keys.ENTER).build().perform();
		WebElement rtclick =webdriver.findElement(By.xpath("//a[text()='Selenium : Selenium WebDriver By Ramesh Anapati']"));
		
		actions.contextClick(rtclick).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();//for new window
		
		//actions.contextClick(rtclick).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();//for new tab
		
	

	}

}
