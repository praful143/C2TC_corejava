package com.cg.statickeyword;

public class Justification {

	//If static block is in the program - it gets first priority
	
	static {
		System.out.println("In Static Block");
	}
	public static void main(String[] args) {
		System.out.println("In Main method");

	}

}