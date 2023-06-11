package com.cg.multithreading;
class Edge implements Runnable{
	public void run() {
		System.out.println("In Edge thread");
	}
}

class Chrome implements Runnable {
	public void run() {
		System.out.println("In Chrome thread");
	}
}
public class ExampleTwo {

	public static void main(String[] args) {
		Edge e = new Edge(); 
		Thread obj = new Thread(e); //e.run() works but e.start() doesn't work
		obj.start();
		
		Chrome c = new Chrome();
		Thread obj1 = new Thread(c);
		obj1.start();

	}

}