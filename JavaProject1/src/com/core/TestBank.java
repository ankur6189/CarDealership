package com.core;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Bank b =new SBI();
  int interest=b.getRateOfInterest();
  System.out.println("Rate of interest is:"+ interest +"%");
	}

}
