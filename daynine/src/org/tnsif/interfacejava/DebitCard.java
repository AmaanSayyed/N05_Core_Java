package org.tnsif.interfacejava;

public interface DebitCard {
	long cardNo=647832138932L; //public static final by default and have to initialize
	
//	can't use concrete method inside an interface
	
	void displayCardDetails(); //abstract by default
	
	default void display() {
		System.out.println("This is default method of interface");
	}
	
	static void displayStatic() {
		System.out.println("This is static method of interface");
	}
	
}
