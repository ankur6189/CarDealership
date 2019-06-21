package com.core;

import java.util.Date;
import java.util.TimerTask;

public class ScheduledTask extends TimerTask {
	Date now;
	public void run() {
		now = new Date();
		System.out.println("time is:"+now);
	}

}
