package com.selenium.windowhandles;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InterviewQ_Window_Handles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com");
		
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(list.get(4).getAttribute("type"));
		int j=0;
		for (int i = 0; i < list.size(); i++) {
		if(	list.get(i).getAttribute("type").equalsIgnoreCase("checkbox")) {
			j++;
		}
			
		}
		System.out.println("the number of checkboxes are:" +j);
		
		
		/*int i=0;
		for(WebElement ele:list) {
	System.out.println(ele.getText());
			String str=ele.getText();
			if(str.equalsIgnoreCase("checkbox")) {
				i++	;
			}
			
			}
		
System.out.println(i);*/
	}

}
