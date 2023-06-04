package com.cg.statickeyword;

public class MethodDemo {
	
		public static void main(String[] args) {
			Student s1 = new Student(20,"akash");
			Student s2 = new Student(30,"praful");
			Student s3 = new Student(32,"divya");
			
			//s1.change(); - Right
			//change(); - Wrong
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);

		}


}