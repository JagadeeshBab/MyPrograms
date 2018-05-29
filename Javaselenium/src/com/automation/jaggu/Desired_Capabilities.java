package com.automation.jaggu;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Desired_Capabilities {

	public static void main(String[] args) {
		
		DesiredCapabilities capability = new DesiredCapabilities();
		
		
		capability.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		WebDriver driver = new FirefoxDriver();
		String s1 = capability.getBrowserName();
		String s = capability.getVersion();
		Platform s3 = capability.getPlatform();
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s3);
	}

}
