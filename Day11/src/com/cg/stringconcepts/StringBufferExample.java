package com.cg.stringconcepts;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(10);
		System.out.println(sb.capacity());
		sb.append("JAVA");
		System.out.println(sb.capacity());
		sb.append("Is a Programming Language");
		System.out.println(sb.capacity());

	}

}