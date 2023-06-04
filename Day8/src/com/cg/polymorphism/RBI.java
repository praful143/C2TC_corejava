//two or more method having same parameter


package com.cg.polymorphism;

//to achieve method overloading, inheritance is required

//Parent class
public class RBI {
	public float getInterestRate()
	{
		return 7.5f;
	}
}
//child class
class SBI extends RBI
{
	// below annotation ensures that the method should be override from parent class
	@Override
	public float getInterestRate()
	{
		System.out.println("Parent class method:" + super.getInterestRate());
		return 12.5f;
	}
}