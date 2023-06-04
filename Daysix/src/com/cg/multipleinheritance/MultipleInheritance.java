package com.cg.multipleinheritance;
interface Dad{
	void snoring();
}
interface Mom{
	void snoring();
}
class You implements Dad,Mom{
	public void snoring() {
		System.out.println("My Dad and Mom have that habit");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		
		You y= new You();
		y.snoring();

	}

}