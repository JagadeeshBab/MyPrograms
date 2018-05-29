package com.java.interview.questions;
class Access{
	
	int x;
	static int y;
	
	void call(int a, int b) {
		
		x+=a;
		y+=b;
	//	System.out.println(x+ "........."+y);
		
	}

}
public class Access_Specifier {

	public static void main(String[] args) {
		
		Access a= new Access();
		a.x=0;
		a.y=0;
		System.out.println(a.x +"......."+a.y);	//0,0
a.call(1, 2);
System.out.println(a.x +".........."+a.y);			//1,2

Access a1 = new Access();
a1.call(2, 3);

System.out.println(a.x +"........."+a.y);			//1,5
System.out.println(a1.x +"........."+a1.y);			//2,5
	}

}
