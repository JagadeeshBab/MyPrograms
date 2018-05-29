package com.automation.selenium.java;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RWDTestDemo {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe");
	//RemoteWebDriver remoteWebDriver=new ChromeDriver();
	RemoteWebDriver remoteWebDriver=new FirefoxDriver();
	remoteWebDriver.get("https://www.gmail.com");
	WebElement username=remoteWebDriver.findElementById("identifierId");
	username.clear();
	username.sendKeys("jbabu294@gmail.com");
	
}
}
