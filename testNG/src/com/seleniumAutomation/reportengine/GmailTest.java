package com.seleniumAutomation.reportengine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class GmailTest extends ExtentReport{

	
	@Test
	public void gmail_login() {
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		getExtentTest().log(LogStatus.INFO, "firefox browser is launched");
		
		
		driver.get("http://www.gmail.com");
		getExtentTest().log(LogStatus.INFO, "URL is entered");
		
		driver.findElement(By.id("identifierId")).sendKeys("jbabu294@gmail.com");
		getExtentTest().log(LogStatus.INFO, "data typing action is done on username");
		
		driver.findElement(By.id("identifierNext")).click();
		getExtentTest().log(LogStatus.INFO, "clickable action is done on next element");
		
		
	}
}
