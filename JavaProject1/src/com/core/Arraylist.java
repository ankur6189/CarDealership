package com.core;
import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<String> al = new ArrayList<String>();
   al.add("JAVA");
   al.add("C++");
   al.add("PERL");
   al.add("PHP");
   System.out.println(al);
   System.out.println("Element at index 1:"+al.get(1));
   System.out.println("Does list contain java?"+al.contains("java"));
   al.add(2,"play");
   System.out.println(al);
   System.out.println("is al arraylist empty?"+al.isEmpty());
   System.out.println("index of PERL is"+al.indexOf("PERL"));
	System.out.println("Size of the arraylist is:"+al.size());
	System.out.println(al);
	al.remove("PERL");
	for(String str:al)
		System.out.println(str);
}

}
