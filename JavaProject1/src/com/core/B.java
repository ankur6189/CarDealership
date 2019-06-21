package com.core;

public class B extends Thread{
	public void run()
	{	
	System.out.println("Thread B started");
	for(int i=1;i<=4;i++)
	{
		System.out.println("/t From ThreadB :i="+i);
	}
	System.out.println("Exit from B");

}
}