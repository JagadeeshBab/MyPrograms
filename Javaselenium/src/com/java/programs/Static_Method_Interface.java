package com.java.programs;

interface BankOne
{
	void PinChange();
	public static String Greetings()
	{
		System.out.println("WELCOME TO ATM SERVICE");
		return "WELCOME TO VIJAYA ATM SERVICE";
		
	}
	
	default void CashDeposit()
	{
		System.out.println("INTERFACE DEFAULT IMPLEMENTATIONS");
	}
	
}
class SBIOne implements BankOne
{
	
	@Override
	public void PinChange()
	{
	//	BankOne.Greetings();		//we can call static method here
		System.out.println("PIN CHANGE:"+BankOne.Greetings());
	}
}

public class Static_Method_Interface
{
	public static void main(String[] args)
	{
	BankOne s1=new SBIOne();
	s1.PinChange();
	System.out.println("");
	
	BankOne.Greetings();
	System.out.println("");
	
	s1.CashDeposit();
	System.out.println("");
	
	SBIOne s2=new SBIOne();
	s2.PinChange();
	System.out.println("");
	
	BankOne.Greetings();
	System.out.println("");
	
	s2.CashDeposit();
	
	
	
	
	}
}
