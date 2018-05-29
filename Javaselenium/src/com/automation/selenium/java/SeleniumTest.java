package com.automation.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest 
{
public static void main(String[] args) throws InterruptedException 
{

System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe");

WebDriver webdriver=new ChromeDriver();
webdriver.manage().window().maximize();
webdriver.get("http://www.gmail.com");

WebElement username=webdriver.findElement(By.id("identifierId"));

username.clear();
username.sendKeys("jbabu294@gmail.com");
Thread.sleep(5000);

WebElement next =webdriver.findElement(By.id("identifierNext"));
next.click();
Thread.sleep(5000);

WebElement pwd=webdriver.findElement(By.name("password"));

pwd.clear();
pwd.sendKeys("babu4569");
Thread.sleep(5000);

WebElement signIn=webdriver.findElement(By.id("passwordNext"));
signIn.click();
		
//webdriver.close();
}
}