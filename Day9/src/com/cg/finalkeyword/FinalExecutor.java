package com.cg.finalkeyword;

public class FinalExecutor {

	public static void main(String[] args) {
		FinalVariable f = new FinalVariable();
		f.print("Sonu");
		
		//final method
		FinalChildMethod m1=new FinalChildMethod();
		System.out.println(m1.print(12));
		System.out.println(m1.print());
		
		//final class
		ChildClassTest t = new ChildClassTest();
		t.display();
		t.display(12);
	}

}