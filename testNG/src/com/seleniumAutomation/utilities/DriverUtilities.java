package com.seleniumAutomation.utilities;

public interface DriverUtilities {

	String ieKey="webdriver.ie.driver";
	String ieValue=System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe";

	String chromeKey="webdriver.chrome.driver";
	String chromeValue=System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";

	String firefoxKey="webdriver.gecko.driver";
	String firefoxValue=System.getProperty("user.dir")+"\\Drivers\\geckoriver.exe";
	
	String edgeKey="webdriver.edge.driver";
	String edgeValue=System.getProperty("user.dir")+"\\Drivers\\MicrosoftWebDriver.exe";



	
}
