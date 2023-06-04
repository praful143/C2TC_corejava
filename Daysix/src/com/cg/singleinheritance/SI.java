package com.cg.singleinheritance;
class Animal{
	void eat() {
		System.out.println("Eating....");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking");
	}
}

public class SI {

	public static void main(String[] args) {
		Dog d = new Dog(); //correct
		d.bark();
		d.eat();
	}

}