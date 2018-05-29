package com.seleniumAutomation.reportengine;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.seleniumAutomation.utilities.ScreenShotUtilities;

public class ExtentReport {

	
	private static ExtentReports extentreport;
	private static ExtentTest extentTest;
	
		@BeforeTest
		public void initReport() {
			
			extentreport = new ExtentReports(System.getProperty("user.dir")+"\\Reports\\report.html");
		}
		
		@BeforeMethod
		public void beforeTCExecution(Method method) {
			
			extentTest =  extentreport.startTest(method.getName());
		}

		@AfterMethod
		public void afterTCExecution(ITestResult result) throws Exception {
			
			if(result.getStatus()==result.FAILURE) {
				extentTest.log(LogStatus.FAIL, result.getThrowable());
				
			}
			extentreport.endTest(extentTest);
			extentreport.flush();
		}
		
		
		@AfterTest
		public void endReport() {
			
			extentreport.close();
		}
		
		
		public static ExtentTest getExtentTest() {
			return extentTest;
		}
}
