package com.automation.selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expected_Conditions {

	public static void main(String[] args) {
		WebDriver webdriver=new FirefoxDriver();
		webdriver.manage().window().maximize();
		webdriver.get("https://www.gmail.com");
		webdriver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);

		webdriver.findElement(By.id("identifierId")).clear();
		webdriver.findElement(By.id("identifierId")).sendKeys("jbabu294@gmail.com");
		

		webdriver.findElement(By.id("identifierNext")).click();;
		
		//WebDriverWait wait =new WebDriverWait(webdriver, 10);
		//webdriver.findElement(By.name("password"));
	//	wait.until(ExpectedConditions.visibilityOf(webdriver.findElement(By.name("password"))));
		
		webdriver.findElement(By.name("password")).sendKeys("5648965");
		webdriver.findElement(By.id("passwordNext")).click();
	}

}
