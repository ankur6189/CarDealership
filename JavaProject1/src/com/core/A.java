package com.core;

public class A extends Thread{
	public void run()
	{	
	System.out.println("Thread A started");
	for(int i=1;i<=4;i++)
	{
		System.out.println("/t From ThreadA :i="+i);
	}
	System.out.println("Exit from A");

}
}
