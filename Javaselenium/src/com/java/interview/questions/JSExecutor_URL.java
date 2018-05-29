package com.java.interview.questions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JSExecutor_URL {

	public static void main(String[] args) {
						
						//1.searchcontext
				SearchContext driver1=new FirefoxDriver();
				JavascriptExecutor js=(JavascriptExecutor)driver1;
				String script="window.location='http://www.gmail.com'";
				js.executeScript(script);

				//2.webdriver approach
				WebDriver driver2=new FirefoxDriver();
				//String script="window.location='http://www.gmail.com'";
				//JavascriptExecutor js=(JavascriptExecutor)driver2;
				//js.executeScript(script);
			
						Options options=driver2.manage();	
		Timeouts timeouts=options.timeouts();
		timeouts.implicitlyWait(20,TimeUnit.SECONDS);
		
		
		//3.RemoteWebDriver approah
		RemoteWebDriver driver3=new FirefoxDriver();
		driver3.executeScript("window.location='http://www.gmail.com'");
		//driver3.get(url);
		
		//4.driver classes
		FirefoxDriver driver4 = new FirefoxDriver();
		driver4.get("http://www.facebook.com");
		driver4.getScreenshotAs(OutputType.FILE);
		
		//5.TakesScreenshot approach
		TakesScreenshot driver5 =new FirefoxDriver();
	driver5.getScreenshotAs(OutputType.FILE);
		
		//6.JavascriptExecutor approach
		JavascriptExecutor driver6=new FirefoxDriver();
		
	}

}
