package com.automation.selenium.java;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SreenShotUsingWD {

	public static void main(String[] args) throws Exception {
			
	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://gmail.com");
	
	TakesScreenshot screenshot =(TakesScreenshot)driver;
	File file=screenshot.getScreenshotAs(OutputType.FILE);
	//File file1 = new File("F:\\selenium\\Java_selenium\\SreenShot\\Gmail_Login.jpeg");
	FileUtils.copyFile(file, new File("F:\\selenium\\Java_selenium\\SreenShot\\Gmail_Login.jpeg"));
}
}