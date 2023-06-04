package com.cg.abstractclass;
abstract class Shape {

	void draw() {
		
	}
	
}
class Rectangle extends Shape{
	
	@Override
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}
class Circle extends Shape{
	
	@Override
	void draw() {
		System.out.println("Drawing Circle");
	}
	
}
public class Client{

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Shape s = new Circle();
		r.draw();
		s.draw();
			
	}

}
