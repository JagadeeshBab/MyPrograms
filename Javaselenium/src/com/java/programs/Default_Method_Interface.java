package com.java.programs;

interface RBIBank
{
	void Pinchange();
	void CashwithDraw();
	
	default void CashDeposit(){
		System.out.println("INTERFACE DEFAULT IMPLEMENTATION");
	}
}

class SBH implements RBIBank
{
	@Override
	public void Pinchange() {
		System.out.println("SBH PIN CHANGE");
	}
	@Override
	public void CashwithDraw() {
		System.out.println("SBH CASHWITHDRAW");
	}
}

class SBI implements RBIBank
{
	@Override
	public void Pinchange() {
		System.out.println("SBI PIN CHANGE");
	}
	@Override
	public void CashwithDraw() {
		System.out.println("SBI CASHWITHDRAW");
	}	
	public void CashDeposit() {
		System.out.println("SBI IMPLEMENTATION");
	}
}
public class Default_Method_Interface
{
	public static void main(String[] args)
	{
	SBH s=new SBH();
	s.CashDeposit();
	s.CashwithDraw();
	s.Pinchange();
System.out.println("");

	SBI s1=new SBI();
	s1.CashDeposit();
	s1.CashwithDraw();
	s1.Pinchange();
	System.out.println("");
	
	RBIBank rb=new SBH();
	rb.Pinchange();
	rb.CashwithDraw();
	rb.CashDeposit();

	RBIBank rb1=new SBI();
	rb1.Pinchange();
	rb1.CashwithDraw();
	rb1.CashDeposit();


}
}
