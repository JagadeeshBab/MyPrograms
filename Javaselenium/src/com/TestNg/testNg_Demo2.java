package com.TestNg;

import org.testng.annotations.Test;

public class testNg_Demo2 {
	@Test(groups= {"st","rt"})
	public void m4() {
		System.out.println("m4 st and rt");
	}
	
	@Test(groups= {"rt"})
	public void m5() {
		System.out.println("m5 rt");
	}
	
	@Test(groups= {"st"})
	public void m6() {
		System.out.println("m6 st");
	}

}
