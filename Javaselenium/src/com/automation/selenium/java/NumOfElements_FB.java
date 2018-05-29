package com.automation.selenium.java;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NumOfElements_FB {

	public static void main(String[] args) {
		WebDriver webdriver=new FirefoxDriver();
		webdriver.manage().window().maximize();
		webdriver.get("https://www.facebook.com");
	WebElement dayDD=webdriver.findElement(By.id("day"));
	if(dayDD.getTagName().equalsIgnoreCase("select"))
	{
	Select select=new Select(dayDD);
	List<WebElement> dropDowns=select.getOptions();
	
	for(WebElement li:dropDowns) {
		System.out.println("elements are :"+li.getText());
		
		if(li.getText().equalsIgnoreCase("24")) {
		li.click();
		break;
		}
		else
		{
			System.out.println("element is not available");
		}
	
	}
	}
}
}
