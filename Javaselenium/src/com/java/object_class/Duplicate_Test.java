package com.java.object_class;

public class Duplicate_Test implements Cloneable 
{

		int id;
		String name;
		
		public void display() {
		
			System.out.println(id+"......."+name);

		}
		
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Duplicate_Test dt= new Duplicate_Test();
		dt.display();							//0.......null
		System.out.println(dt.hashCode());		//118352462
		
		dt.id=100;
		dt.name="java";
		dt.display();							//100.......java
	Duplicate_Test dt1=	(Duplicate_Test) dt.clone();

	dt1.id=24;
	dt1.name="selenium";
	dt1.display();								//24.......selenium
System.out.println(dt1.hashCode());				//1550089733
	}

}
