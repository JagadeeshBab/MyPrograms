package com.rameshsoft.automation.utilities;

public interface DriverUtilities {
String ieKey = "webdriver.ie.driver";
String ieValue = System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe";
String firefoxKey = "webdriver.gecko.driver";
String firefoxValue = System.getProperty("user.dir")+"\\Drivers\\GeckoDriver.exe";;
String chromeKey = "webdriver.chrome.driver";
String chromeValue = System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";


}
