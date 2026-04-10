package com.tnsif.finalkeyworddemo;
//demo for final (u can't override)

class Ecommerceplatform{
	final void calculate() {
		System.out.println("Base discount 10%");
	}
}

class Amazon extends Ecommerceplatform{    //can't inherit
	@Override
	void calculate() {
		System.out.println("Base discount 20%");
	}
}
public class Finalmethod {

	public static void main(String[] args) {
		Amazon a = new Amazon();

	}

}
