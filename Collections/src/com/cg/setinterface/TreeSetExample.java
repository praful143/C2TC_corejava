package com.cg.setinterface;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		//Create TreeSet object.
		TreeSet<String> treeSet = new TreeSet<String>();
		 
		//Add objects to the HashSet.
		treeSet.add("Tejal");
		treeSet.add("pooja");
		treeSet.add("praful");
		treeSet.add("Ravina");
		treeSet.add("sunita");
		treeSet.add("Pranita");
		 
		//Print the TreeSet object.
		System.out.println("TreeSet elements:");
		System.out.println(treeSet);
		 
		//Print the TreeSet elements using iterator.
		Iterator<String> iterator=treeSet.iterator();
		System.out.println("\nTreeSet elements using iterator:");
		
		while(iterator.hasNext()){  
			
			System.out.println(iterator.next());  
			
		}  
		
	}
}