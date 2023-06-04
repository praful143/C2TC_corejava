package com.cg.abstractclass;
abstract class Bank{
	abstract int rateofinterest();
}
class SBI extends Bank{
	
	@Override
	int rateofinterest() {
		return 7;
	}
}
class HDFC extends Bank{
	@Override
	int rateofinterest() {
		return 8;
	}
}

public class BankingExample {

	public static void main(String[] args) {
		HDFC h = new HDFC();
		System.out.println(h.rateofinterest());

	}
}