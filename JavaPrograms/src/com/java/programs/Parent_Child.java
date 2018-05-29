package com.java.programs;

 class Dummy {
public int a=1;
	public void login(){
		System.out.println("login");
	}
	public void logout(){
		System.out.println("logout");
	}

	 
}
class Dummy2 extends Dummy{
	public void loginM(){
		System.out.println("override");
	
}

	public void forgot() {
		System.out.println("forgot");
		System.out.println(a);
	}
}
class Dummy3 extends Dummy2{
	public void rememder()
	{
		System.out.println("remember");
		
	}
}
public class Parent_Child
{
	public static void main(String[] args) {
		Dummy d =new Dummy2();
		d.login();
		d.logout();
		
		Dummy2 d1=new Dummy2();
		d1.login();
		d1.logout();
		d1.forgot();
	
		Dummy3 d2=new Dummy3();
		
	}
}
