package com.selenium.windowhandles;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InterviewQ_Window_Handles2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com");
		
		List<WebElement> list=driver.findElements(By.xpath("//*"));
	System.out.println(list.size());
	Thread.sleep(5000);
	System.out.println(list.get(4).getText());
	
	
	int i=0;
	for(WebElement ele:list) {
		
		
		if(ele.getAttribute("type").equalsIgnoreCase("checkbox"))
		{
			i++;
		}
	}
	System.out.println("total number of checkboxes are:"+i );
	}

}
