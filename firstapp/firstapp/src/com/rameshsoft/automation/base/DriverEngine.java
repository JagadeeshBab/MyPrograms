package com.rameshsoft.automation.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.rameshsoft.automation.utilities.DriverUtilities;
import com.rameshsoft.automation.utilities.ScreenShotUtility;

public class DriverEngine {
	private static WebDriver driver;
	private static String tcName;
	@Parameters({"browser"})
	@BeforeSuite
	public void openBrowser(@Optional("firefox")String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(DriverUtilities.chromeKey, DriverUtilities.chromeValue);
			driver = new ChromeDriver();
			browserInit();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			browserInit();
		}
       else if (browser.equalsIgnoreCase("ie")) {
    	   System.setProperty(DriverUtilities.ieKey, DriverUtilities.ieValue);
    	   driver = new InternetExplorerDriver();
    	   browserInit();
		}
       else
       {
    	   System.out.println("Pass proper parameter");
       }
	}
	@AfterSuite
	public void closeBrowser() {
		if (driver!=null) 
		driver.close();
		else
			System.out.println("DRIVER IS POINTING TO NULL......");
	}
	
	public void browserInit() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
	}
	
	static public WebDriver getWebDriver() {
		return driver;
	}
	@BeforeMethod
	public void beforeTCExecution(Method method) {
		String tcName = method.getName();
		System.out.println("CURRENTLY EXECUTING TC IS: " +tcName);
	} 
	@AfterMethod
	public void afterTCExecution(ITestResult result) throws IOException {
		tcName = result.getName();
		if (result.getStatus()==ITestResult.FAILURE) {
			System.out.println(tcName+ ":TC IS  FAILED SO TAKING SCRENSHOT");
			ScreenShotUtility.screenShot();
		}
		else if (result.getStatus()==ITestResult.SUCCESS) {
			System.out.println(tcName + "TC IS PASSED SO NOT TAKING SCREENSHOT");
		}
		else if (result.getStatus()==ITestResult.SKIP) {
			ScreenShotUtility.screenShot();
					}
	}
	
	public static String getTCName()
	{
		return tcName;
	}
	
	
}









