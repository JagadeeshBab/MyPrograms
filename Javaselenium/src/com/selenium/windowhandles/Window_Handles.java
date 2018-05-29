package com.selenium.windowhandles;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handles {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.get("http://www.bing.com");
		Actions actions =new Actions(driver);
		
		driver.findElement(By.linkText("MSN")).click();
		driver.findElement(By.linkText("Office Online")).click();
		/*WebElement second=driver.findElement(By.linkText("MSN"));
		actions.contextClick(second).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		WebElement third=driver.findElement(By.linkText("Office Online"));
		actions.contextClick(third).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();*/
		
		//WebElement img=driver.findElement(By.id("scpl1"));	
		//Actions actions =new Actions(driver);
		//actions.contextClick(img).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		
		//WebElement vids=driver.findElement(By.id("scpl2"));	
		//actions.contextClick(vids).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		
		//WebElement maps=driver.findElement(By.id("scpl3"));	
	//	actions.contextClick(maps).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
	
		String firstwind=driver.getWindowHandle();
		System.out.println("first window is:"+firstwind);
		
		Set<String> windows=driver.getWindowHandles();
		List<String> list=new ArrayList(windows);
		System.out.println("all windows are:"+list);
		driver.switchTo().window(list.get(1));
		driver.findElement(By.id("q")).sendKeys("selenium");
		driver.findElement(By.id("sb_form_go")).click();
		
		driver.switchTo().window(list.get(0));
		driver.findElement(By.id("hp_scroll_listen_pad")).sendKeys("avengers infinity war");
		
		actions.sendKeys(Keys.ENTER).build().perform();
		
	}
	}
	
