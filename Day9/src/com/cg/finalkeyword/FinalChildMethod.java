package com.cg.finalkeyword;
//child class
public class FinalChildMethod extends FinalParentMethod {
	//final method cannot be override
	//method overloading is supported
	public int print(int num) {
		return num;
	}
}