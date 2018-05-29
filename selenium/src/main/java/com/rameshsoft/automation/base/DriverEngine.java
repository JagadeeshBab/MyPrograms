package com.rameshsoft.automation.base;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.rameshsoft.automation.utilities.DriverUtilities;
import com.rameshsoft.automation.utilities.ScreenShotUtility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DriverEngine 
{
	private static WebDriver webDriver;
	private ExtentReports extentReports;
	private static ExtentTest extentTest;
	
	 @Parameters("browser")
	 @BeforeSuite
		static public void openBrowser(@Optional("chrome")String browser) {
			if (browser.equalsIgnoreCase(DriverUtilities.firefox)) {
				//System.setProperty(DriverUtilities.fireKey, DriverUtilities.fireValue);
				webDriver = new FirefoxDriver();
				init();
			}
			else if (browser.equalsIgnoreCase(DriverUtilities.chrome)) {
				System.setProperty(DriverUtilities.chromeKey, DriverUtilities.chromeValue);
				webDriver = new ChromeDriver();
				init();
			}
			
			else if (browser.equalsIgnoreCase(DriverUtilities.ie)) {
				System.setProperty(DriverUtilities.ieKey, DriverUtilities.ieValue);
				webDriver = new InternetExplorerDriver();
				init();
			}	
		}
		@AfterSuite
		public static void closeBrowser() {
			if (webDriver!=null) 
				webDriver.close();
			else
				System.out.println("WEBDRIVER IS POINTING TO NULL.....");
		}	
		
		public static WebDriver getWebDriver(){
			return webDriver;
		}
		
		public static void init(){
			webDriver.manage().window().maximize();
			webDriver.manage().deleteAllCookies();
			webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		@BeforeMethod
		public void beforeTCExecution(Method method) {
			String tcName = method.getName();
			extentTest = extentReports.startTest(tcName);
			System.out.println("CURRENTLY EXECUTING TCNAME IS: " +tcName);
		}
		@AfterMethod
		public void afterTCExecution(ITestResult result) throws IOException {
			String tcName = result.getName();
			if (result.getStatus()==ITestResult.FAILURE) {
				System.out.println("FAILED TC NAME IS: " +result.getName());
				getExtentTest().log(LogStatus.FAIL, result.getThrowable());
				getExtentTest().log(LogStatus.FAIL, extentTest.addScreencast(ScreenShotUtility.screenShot(getWebDriver(), tcName)));
				ScreenShotUtility.screenShot(getWebDriver(), tcName);
			}
			else if (result.getStatus()==ITestResult.SKIP) {
				System.out.println("SKIPPED TC NAME IS: " +result.getName());
				ScreenShotUtility.screenShot(getWebDriver(), tcName);
				getExtentTest().log(LogStatus.SKIP, result.getThrowable());
				getExtentTest().log(LogStatus.SKIP, extentTest.addScreencast(ScreenShotUtility.screenShot(getWebDriver(), tcName)));
			}
			else if (result.getStatus()==ITestResult.SUCCESS) {
				System.out.println("SUCCESS TC NAME IS: " +result.getName());
			}
			extentReports.endTest(extentTest);
			extentReports.flush();
		}	
		
	@BeforeTest
	public void initExtReport() {
		extentReports = new ExtentReports(System.getProperty("user.dir")+"\\reports\\report.html");
	}	
		
	@AfterTest
	public void endExtReport() {
		extentReports.close();
	}	
		
	//Utility to get ExtentTest object for reporting at TC level	
	public static ExtentTest getExtentTest()
	{
		return extentTest;
	}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
}
