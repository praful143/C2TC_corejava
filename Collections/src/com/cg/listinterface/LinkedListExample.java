package com.cg.listinterface;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(40);
		ll.addFirst(5);
		ll.add(2,60);
		ll.addLast(30);
		ll.add(50);
		
		System.out.println(ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		ll.removeFirst();
		ll.removeLast();
		ll.remove();
		
		System.out.println(ll);
		
		ListIterator<Integer> li=ll.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next() + "\t");	
		}
		
		System.out.println();
		li=ll.listIterator(ll.size());
		
		while(li.hasPrevious()) {
			int n = li.previous();
			System.out.println(n+"\t");
			if(n==20)
				li.add(99999);
			if(n==60)
				li.set(5555);
			
		}
		System.out.println();
		System.out.println(ll);

	}

}