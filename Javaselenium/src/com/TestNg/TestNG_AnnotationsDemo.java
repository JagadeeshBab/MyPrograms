package com.TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_AnnotationsDemo {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this will execute before every method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("this will execute after every method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("this will execute before the class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("this will execute after the class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("this will execute before the test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("this will execute after the test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("this will execute before the suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("this will execute after the suite");
	}
}
