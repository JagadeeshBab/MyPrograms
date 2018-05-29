package com.java.programs.logical;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MultiplesOf5 {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(MultiplesOf5.class);
		PropertyConfigurator.configure("F:\\selenium\\JavaPrograms\\log4j.properties");
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
