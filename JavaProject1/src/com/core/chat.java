package com.core;

public class chat {
	boolean flag =false;
	public synchronized void Questin(String msg) {
		if(flag) {
			try {
				wait();}
			catch(InterruptedException e) {
				e.printStackTrace();}
			}
		System.out.println(msg);
		flag=true;
		notify();
		}
 public synchronized void Answer(String msg) {
	 if(!flag) {try { wait();}
	 
	 catch(InterruptedException e)
	 {
		 e.printStackTrace();  }}
	 System.out.println(msg);
	 flag=false;
	 notify();
 }}

class T1 implements Runnable{
	
	Chat m; 
	String s1[]= {"hi","how R U","im also fine"};
	public T1(Chat m1)
	{
		this.m=m1;
		newThread(this,"Question").start();
		
	}
}
