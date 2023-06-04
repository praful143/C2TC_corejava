package com.cg.polymorphism;

public class OverloadingExecutor {

	public static void main(String[] args) {
		MethodOverloading m1=new MethodOverloading();
		System.out.println(m1.subtraction(12,5));
		System.out.println(m1.subtraction(12,3));
		System.out.println(m1.print("B48"));
		System.out.println(m1.print("Welcome to", "c2Tc"));
		
		//ConstructorOverloading()

	}

}