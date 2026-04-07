package com.tnsif.constructordemo;
public class ConExample {
	ConExample(){
		System.out.println("Default constructor");
	}
	ConExample(int a,String b){
		System.out.println("2 parameter");
	}
	ConExample(int a){
		System.out.println("1 parameter");
	}
	ConExample(int a,int b,int c){
		System.out.println("3 parameter");
	}
	public static void main(String args[]) {
		ConExample c=new ConExample();
		ConExample c1=new ConExample(1,"Yeah");
		ConExample c2=new ConExample(2);
		ConExample c3=new ConExample(1,2,3);
		
	}

}