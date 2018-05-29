package com.selenium.windowhandles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandles_Demo {
public static void main(String[] args) throws Exception {
	//System.setProperty("webdriver.chrome.driver","F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe" );
	//WebDriver driver=new ChromeDriver();
	//System.setProperty("webdriver.gecko.driver","F:\\selenium\\Javaselenium\\drivers\\geckodriver.exe" );
	WebDriver driver=new FirefoxDriver();
	//System.setProperty("webdriver.edge.driver","F:\\selenium\\Javaselenium\\drivers\\MicrosoftWebDriver.exe" );
	//WebDriver driver=new EdgeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	driver.get("http://www.bing.com");
	Actions actions =new Actions(driver);
	
	
	WebElement child=driver.findElement(By.linkText("MSN"));
	Thread.sleep(3000);
	actions.contextClick(child).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
	String parent=driver.getWindowHandle();
	System.out.println("first window is:"+parent);
	Thread.sleep(5000);
	Set<String> windows=driver.getWindowHandles();
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	for(String wind:windows) {
		Thread.sleep(5000);
		System.out.println(wind);

		if(!wind.equalsIgnoreCase(parent)) {
			driver.switchTo().window(wind);
			driver.findElement(By.id("q")).sendKeys("infinity war");
			actions.sendKeys(Keys.ENTER).build().perform();
		}
	}
	driver.switchTo().window(parent);
	driver.findElement(By.id("scpl1")).click();
	
}
}