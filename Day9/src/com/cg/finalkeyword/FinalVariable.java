package com.cg.finalkeyword;

public class FinalVariable {

	
	//final variable must be initialized
	
	//when we use final keyword with any variable name we can't change the value of that variable
	
	
	final int x = 12; 
	
	public void print(final String name)
	{
		// we can't change the value of final variable 
		//x=13;
		
		System.out.println("The value of x is: " +x);
		//If method parameters are declared final then the value of these parameters cannot be changed
		System.out.println("The name is:"+name);
		
	}
}