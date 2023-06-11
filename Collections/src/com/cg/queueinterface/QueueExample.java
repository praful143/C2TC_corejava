// Queue: Represents a collection designed for holding elements prior to processing. 
// It follows the FIFO (First-In-First-Out) order

package com.cg.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0;i<5;i++)
			q.add(i);
		System.out.println(q);
		
		q.remove();
		System.out.println(q);
		
		int head = q.peek();
		System.out.println(head);
		
		System.out.println();

	}

}