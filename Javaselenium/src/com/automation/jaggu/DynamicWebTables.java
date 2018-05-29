package com.automation.jaggu;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Javaselenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody"));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
	
	}

}
