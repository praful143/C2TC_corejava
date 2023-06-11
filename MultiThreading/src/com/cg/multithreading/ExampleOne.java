package com.cg.multithreading;

class PPT extends Thread{
	public void run() {
		System.out.println("PPT priority :" + Thread.currentThread().getPriority());
	
	}
	
}
class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse Priority " + Thread.currentThread().getPriority());
	}
}
class Gmeet extends Thread{
	public void run() {
		System.out.println("Gmeet Priority:"+Thread.currentThread().getPriority());
	}
}
public class ExampleOne {

	public static void main(String[] args) {
		PPT obj = new PPT();
		obj.start();
		obj.setPriority(1);
		
		Eclipse e = new Eclipse();
		e.start();
		e.setPriority(10);
		
		Gmeet g = new Gmeet();
		g.start();
		g.setPriority(Thread.MIN_PRIORITY);
	}

}