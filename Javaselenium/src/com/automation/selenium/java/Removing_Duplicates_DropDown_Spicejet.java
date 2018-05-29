package com.automation.selenium.java;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Removing_Duplicates_DropDown_Spicejet {
public static void main(String[] args) {
			WebDriver webdriver=new FirefoxDriver();
			webdriver.manage().window().maximize();
			webdriver.get("http://www.xe.com");
			webdriver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		WebElement spjet=webdriver.findElement(By.id("from"));
		if(spjet.getTagName().equalsIgnoreCase("select"))
		{
		Select select=new Select(spjet);
		List<WebElement> elements=select.getOptions();
		Set<WebElement> set=new LinkedHashSet(elements);
		System.out.println("AFTER REMOVING DUPLICATES:"+set);
		}
		else
		{
			List<WebElement> elements=webdriver.findElements(By.id("from"));
			for(WebElement ele:elements) {
				System.out.println("elements are :"+ele.getText());
			}
			
			
			System.out.println("AFTER REMOVING DUPLICATES ARE:"+elements);
		}
}
} 