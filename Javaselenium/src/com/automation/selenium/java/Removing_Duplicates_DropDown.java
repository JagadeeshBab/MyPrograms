package com.automation.selenium.java;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Removing_Duplicates_DropDown {
public static void main(String[] args) {
			WebDriver webdriver=new FirefoxDriver();
			webdriver.manage().window().maximize();
			webdriver.get("https://www.facebook.com");
		WebElement dayDD=webdriver.findElement(By.id("day"));
		if(dayDD.getTagName().equalsIgnoreCase("select"))
		{
		Select select=new Select(dayDD);
		List elements=select.getOptions();
		//Set set=new LinkedHashSet(elements);
		System.out.println("AFTER REMOVING DUPLICATES:"+elements.size());
		}
		else
		{
			List list=webdriver.findElements(By.cssSelector("#day>option"));
			Set set =new LinkedHashSet(list);
			System.out.println("AFTER REMOVING DUPLICATES:"+set);
		}
}
}