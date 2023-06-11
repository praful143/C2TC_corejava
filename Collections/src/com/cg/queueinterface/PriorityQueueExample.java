package com.cg.queueinterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<String> pq = new PriorityQueue<>();
		pq.add("Java");
		pq.add("C");
		pq.add("HTML");
		
		System.out.println(pq);
		
	}

}