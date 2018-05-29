package com.automation.selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Day_Select_Method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.manage().window().maximize();
		webdriver.get("https://www.facebook.com");
		WebElement dayDD = webdriver.findElement(By.id("day"));
		if (dayDD.getTagName().equalsIgnoreCase("select")) {
			Select select = new Select(dayDD);
			select.selectByIndex(5);
			select.selectByValue("18");
			select.selectByVisibleText("24");
			WebElement fstele = select.getFirstSelectedOption();// 24 because it is single selector dropdown
			System.out.println("Text is:" + fstele.getText());
			if (select.isMultiple())
				System.out.println("multi select");
			else
				System.out.println("single select");

			// List list=select.getOptions();
			List list = select.getOptions();
			System.out.println("no of elements:" + list.size());
		} else {
			WebElement e = webdriver.findElement(By.cssSelector("#day>option:nth-child(9)"));
			e.click();
		}

	}

}
