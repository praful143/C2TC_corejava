/* In Java, a collection is an object that groups multiple elements into a single unit.
   It provides various methods and interfaces to manipulate and manage groups of objects. 
   Java provides a rich set of built-in collection classes and interfaces in the java.util package*/
 
/* List: Represents an ordered collection of elements with duplicate values 
and Elements can be accessed by their index */

package com.cg.listinterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List <String> names = new ArrayList<>();
		names.add("Tejal");
		names.add("pooja");
		names.add("Neha");
		names.add("Praful");
		System.out.println(names);
		
		names.remove("Praful");
		
		Collections.reverse(names);
		System.out.println(names);
		
		Iterator<String> i = names.iterator();
		while(i.hasNext()) {
			String nm = i.next();
			System.out.println(i.next());
		}
	}
}
