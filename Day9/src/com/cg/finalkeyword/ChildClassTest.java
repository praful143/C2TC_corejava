package com.cg.finalkeyword;

//If any class is final, we can't inherit that class

public class ChildClassTest extends FinalClass{
	
	//overloading
	public final void display(int num) {
		System.out.println("Emp id is:"+num);	
	} 
}