package com.java.programs;

	class BankInnerInterfaceTest
	{
		public static void main(String... args)
		{
		Bank a=new A();
		a.hello();
												//a.display();    compile time error
		System.out.println(Bank.bankName);
		
		Bank.PersonalLoan bl=new B();
		bl.hello();
		bl.personalLoan();

		B b=new B();
		b.hello();
		b.personalLoan();
		System.out.println(Bank.bankName);
		}
	}
	interface Bank
	{
		String bankName="SBH";
		void hello();
		interface PersonalLoan 
		{
		void personalLoan();
		void hello();	
		}	
	}
		
	class A implements Bank
	{
		public void hello()   //this is for bank interface void method
		{
		System.out.println("hello");
		}
	}
		
	class B implements Bank, Bank.PersonalLoan 
	{
		public void personalLoan()
		{
		System.out.println("personalLoan");
		}
		public void hello()              //this is for interface personalLoan void method
		{
		System.out.println("good morning");
		}
	}
