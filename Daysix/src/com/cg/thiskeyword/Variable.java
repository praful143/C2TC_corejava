package com.cg.thiskeyword;

public class Variable {

	int id;
	String name;
	float fee;
	
	public Variable(int id,String name,float fee) {
		this.id=id;
		this.name=name;
		this.fee=fee;
	}
	
	void display() {
		System.out.println(id + " " + name + " " + fee);
	}

	public static void main(String[] args) {
		Variable v = new Variable(4,"praful ballal",4000.00f);
		v.display();
	}
	


}
