package com.automation.selenium.java;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ReporterConfig.Property;

public class LoggTest {

	public static void main(String[] args) {
	Logger logger=	Logger.getLogger(LoggTest.class);
PropertyConfigurator.configure("F:\\selenium\\Javaselenium\\log4j.properties");
System.setProperty("webdriver.chrome.driver","F:\\selenium\\Javaselenium\\drivers\\chromedriver.exe" );
WebDriver driver=new ChromeDriver();
logger.info("Browsser is Opened");
driver.manage().window().maximize();
logger.info("Window is Maximised");
driver.get("https://www.gmail.com");
logger.info("entered url as:https://www.gmail.com");
	}

}
