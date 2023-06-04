package com.cg.superkeyword;

class Animal{
	String color="Brown";
}
class Dog extends Animal{
	String color="White";
	void print() {
	System.out.println(color);
	System.out.println(super.color);
	}
}
class Puppy extends Dog{
	String color="Black";
	void print() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class Variable {

	public static void main(String[] args) {
		Puppy p = new Puppy();
		p.print();
		
		}
}
