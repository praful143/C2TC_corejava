package com.cg.setinterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> obj= new HashSet<String>(); 
		
		//HashSet<String> obj = new HashSet<String>(); -> This HashSet can include items those are only strings
		//HashSet<Integer> obj = new HashSet<Integer>(); -> This HashSet can include items those are only numbers
	
		
		//Hashset has many methods 
		
		// 1.add() :  add() method is used to add an item to the HashSet

		obj.add("TNSIF");
		obj.add("C2TC");
		obj.add("Program");
		obj.add("Hello");
		obj.add("TNSIF"); //every item in a set has to be unique, so this duplicate item doesn't get printed in o/p
		
		System.out.println(obj);
		
		// 2.contains() : To check whether an item exists in a HashSet, use the contains() method
		
		
		System.out.println(obj.contains("C2TC")); // returns true if hashset contains the mentioned item or else false

		
		// 3.remove(): To remove an item from the HashSet, use the remove() method
		
		obj.remove("Program");
		System.out.println(obj); 
		
		// 4.clear() : To remove all items in the HashSet, use the clear() method
		
		obj.clear();
		System.out.println(obj);
		
		// Using add() method  again to add items to list for practicing on other methods
		
		obj.add("Hello");
		obj.add("All");
		obj.add("Java");
		
		// 5.size(): To find out how many items there are, use the size() method
		
		 System.out.println(obj.size());
		 
		 // 6.Loop through the items of an HashSet with a for-each loop
		
		 for(int i = 1; i <= 2; i++) {
		      if(obj.contains(i)) {
		        System.out.println(i + " was found in the set.");
		      } else {
		        System.out.println(i + " was not found in the set.");
		      }
		}
	}
}
