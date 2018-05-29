package com.automation.selenium.ExtentReportScreenShot;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentScreenShot {

	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest extentTest;

	@BeforeTest
	public void setExtent() {

		extent = new ExtentReports(System.getProperty("user.dir") + "//test-output//nolocators.html");

	}

	@AfterTest
	public void endExtent() {

		extent.flush();
		extent.close();

	}

	public static String getScreenShot(WebDriver driver, String ScreenShotName) throws IOException {

		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		File fileDestination = new File(
				System.getProperty("user.dir") + "\\ScreenShots\\" + ScreenShotName + dateName + ".jpeg");
		FileUtils.copyFile(file, fileDestination);
		return ScreenShotName;

	}

	@BeforeSuite
	public void launch() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\selenium\\ExtentReportScreenShot\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");

	}

	@AfterSuite
	public void Browserclose() {
		if (driver != null)
			driver.close();
	}

	@Test
	public void gmailLog() {
		driver.switchTo().activeElement().sendKeys("jbabu294@gmail.com");
		Actions act = new Actions(driver);

		act.sendKeys(Keys.ENTER).build().perform();
		driver.switchTo().activeElement().sendKeys("76264326");

	}

	@BeforeMethod
	public void beforeTC() {

	}

	@AfterMethod
	public void afterTC(ITestResult result) throws IOException {
		String tcName = result.getName();
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("FAILED TC NAME IS: " + result.getName());
			extentTest.log(LogStatus.FAIL, result.getThrowable());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(ExtentScreenShot.getScreenShot(driver, tcName)));
			extentTest.log(LogStatus.FAIL, extentTest.addScreencast(ExtentScreenShot.getScreenShot(driver, tcName)));
			ExtentScreenShot.getScreenShot(driver, tcName);
		}
		extent.endTest(extentTest);

	}
}
