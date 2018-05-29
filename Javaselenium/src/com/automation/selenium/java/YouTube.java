package com.automation.selenium.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class YouTube {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	driver.get("http://www.youtube.com");
	
	Actions actions =new Actions(driver);
	driver.findElement(By.id("search")).sendKeys("seleniumbyramesh");
	
	actions.sendKeys(Keys.ENTER).build().perform();
	List<WebElement> module=driver.findElements(By.id("video-title"));
	System.out.println(module.size());
	for(WebElement v:module) {
		
		//System.out.println(mod.getText());
	}
	module.get(4).click();
	//WebElement next=driver.findElement(By.xpath("//div[@id='ytp-id-17']/following-sibling::div[2]/div[2]//a[2]"));
	//actions.moveToElement(next).click(next).build().perform();
	
	//List<WebElement> frames=driver.findElements(By.tagName("iframe"));
	//driver.switchTo().frame(0);
	//System.out.println("no of frames:"+frames.size());
	
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click();", next);
	
	
	Thread.sleep(5000);
	actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
	Thread.sleep(5000);
	actions.sendKeys(Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT).build().perform();
	Thread.sleep(5000);
	driver.findElement(By.id("text")).click();
	
	driver.findElement(By.id("identifierId")).sendKeys("jbabu294@gmail.com");
	Thread.sleep(5000);

	driver.findElement(By.id("identifierNext")).click();
	Thread.sleep(5000);

	driver.findElement(By.name("password")).sendKeys("456316");
	Thread.sleep(5000);

	driver.findElement(By.id("passwordNext")).click();
	

}
}
