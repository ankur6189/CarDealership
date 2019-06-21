package com.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new FileReader("myfile.txt"))) {
			String str;
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
				
			}
			
		}
		catch (IOException ie)
		{
			System.out.println("exception");
		}

	}

}
