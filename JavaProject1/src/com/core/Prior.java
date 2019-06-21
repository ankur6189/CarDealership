package com.core;

public class Prior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A t1 = new A();
		B t2 = new B();
		C t3 = new C();
		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(t1.getPriority()+1);	
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		System.out.println("Thread B started");
		t2.start();
		System.out.println("Thread c started");
		t3.start();
		System.out.println("Thread  A started ");
		

	}

}
