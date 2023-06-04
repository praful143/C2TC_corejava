package com.cg.thiskeyword;
class Test{
	void show(Test b) {
		System.out.println("In show method");
	}
	void display(Test a) {
		show(this);
		System.out.println("In display method");
	}
}
class Student{
	
}

public class MethodArgument {

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Student s1 = new Student();
		t1.display(t2);

	}

}