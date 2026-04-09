package com.tnsif.inheritance;

public class Child extends Father{
	String cycle="pink";
	void read() {
		System.out.println("Java");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		System.out.println(c.money);
		c.drink();
		System.out.println(c.Car);
		System.out.println(c.cycle);
	}
}

