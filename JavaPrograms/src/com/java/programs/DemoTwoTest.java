package com.java.programs;
class DemoTwo{
	
	int id;
	String name;
	
	public DemoTwo(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
	public void display() {
		System.out.println(id+"......."+name);
	}
}
public class DemoTwoTest {

	public static void main(String[] args) {
	
		DemoTwo d1=new DemoTwo(24,"selenium");
		d1.display();

	}

}
