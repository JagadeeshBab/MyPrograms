package com.java.programs;

public class Testonetwo 
{
public static void main(String[] args)
{
	AOne obj=new AOne();
obj.display();
//obj.hello();


}	

}
class AOne
{
	public void display()
	{
		System.out.println("babu");
	}
}
class BOne extends AOne
{
	public void display()
	{
		System.out.println("baby");
	}
}