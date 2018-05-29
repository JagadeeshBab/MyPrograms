package com.automation.jaggu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_Windows {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\seleniumAutomation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("J_BABU");
		driver.findElement(By.name("password")).sendKeys("FreeCRM");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		Thread.sleep(3000);
		//String title = driver.getTitle();
		driver.switchTo().frame("mainpanel");
		
		WebElement e1=driver.findElement(By.xpath("//div[@id='navmenu']/ul/li[1]/a"));
		WebElement e2=driver.findElement(By.xpath("//div[@id='navmenu']/ul/li[2]/a"));
		WebElement e3=driver.findElement(By.xpath("//div[@id='navmenu']/ul/li[3]/a"));
		WebElement e4=driver.findElement(By.xpath("//div[@id='navmenu']/ul/li[4]/a"));
		WebElement e5=driver.findElement(By.xpath("//div[@id='navmenu']/ul/li[5]/a"));
		WebElement e6=driver.findElement(By.xpath("//div[@id='navmenu']/ul/li[15]/a"));
		
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		
		act.keyDown(Keys.CONTROL).click(e1).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.CONTROL).click(e2).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.CONTROL).click(e3).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
//		act.keyDown(Keys.CONTROL).click(e4).keyUp(Keys.CONTROL).build().perform();
//		Thread.sleep(3000);
//		act.keyDown(Keys.CONTROL).click(e5).keyUp(Keys.CONTROL).build().perform();
//		Thread.sleep(3000);
//		act.keyDown(Keys.CONTROL).click(e6).keyUp(Keys.CONTROL).build().perform();
//		
		Thread.sleep(3000);
		Set<String> set = driver.getWindowHandles();
		Thread.sleep(3000);
		List<String> list = new LinkedList(set);
		
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println("windows are : "+ i+list.get(i));
			driver.switchTo().window(list.get(i));
			Thread.sleep(5000);
			driver.switchTo().frame("mainpanel");
			List<WebElement> list2 = driver.findElements(By.tagName("select"));
			System.out.println(list2.size());
			Thread.sleep(3000);
						for(int j=0;j<list2.size();j++){
							String text = list2.get(j).getText();
							System.out.println("values of  are: "+j+text);
						}




//List<WebElement> list1 = driver.findElements(By.tagName("iframe"));
//System.out.println(list1.size());
			
		}
		
	}

}
