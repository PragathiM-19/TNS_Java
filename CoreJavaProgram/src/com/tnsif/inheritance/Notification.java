package com.tnsif.inheritance;

public class Notification {
	String mess="Default notification";
}
class pushnotification extends Notification{
	String mess="Push notification";
	void dis() {
		System.out.println("Child"+mess);
		System.out.println("Parent"+mess);
	}
	

	public static void main(String[] args) {
		pushnotification p=new pushnotification();
		p.dis();

	}

}
