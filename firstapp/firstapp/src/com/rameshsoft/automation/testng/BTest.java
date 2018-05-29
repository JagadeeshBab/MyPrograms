package com.rameshsoft.automation.testng;

import org.testng.annotations.Test;

public class BTest {
	@Test(groups= {"e2e","ST"})
	public void atest() {
		System.out.println("RT E2E ST");
	}
		@Test(groups= {"e2e","RT"})
		public void atest1() {
			System.out.println("RT E2E");
		}

}
