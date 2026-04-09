package com.tnsif.polymorphism;
class Hey {
	Hey(int a) {
		System.out.println("Num:"+a);
	}
	Hey(int b, String c) {
		System.out.println("Num:"+b+" Name:"+c);
	}
}

public class Constructor_Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hey h=new Hey(2);
		Hey h1=new Hey(2,"Namis");
	}

}
