package com.java.collection;

import java.util.ArrayList;
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
	//	Set set=new LinkedHashSet(elements);
		Set set=new LinkedHashSet();
		for(int i=0;i<elements.size();i++)
		{
			
			set.add(elements.get(i));
			
		}
		
		List list1 = new ArrayList(set);
		List list2 = new ArrayList();
		for(int i=0;i<list1.size();i++)
		{
			WebElement ele = (WebElement)elements.get(i);
			list2.add(ele.getText());
		}
			
		System.out.println("AFTER REMOVING DUPLICATES ARE:"+list2);
		}
		else
		{
			List list=webdriver.findElements(By.cssSelector("#day>option"));
			Set set =new LinkedHashSet(list);
			System.out.println("AFTER REMOVING DUPLICATES:"+set);
		}
}
}