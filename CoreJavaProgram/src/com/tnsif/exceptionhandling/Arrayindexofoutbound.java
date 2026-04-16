package com.tnsif.exceptionhandling;

public class Arrayindexofoutbound {

	public static void main(String[] args) {
		int arr[]=new int[4];
		System.out.println(arr.length);
		
		try {
			int i=arr[8];
		}
		catch(Exception h) {
			System.out.println(h);
		}

	}

}
