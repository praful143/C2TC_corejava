package com.cg.thiskeyword;
class check {
	check() {
		System.out.println("In check constructor");
	}
	void display() {
		System.out.println("In display method");
	}
	
}
class Practice{
	
	Practice(){
		System.out.println("In practice constructor");
	}
		
}
class Employee{
	Employee(){
		check c = new check();
		c.display();
		System.out.println("In employee Constructor");
	
	}
}

public class ConstructorArgument {

	public static void main(String[] args) {
		Practice p1 = new Practice();
		Employee e1 = new Employee();

	}
}