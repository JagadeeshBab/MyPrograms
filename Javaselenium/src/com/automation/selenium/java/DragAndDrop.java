package com.automation.selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {
	
		WebDriver webdriver=new FirefoxDriver();
		webdriver.manage().window().maximize();
		webdriver.get("https://www.jqueryui.com");
		Actions actions =new Actions(webdriver);
		//DRAG
		webdriver.findElement(By.linkText("Draggable")).click();
		Thread.sleep(3000);
		List<WebElement> frames=webdriver.findElements(By.tagName("iframe"));
		System.out.println("NUM OF FRAMES:"+frames.size());
		
		
		webdriver.switchTo().frame(0);
		WebElement e =webdriver.findElement(By.id("draggable"));
		
		actions.dragAndDropBy(e, 150, 150).perform();
		Thread.sleep(5000);
		//DRAG AND DROP
		webdriver.switchTo().defaultContent();
		webdriver.findElement(By.linkText("Droppable")).click();
		Thread.sleep(3000);
		
		webdriver.switchTo().frame(0);
		WebElement drag=webdriver.findElement(By.id("draggable"));
		WebElement drop=webdriver.findElement(By.id("droppable"));
		actions.dragAndDrop(drag, drop).perform();
		
		
	}

}
