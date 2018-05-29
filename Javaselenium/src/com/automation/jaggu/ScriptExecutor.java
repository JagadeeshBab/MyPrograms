package com.automation.jaggu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptExecutor {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.FreeCRM.com");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("J_BABU");
		driver.findElement(By.name("password")).sendKeys("FreeCRM");
		WebElement logBtn = driver.findElement(By.cssSelector(".btn.btn-small"));
		
	}


public static void flash(WebDriver driver,WebElement element) {
	
	JavascriptExecutor exe = (JavascriptExecutor)driver; 
	String bgclor = element.getCssValue("bckgroundcolor");
}
}