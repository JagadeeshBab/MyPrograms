package com.rameshsoft.automation.businessscripts;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FlipKart_Test {

	public static void main(String[] args) throws InterruptedException 
	{

	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Java_selenium\\drivers\\chromedriver.exe");

	WebDriver webdriver=new ChromeDriver();
	webdriver.manage().window().maximize();
	webdriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	webdriver.get("https://www.flipkart.com");
	Thread.sleep(5000);
	
	WebElement close =webdriver.findElement(By.xpath("//div[@id='container']/following-sibling::div//button"));
close.click();	

	String title=	webdriver.findElement(By.xpath("//*[@title='Flipkart']")).getAttribute("title");
		//String title = webdriver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Flipkart");
WebElement ele = webdriver.findElement(By.xpath("//a[@title='Electronics']"));
		Actions actions = new Actions(webdriver);
		actions.moveToElement(ele).build().perform();
		List list = webdriver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		//webdriver.switchTo().frame(0);
		WebDriverWait wait = new WebDriverWait(webdriver, 40);
		
		WebElement mob = webdriver.findElement(By.xpath("//a[@title='Mobiles']/span"));
		wait.until(ExpectedConditions.visibilityOf(mob));
		mob.click();
		//actions.moveToElement(mob).click().build().perform();
		Select select = new Select(webdriver.findElement(By.xpath("//div[@class='_1QaKk1']/select")));
		
				select.selectByValue("10000");
	
		Select select1 = new Select(webdriver.findElement(By.xpath("//div[@class='_3nSxeA']/select")));
		select1.selectByValue("20000");
		
		Thread.sleep(2000);
		((JavascriptExecutor) webdriver).executeScript("arguments[0].click();", webdriver.findElement(By.xpath("//div[contains(text(),'Samsung')]")));
		
		
		((JavascriptExecutor) webdriver).executeScript("arguments[0].click();", webdriver.findElement(By.xpath("//div[contains(text(),'4 GB')]")));
		webdriver.findElement(By.xpath("//li[contains(text(),'Popularity')]")).click();
		((JavascriptExecutor) webdriver).executeScript("arguments[0].click();",webdriver.findElement(By.xpath("//li[@class='_1mO8v9']/following-sibling::li[4]/a")) );
		
		List<WebElement> list2=webdriver.findElements(By.xpath("//*[contains(text(),'Samsung')]"));
		
		
		for(WebElement element: list2) {
			if(element.getText().contains("Samsung Galaxy A9 Pro (White, 32 GB)")) {
				
				element.click();
				
			}
			
			else 
				System.out.println("not found"); 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}