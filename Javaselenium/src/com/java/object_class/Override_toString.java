package com.java.object_class;

public class Override_toString {

	private String className;
	
	public Override_toString(String className) {
		
		this.className = className;
		
	}
	
	@Override
	public String toString() {
		
		return className;					//jagadeesh
	//	return toString();					//run time exception
		//return super.toString();			//com.java.object_class.Override_toString@70dea4e
	}
	public static void main(String[] args) {
		
		
		Override_toString os= new Override_toString("jagadeesh");
		System.out.println(os);
	}

}
