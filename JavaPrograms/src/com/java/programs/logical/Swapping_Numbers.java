package com.java.programs.logical;

public class Swapping_Numbers {

	public static void main(String[] args) {
		
		int x=10;
		int y=24;
		int a;
		
		//1.with using third variable
		a=x;		//a=10
		x=y;		//x=24
		y=a;		//y=10
		System.out.println("x value is :" +x);
		System.out.println("y value is :"+y);

		
		//2.without using third variable with + and - operators
		int f=24;
		int s=21;
		f=f+s;		//f=10+24=34
		s=f-s;		//s=34-24=10
		f=f-s;		//f=34-10=24
		System.out.println("f value is :" +f);
		System.out.println("s value is :"+s);
		
		//3.without using third variable with * and / operators
		int i=20;
		int j=30;
		
		i=i*j;      //i=20*30=600
		j=i/j;		//j=600/30=20
		i=i/j;		//i=600/20=30
		System.out.println("i value is :" +i);
		System.out.println("j value is :" +j);
		
		//4.using XOR
		int m=15;
		int n=2;
		m=m^n;
		n=m^n;
		m=m^n;
		System.out.println("m value is :" +m);
		System.out.println("n value is :" +n);
		
	}

}
