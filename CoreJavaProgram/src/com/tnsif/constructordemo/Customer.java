package com.tnsif.constructordemo;

public class Customer {
	
private String Customername;
private String Customeraddress;
private int customerid;


public String getCustomername() {
	return Customername;
}
public void setCustomername(String customername) {
	Customername = customername;
}
public String getCustomeraddress() {
	return Customeraddress;
}
public void setCustomeraddress(String customeraddress) {
	Customeraddress = customeraddress;
}
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}

@Override
public String toString() {
	return "Customer [Customername=" + Customername + ", Customeraddress=" + Customeraddress + ", customerid="
			+ customerid + "]";
}



}