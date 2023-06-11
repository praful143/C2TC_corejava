package com.cg.setinterface;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		// Creating an empty LinekdhashSet of string type, <> -> Generic
		LinkedHashSet<String> obj = new LinkedHashSet<String>(); //LinkedHashSet Creation
   
		  
		// Adding elements to the above Set  
		// by invoking the add() method  
		
		obj.add("Lakshmi");  
		obj.add("Tejal");  
		obj.add("Nilam");  
		obj.add("Rani");  
		obj.add("Savita");
		obj.add("Praful");
		  
		// displaying all the elements  
		System.out.println("The hash set is: " + obj);  
		  
		// Removing an element from the above linked Set  
		  
		// since the element "Good" is present, therefore, the method remove()  
		// returns true  
		
		System.out.println(obj.remove("Praful"));  
		  
		// After removing the element  
		System.out.println("After removing the element, the hash set is: " + obj);  
		  
		// since the element "For" is not present, therefore, the method remove()  
		// returns false  
		
		System.out.println(obj.remove("Java"));  
		  
	}
}