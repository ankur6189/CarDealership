package com.core;

import java.util.Timer;

public class SchedulerMain {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		Timer time = new Timer();
		ScheduledTask st =new ScheduledTask();time.schedule(st, 0,1000);
		for(int i=0;i<=5;i++)
		{
			System.out.println("execution in main thread..."+i);
			Thread.sleep(2000);
			if(i==5) {
				System.out.println("Application Terminates");
				System.exit(0);
			}
		}
		

	}

}
