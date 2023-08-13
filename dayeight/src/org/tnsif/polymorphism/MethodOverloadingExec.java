package org.tnsif.polymorphism;

class MobilePhone{
	String model;
	int price;
	void call() {
		System.out.println("Calling a person with "+model); //cannot use same method in same class again
	}
	
	//method overloading -use different data-type or arguments
	void call(String model) {
		System.out.println("Calling a person again");
	}
}
class Smartphone extends MobilePhone {
	@Override
	void call() {
		super.call();
		System.out.println("Calling with hd voice over");
	}
	void call(String model,int price) {
		System.out.println("Calling a person third time");
	}
}
public class MethodOverloadingExec {
	public static void main(String[] args) {
		Smartphone st=new Smartphone();
		st.model="Iphone";
		st.call();
		st.call("Nokia 3310");
		st.call("Nokia",1500);
	}
}
