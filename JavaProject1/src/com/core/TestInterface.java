package com.core;
interface Printable{
void print();
void show();
}
interface Showable{
void print();
}
class TestInterface implements Printable, Showable{
	public void print()
	{
		System.out.println("hello");
		
	}
	public void show()
	{
		System.out.println("Java");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable obj = new TestInterface();
		obj.print();
		obj.show();
		Showable obj2 = new TestInterface();
		obj2.print();
		//obj2.show does not exist

	}

}
