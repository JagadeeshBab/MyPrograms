package com.java.interview.questions;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.automation.selenium.java.LoggTest;

public class MultiplesOf5 {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(LoggTest.class);
		PropertyConfigurator.configure("F:\\selenium\\Javaselenium\\log4j.properties");
		int count = 0;
		for (int i=0; i<=100; i++) {
			int result = i * 5;
			logger.info(result);
			count++;
			if (count == 20)
				break;
		}

	}

}
