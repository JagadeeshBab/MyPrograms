package com.TestNg;

import org.testng.annotations.Test;

public class testNg_Demo {
	
	@Test(groups= {"rt"})
	public void m1() {
		System.out.println("m1 rt");
	}
	
	@Test(groups= {"rt"})
	public void m2() {
		System.out.println("m2 rt");
	}
	
	@Test(groups= {"st"})
	public void m3() {
		System.out.println("m3 st");
	}

}
