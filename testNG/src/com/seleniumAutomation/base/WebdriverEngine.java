package com.seleniumAutomation.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.seleniumAutomation.utilities.DriverUtilities;
import com.seleniumAutomation.utilities.ScreenShotUtilities;

public class WebdriverEngine {
	
	private static  WebDriver driver;
	private static	String tcName;
	
	@BeforeSuite
	@Parameters({"browser"})
	public void openBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty(DriverUtilities.chromeKey, DriverUtilities.chromeValue);
			driver=new ChromeDriver();
			browserInitial();	
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty(DriverUtilities.firefoxKey, DriverUtilities.firefoxValue);
			driver=new FirefoxDriver();
			browserInitial();	
		}
		
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty(DriverUtilities.ieKey, DriverUtilities.ieValue);
			driver=new InternetExplorerDriver();
			browserInitial();	
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty(DriverUtilities.edgeKey, DriverUtilities.edgeValue);
			driver=new EdgeDriver();
			browserInitial();	
		}
		
		else {
			System.out.println("give proper parameter");
		}
		
	}
	
	public void browserInitial() {
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
	}
	
	
	@AfterSuite
	public void closeBrowser() {
		if(driver!=null) {
		driver.close();
		}
		System.out.println("driver is pointering to null");

	}
	
	 public static WebDriver getDriver() {
		 
		return driver;
	}
	 
	 public static String getTCName() {
		return tcName;
		 
	 }

	@BeforeMethod
	public void tcBeforeExecution(Method method) {
		tcName=method.getName();
		System.out.println("current executing testcase is:"+tcName);
	}

	@AfterMethod
	public void tcAfterExecution(ITestResult result) throws Exception {
		tcName=result.getName();
		if(result.getStatus()==ITestResult.SUCCESS) {
			System.out.println("testcase is success dont take Screenshot");
		}
		
		
		else if(result.getStatus()==ITestResult.SKIP) {
			ScreenShotUtilities.screenShot();
			System.out.println("testcase is skipped then take ScreenShot");
		}
		
				
		else if(result.getStatus()==ITestResult.FAILURE) {
			ScreenShotUtilities.screenShot();
			System.out.println("testcase is failed then take ScreenShot");
			
			}
}


}

