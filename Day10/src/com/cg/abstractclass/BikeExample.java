package com.cg.abstractclass;
abstract class bike{
	bike(){
		System.out.println("bike constructor");
	}
	abstract void run();
	void changeGear() {
		System.out.println("Gear Changed");		
	}
}
class R15 extends bike{
	
	@Override
	void run() {
		System.out.println("R15 Bike is running safe");
	}
	
}

public class BikeExample {

	public static void main(String[] args) {
		R15 obj = new R15();
		obj.changeGear();
		obj.run();

	}

}