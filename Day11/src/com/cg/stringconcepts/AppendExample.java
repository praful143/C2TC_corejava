// append() : Concatenates the given argument with this String

package com.cg.stringconcepts;

public class AppendExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("World"); //now original string is changed 
		System.out.println(sb); //prints Hello Java

	}

}
