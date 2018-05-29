package com.automation.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys_Mechanism {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe");
		WebDriver webdriver=new ChromeDriver();
		webdriver.manage().window().maximize();
		webdriver.get("https://www.gmail.com");
		Actions actions =new Actions(webdriver);
		WebElement element=webdriver.findElement(By.id("identifierId"));
		
		//ways to datatyping
		//actions.click(element).sendKeys("jbabu294").build().perform();
		//actions.click(element).sendKeys("jbabu294").perform();
		actions.sendKeys(element, "jbabu294").build().perform();//this is sendkeys method to datatyping
		
WebElement next=webdriver.findElement(By.id("identifierNext"));
		//ways to click operations

		//	next.click();			//1.webelement interface method
		//	next.sendKeys(Keys.ENTER);		//2.sendkeys method   &&      3.by using java script also we can perform click operation
		//	actions.sendKeys(next, Keys.ENTER).build().perform();		//4.sendjeys action mechanism
		//	actions.click().perform();									//5.by using action mechanism
			actions.doubleClick(next).perform();
			}

}
