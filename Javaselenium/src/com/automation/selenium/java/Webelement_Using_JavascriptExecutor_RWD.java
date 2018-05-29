package com.automation.selenium.java;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Webelement_Using_JavascriptExecutor_RWD {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe" );
	RemoteWebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("https://www.gmail.com");
	
	driver.executeScript("document.getElementById('identifierId').value='jbabu294'");
	driver.executeScript("document.getElementById('identifierNext').click();");
	Thread.sleep(5000);
	driver.executeScript("document.getElementsByName('password')[0].value='babu'");	
	
}
}
