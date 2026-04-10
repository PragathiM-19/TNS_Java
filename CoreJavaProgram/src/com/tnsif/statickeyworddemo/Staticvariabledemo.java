package com.tnsif.statickeyworddemo;

class Student {
	String name;
	int id;
static String collegename="Atria";

	public Student(String name,int id) {
		this.name=name;
		this.id=id;
		this.collegename=collegename;
	}
	void showdetails() {
		System.out.println(" Student:" +name+" id:"+id+ " college name:" +collegename);
	}
}

public class Staticvariabledemo {
	public static void main(String[] args) {
		Student s1=new Student("Guru",1);
		Student s2=new Student("Rahul",3);
		Student s3=new Student("Prajwal",5);
		Student s4=new Student("Roshan",7);
		
		s1.showdetails();
		s2.showdetails();
		s3.showdetails();
		s4.showdetails();
	}

}
