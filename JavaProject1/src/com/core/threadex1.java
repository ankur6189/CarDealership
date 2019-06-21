package com.core;

public class threadex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   mythread t1=new mythread("t1");
   mythread t2=new mythread("t2");
	
	t1.start();
	t2.start();
	}

}
