package com.core;

public class mythread extends Thread {
	String ss;
	public mythread(String S)
	{
		ss=S;
	}
public void run()
{
	for(int i=0;i<2;i++)
	{
		System.out.println(ss+"thread is running ...with stage"+i);
	}
}
	
}
