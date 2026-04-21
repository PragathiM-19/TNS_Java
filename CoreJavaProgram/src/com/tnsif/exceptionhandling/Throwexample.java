package com.tnsif.exceptionhandling;
// demo for throw example
public class Throwexample {
	public static void main(String[] args) {
		int age=2;
		
		if(age<18) {
			//manually throw an exception
			throw new ArithmeticException("you are not eligiable to vote");
			
		}
		else {
			System.out.println("you are eligiable to vote");
		}
	}

}
