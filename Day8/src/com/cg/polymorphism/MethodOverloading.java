//program to demonstrate on method overloading
//Method overloading is nothing but two or more method having same method name but parameter is different

package com.cg.polymorphism;
public class MethodOverloading {

	public int subtraction(int a,int b) {
		return a-b;
	}
	//by passing different no.of arguments
	public float substraction(int a, float b) {
		return a-b;
	}
	public String print(String str,String str1) {
		return str+str1;
	}
	public char[] print(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}