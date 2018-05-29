package com.java.programs.Properties_Utilities;


class FrameWorkException extends Exception{
	
	public FrameWorkException(String ExceptionMSG) {
	
		super(ExceptionMSG);
	}
	
}



public class OwnExceptionHandling {

	public static void main(String[] args) throws FrameWorkException {
		
		if(10==20) 
			System.out.println("equal");
		
		
		else {
			
			//FrameWorkException t = new FrameWorkException("a and b are not equal");
			//throw t;
			throw new FrameWorkException("a and b are not equal");
		}
		
	}

}
