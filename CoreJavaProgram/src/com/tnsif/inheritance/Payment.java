package com.tnsif.inheritance;

public class Payment {
	void process() {
		System.out.println("Processing the payment");
	}

}
class Gpay extends Payment {
	void process() {
		System.out.println("Processing via Gpay");
	}
	void dis() {
		super.process();
		process();
	}
	public static void main(String[] args) {
		Gpay G= new Gpay();
		G.dis();
	}
}