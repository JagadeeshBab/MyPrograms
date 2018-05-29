package com.rameshsoft.automation.businessscripts;

import org.testng.annotations.Test;

import com.rameshsoft.automation.base.DriverEngine;

public class FbTest extends DriverEngine{
	@Test
public void fbTest() {
	//DriverEngine.getWebDriver().get("https://www.facebook.com");
		getWebDriver().get("https://www.facebook.com");
}
}
