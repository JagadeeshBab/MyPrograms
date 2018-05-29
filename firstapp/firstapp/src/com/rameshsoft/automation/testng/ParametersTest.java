package com.rameshsoft.automation.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

	@Parameters({"userName","pwd"})
	@Test
	public void login(@Optional("rameshatmtech")String userName,String pwd) {
		System.out.println("Login " + userName + pwd);
	}
	
}
