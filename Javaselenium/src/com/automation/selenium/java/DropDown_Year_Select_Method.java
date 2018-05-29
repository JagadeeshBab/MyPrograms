package com.automation.selenium.java;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Year_Select_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe");
		WebDriver webdriver=new ChromeDriver();
		webdriver.manage().window().maximize();
		webdriver.get("https://www.facebook.com");
WebElement yearDD=webdriver.findElement(By.id("year"));
if(yearDD.getTagName().equalsIgnoreCase("select"))
{
Select select=new Select(yearDD);
select.selectByIndex(5);//2015
select.selectByValue("2013");
select.selectByVisibleText("2016");
WebElement frstele=select.getFirstSelectedOption();
System.out.println("Text is:"+ frstele.getText());
if(select.isMultiple()) 
	System.out.println("multi select");
	else
	System.out.println("single select");

List list=select.getOptions();

System.out.println("no of elements:"+list.size());
}
else
	{
	WebElement e4=webdriver.findElement(By.cssSelector("#year>option:nth-child(9)"));
	e4.click();
	}


	}
}