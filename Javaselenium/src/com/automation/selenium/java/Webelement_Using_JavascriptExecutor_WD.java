package com.automation.selenium.java;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Using_JavascriptExecutor_WD {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("https://www.gmail.com");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('identifierId').value='jbabu294'");
	js.executeScript("document.getElementById('identifierNext').click();");
	Thread.sleep(5000);
	js.executeScript("document.getElementsByName('password')[0].value='babu'");	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
