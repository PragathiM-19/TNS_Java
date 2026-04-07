package com.tnsif.encapsulationdemo;

class Human1 {
	private int age; //variables
	private String name;
	
	//getter and setter method
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}


public class Encapsulationprogram {
	public static void main(String[] args) {
		Human1 h=new Human1();
		h.setAge(21);
		h.setName("Rahul");
		
		System.out.println(h.getAge());
		System.out.println(h.getName());
		
		h.setAge(16);
		h.setName("Guru");
		
		System.out.println(h.getAge());
		System.out.println(h.getName());
	}
}