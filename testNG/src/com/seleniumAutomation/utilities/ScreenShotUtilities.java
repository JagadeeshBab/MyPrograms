package com.seleniumAutomation.utilities;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.seleniumAutomation.base.WebdriverEngine;

public interface ScreenShotUtilities {

	public static void screenShot() throws Exception
	{
		TakesScreenshot takesScreenshot=(TakesScreenshot)WebdriverEngine.getDriver();
		File file=takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"\\FailureScreenShots\\"+WebdriverEngine.getTCName()+".jpeg"));
		
	}
}

