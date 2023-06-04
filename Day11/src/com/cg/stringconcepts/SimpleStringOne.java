// Java StringBuffer class is used to create mutable(modifiable)string objects
// String: Fixed length, immutable character sequences
// String Buffer : Growable, writable character sequences

package com.cg.stringconcepts;

public class SimpleStringOne {

	public static void main(String[] args) {
		
		String s1 = "JAVA";
		String s2 = s1.concat("Programming");  //s1.concat(s1)
		System.out.println(s1.concat("Programming"));  //Sysout(s1)
		System.out.println(s2);
		
		StringBuffer sb = new StringBuffer("JAVA");
		sb.append("Programming");
		System.out.println("In string buffer" + sb);

	}

}