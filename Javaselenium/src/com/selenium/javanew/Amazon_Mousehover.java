package com.selenium.javanew;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Mousehover {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement Depart = driver.findElement(By.xpath("//span[text()='Departments']"));
		
		WebElement AmzMsic = driver.findElement(By.xpath("//span[text()='Amazon Music']"));
		Actions actions = new Actions(driver);
		WebElement player =  driver.findElement(By.xpath("//span[text()='Open Web Player']"));
		actions.moveToElement(Depart).moveToElement(AmzMsic).click(player).build().perform();
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> windos = driver.getWindowHandles();
		//List< String> list = new ArrayList<String>(windos);
		
		for(String window:windos) {
			if(!window.equalsIgnoreCase(parent)) {
				driver.switchTo().window(window);
			
				WebElement dd = driver.findElement(By.id("chooseCountryOptions"));
				Select select = new Select(dd);
				select.selectByVisibleText("India");
				driver.findElement(By.xpath("//button[text()='Continue']")).click();
			}
		}
		
		

	}

}
