package com.cg.multilevelinheritance;

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
class Puppy extends Dog{
	void weep() {
		System.out.println("Weeping");
	}
}
public class MultilevelInheritance {
	
	
	public static void main(String[] args) {
		Puppy p = new Puppy();
		p.weep();
		p.bark();
		p.eat();
		
		Dog d = new Puppy();
		d.bark();
		d.eat();
		
		Dog d1=new Dog();
		d1.bark();
		d1.eat();
		
		Animal a = new Animal();
		a.eat();
		
	}

}