package com.cg.stringconcepts;

public class SimpleString {

	public static void main(String[] args) {
		char c[]= {'J','A','V','A'};
		
		String s1 = new String(c);
		System.out.println(s1);
		
		String s2= new String(s1);
		System.out.println(s2);
		
		String s3="Java"+"Full"+"Stack"+"Training";
		System.out.println(s3);

	}

}