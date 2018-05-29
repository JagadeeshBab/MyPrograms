package com.automation.selenium.java;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SreenShot_Using_RWD {
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe");
	RemoteWebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://facebook.com");
	
	File img=driver.getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(img, new File("F:\\selenium\\Java_selenium\\SreenShot\\FB_login.jpeg"));
	
	
		
}
}

