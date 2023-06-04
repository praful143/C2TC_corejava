package com.cg.superkeyword;
class Animalll{
	Animalll(){
		System.out.println("In animalll constructor");
	}
}
class Doggg extends Animalll{
	Doggg(){
		System.out.println("In doggg Constructor");
	}
}

public class Constructor {

	public static void main(String[] args) {
		Doggg d = new Doggg();

	}

}