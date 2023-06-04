package com.cg.abstractclass;
abstract class Animal{
	abstract void eat();
	
}

class Dog extends Animal{
	@Override
	void eat() {
		System.out.println("Dog is eating bread");
	}
}
class Puppy extends Dog {
	
}
public class AnimalExample {

	public static void main(String[] args) {
		
		Puppy p = new Puppy();
		p.eat();
		Dog d = new Dog();
		d.eat();
		
	}

}
