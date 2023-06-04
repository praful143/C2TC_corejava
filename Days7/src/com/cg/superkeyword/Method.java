package com.cg.superkeyword;
class Animall{
	void eat() {
		System.out.println("Eating");
	}
}
class Dogg extends Animall{
	void eat() {
		System.out.println("Eating meat");
	}
	void call() {
		super.eat();
	}
}

public class Method {

	public static void main(String[] args) {
		Dogg d = new Dogg();
		d.eat();
		d.call();
	}

}
