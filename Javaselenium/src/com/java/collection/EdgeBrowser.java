package com.java.collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.edge.driver","F:\\selenium\\Javaselenium\\drivers\\MicrosoftWebDriver.exe" );
		//WebDriver driver=new EdgeDriver();
		
		
		System.setProperty("webdriver.opera.driver","F:\\selenium\\Javaselenium\\drivers\\operadriver.exe" );
		WebDriver driver=new OperaDriver();
	
		driver.get("http://www.google.com");
	}

}
