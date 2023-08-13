//program to demonstrate access modifiers
package org.tnsif.accessspecifier;

public class Bank {
	public String bankName;
	private int pinNo;
	long accountNo=846248129653L;
	
	
	public void displayBank() {
		System.out.println("Bank name is: "+bankName);
	}
	private void displayPin() {
		System.out.println("Pin is : "+pinNo);
	}
	void displayAcnt() {
		System.out.println("Account no is"+accountNo);
	}
	
}
