package com.selenium.windowhandles;

import java.util.ArrayList;
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
import org.testng.internal.junit.ArrayAsserts;

public class WindowHandles_3windows {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	//WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("http://www.bing.com");
	Actions actions =new Actions(driver);
	
	WebElement child=driver.findElement(By.linkText("MSN"));
	actions.contextClick(child).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
	WebElement child2=driver.findElement(By.linkText("Office Online"));
	actions.contextClick(child2).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
	//WebElement child3=driver.findElement(By.linkText("News"));
	//actions.contextClick(child3).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
	
	String parent=driver.getWindowHandle();
	System.out.println("first window is:"+parent);
	System.out.println();
	Set<String> windows=driver.getWindowHandles();
	List<String> list=new ArrayList<String>(windows);
	
	System.out.println(list);
	int countI=0;
	for(int i=0;i<list.size();i++) {
		
		
			driver.switchTo().window(list.get(i));
			System.out.println(driver.getTitle());
			List<WebElement> allele = driver.findElements(By.xpath("//a"));
			allele.addAll(driver.findElements(By.xpath("//img")));
			System.out.println(allele.size());
			
			for(WebElement ele:allele) {
			/*try{
				
				if(ele.getAttribute("type").equalsIgnoreCase("checkbox")) {
					System.out.println(ele.getTagName().contains("a"));
					System.out.println("the number of links in "+list.get(i)+"is: "+countJ);
					countJ++;
					
				}
				
				else if(ele.getAttribute("type").equalsIgnoreCase("radiobutton")) {
					System.out.println("the number of Images "+list.get(i)+"is: "+countJ);
					countJ++;
					
				}
			}
				catch(NullPointerException e) {
			
				}
			*/
				}
			
			
	}
	driver.switchTo().window(parent);
	driver.findElement(By.id("scpl1")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
