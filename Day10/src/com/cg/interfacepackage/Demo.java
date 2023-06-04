package com.cg.interfacepackage;
interface Inf1{
	void display();
	default void show() {
		System.out.println("In show method");
	}
}

public class Demo implements Inf1{
	@Override
	public void display() {
		
	}

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.show();

	}

}