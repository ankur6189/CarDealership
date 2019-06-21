package com.core;

public class C extends Thread{
	public void run()
	{	
	System.out.println("Thread C started");
	for(int i=1;i<=4;i++)
	{
		System.out.println("/t From ThreadC :i="+i);
	}
	System.out.println("Exit from C");

}
}