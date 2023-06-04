package com.cg.abstractclass;
abstract class BikeEx{
	abstract void run(); //declaration
	void show() {
		System.out.println("Bike Class");
	}
}
//Concrete class
class Honda extends BikeEx{
	void run() {
		System.out.println("Honda Bike is running");
	}
}
public class Main{
	public static void main(String[] args) {
		Honda h = new Honda();
		h.run();
	}
}