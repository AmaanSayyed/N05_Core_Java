package org.tnsif.multipleinheritence;

public class Vehicle implements Bike,Car{
	public void show() {
		System.out.println(name+" "+model+" "+carName+" "+carModel);
		
	}
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.show();
	}
}
