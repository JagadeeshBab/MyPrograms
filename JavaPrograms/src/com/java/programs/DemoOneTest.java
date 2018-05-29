package com.java.programs;
class DemoOne{
	
	int id;
	String name;
	
	public DemoOne(int id1, String name1) {
		id=id1;
		name=name1;
		
	}
	public void display() {
		System.out.println(id+"......."+name);
	}
}
public class DemoOneTest {

	public static void main(String[] args) {
		DemoOne d = new DemoOne(90,"java");
			d.display();
	}

}
