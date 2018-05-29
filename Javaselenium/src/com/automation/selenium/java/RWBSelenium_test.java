package com.automation.selenium.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RWBSelenium_test {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe");
		RemoteWebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		
		WebElement username= driver.findElementById("identifierId");
		username.clear();
		username.sendKeys("jbabu294");
		Thread.sleep(5000);
		
		WebElement next = driver.findElementById("identifierNext");
		next.click();
		Thread.sleep(3000);
		
		WebElement pwd= driver.findElementByName("password");
		pwd.clear();
		pwd.sendKeys("jbabu294babu");
		Thread.sleep(3000);
		
		WebElement signin=driver.findElementById("passwordNext");
		signin.click();
		Thread.sleep(3000);
	
}
}