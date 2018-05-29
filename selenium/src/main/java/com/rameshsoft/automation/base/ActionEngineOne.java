package com.rameshsoft.automation.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.rameshsoft.automation.customisedexceptions.FrameworkException;

public class ActionEngineOne extends DriverEngine{
	
	private static WebElement element ;
	private static List<WebElement> elements;
	
	
	public static WebElement getWebElement(String locType,String locTypeValue) throws FrameworkException
	{
		switch(locType)
		{
		case "id":
			 //webDriverWait(locTypeValue, locTypeValue);
			 element = getWebDriver().findElement(By.id(locTypeValue));
			 //boolean status = (element.isDisplayed()&&element.isEnabled())?true:false;
			 if (element.isDisplayed()&&element.isEnabled())
				break;
			 else
		 throw new FrameworkException("Unable to identify element with : " +locTypeValue);
			 
		case "css":
			//webDriverWait(locTypeValue, locTypeValue);
			 element = getWebDriver().findElement(By.cssSelector(locTypeValue));
			 //boolean status = (element.isDisplayed()&&element.isEnabled())?true:false;
			 if (element.isDisplayed()&&element.isEnabled())
				break;
			 else
		 throw new FrameworkException("Unable to identify element with : " +locTypeValue);	 
			 
		case "xpath":
		//	webDriverWait(locTypeValue, locTypeValue);
			 element = getWebDriver().findElement(By.xpath(locTypeValue));
			 //boolean status = (element.isDisplayed()&&element.isEnabled())?true:false;
			 if (element.isDisplayed()&&element.isEnabled()) 
				break;
			 else
		 throw new FrameworkException("Unable to identify element with : " +locTypeValue);
		
		case "name":
			//
			webDriverWait(locTypeValue, locTypeValue);
			 element = getWebDriver().findElement(By.name(locTypeValue));
			 //boolean status = (element.isDisplayed()&&element.isEnabled())?true:false;
			 if (element.isDisplayed()&&element.isEnabled()) 
				break;
			 else
		 throw new FrameworkException("Unable to identify element with : " +locTypeValue);
			 
		case "class":
			 element = getWebDriver().findElement(By.className(locTypeValue));
			 //boolean status = (element.isDisplayed()&&element.isEnabled())?true:false;
			 if (element.isDisplayed()&&element.isEnabled()) 
				break;
			 else
		 throw new FrameworkException("Unable to identify element with : " +locTypeValue);	 
			 
		case "linkText":
			 element = getWebDriver().findElement(By.linkText(locTypeValue));
			 //boolean status = (element.isDisplayed()&&element.isEnabled())?true:false;
			 if (element.isDisplayed()&&element.isEnabled()) 
				break;
			 else
		 throw new FrameworkException("Unable to identify element with : " +locTypeValue);	 
			 
			 
		case "partialLinkText":
			 element = getWebDriver().findElement(By.partialLinkText(locTypeValue));
			 //boolean status = (element.isDisplayed()&&element.isEnabled())?true:false;
			 if (element.isDisplayed()&&element.isEnabled()) 
				break;
			 else
		 throw new FrameworkException("Unable to identify element with :" +locTypeValue);	 	 
		}
		
		return element;
	}
	
	
	
	public static List<WebElement> getWebElements(String locType,String locTypeValue) throws FrameworkException
	{
		switch(locType)
		{
		case "id":
			 elements = getWebDriver().findElements(By.id(locTypeValue));
			 //boolean status = (element.isDisplayed()&&element.isEnabled())?true:false;
			 for(WebElement element : elements) {
			 if (element.isDisplayed()&&element.isEnabled())
				;
			 else
		 throw new FrameworkException("Unable to identify element with : " +locTypeValue);
			 }
		case "css":
			 elements = getWebDriver().findElements(By.cssSelector(locTypeValue));
			 //boolean status = (element.isDisplayed()&&element.isEnabled())?true:false;
			 for(WebElement element : elements) {
				 if (element.isDisplayed()&&element.isEnabled())
					;
				 else
			 throw new FrameworkException("Unable to identify element with : " +locTypeValue);
				 } 
		case "xpath":
			 elements = getWebDriver().findElements(By.xpath(locTypeValue));
			 //boolean status = (element.isDisplayed()&&element.isEnabled())?true:false;
			 for(WebElement element : elements) {
				 if (element.isDisplayed()&&element.isEnabled())
					;
				 else
			 throw new FrameworkException("Unable to identify element with : " +locTypeValue);
				 }
		case "name":
			 elements = getWebDriver().findElements(By.name(locTypeValue));
			 for(WebElement element : elements) {
				 if (element.isDisplayed()&&element.isEnabled())
					;
				 else
			 throw new FrameworkException("Unable to identify element with : " +locTypeValue);
				 } 
		case "class":
			 elements = getWebDriver().findElements(By.className(locTypeValue));
			 //boolean status = (element.isDisplayed()&&element.isEnabled())?true:false;
			 for(WebElement element : elements) {
				 if (element.isDisplayed()&&element.isEnabled())
					;
				 else
			 throw new FrameworkException("Unable to identify element with : " +locTypeValue);
				 } 
		case "linkText":
			 elements = getWebDriver().findElements(By.linkText(locTypeValue));
			 for(WebElement element : elements) {
				 if (element.isDisplayed()&&element.isEnabled())
					;
				 else
			 throw new FrameworkException("Unable to identify element with : " +locTypeValue);
				 } 
			 
		case "partialLinkText":
			 elements = getWebDriver().findElements(By.partialLinkText(locTypeValue));
			 //boolean status = (element.isDisplayed()&&element.isEnabled())?true:false;
			 for(WebElement element : elements) {
				 if (element.isDisplayed()&&element.isEnabled())
					;
				 else
			 throw new FrameworkException("Unable to identify element with : " +locTypeValue);
				 }
		}
		
		return elements;
	}
		
	public static void DTA(String locType,String locTypeValue,String testData) throws FrameworkException 
	{
		element = getWebElement(locType, locTypeValue);
		element.clear();
		element.sendKeys(testData);
	}
		
		public static void CLICK(String locType,String locTypeValue) throws FrameworkException 
		{
			element = getWebElement(locType, locTypeValue);
			element.click();
		}
		
		
		public static void mouseHover(String locType,String locTypeValue) throws FrameworkException 
		{
			Actions actions = new Actions(getWebDriver());;
			actions.moveToElement(getWebElement(locType, locTypeValue)).perform();
		}	
		
		public static String switchTo2Window() {
			String currentWindow = getWebDriver().getWindowHandle();
			Set<String> windows = getWebDriver().getWindowHandles();
			for(String window : windows) {
				if (!window.equalsIgnoreCase(currentWindow)) 
					getWebDriver().switchTo().window(window);
			}
			return getWebDriver().getWindowHandle();
		}
	public static String switchToWindows(int windowIndex) {
		Set<String> windows = getWebDriver().getWindowHandles();
		List<String> listWindows = new ArrayList(windows);
		String window = listWindows.get(windowIndex);
		getWebDriver().switchTo().window(window);
		return getWebDriver().getWindowHandle();
	}
	
	public void switchToFrame(int index)
	{
		getWebDriver().switchTo().frame(index);
	}
	
	public void switchToFrame(String idOrName)
	{
		getWebDriver().switchTo().frame(idOrName);
	}
	public void switchToFrame(WebElement element)
	{
		getWebDriver().switchTo().frame(element);
	}
		

	public void switchToFrame(int index , String idOrName, WebElement element)
	{
//		if(index)
//		{
//			
//		}
		getWebDriver().switchTo().frame(element);
		getWebDriver().switchTo().frame(index);
		getWebDriver().switchTo().frame(idOrName);
	}
		
	
public static void webDriverWait(String locType,String locTypeValue) throws FrameworkException {
	
	WebDriverWait wait = new WebDriverWait(getWebDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(getWebElement(locType, locTypeValue)));
	}
	
	
	
	
		
	
}
