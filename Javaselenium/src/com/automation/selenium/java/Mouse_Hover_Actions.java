package com.automation.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe");
		WebDriver webdriver=new ChromeDriver();
		webdriver.manage().window().maximize();
		webdriver.get("https://www.amazon.com");
		Actions actions =new Actions(webdriver);
		WebElement ele =webdriver.findElement(By.xpath("//div[@id='nav-shop']/a/span[2]"));
actions.moveToElement(ele).build().perform();


	}

}
