package org.tnsif.interfacejava;

//class which implements interface is called implementable class
public class PopExec implements PopCorn {
	
	public void pop() {
		System.out.println("Serving you popcorn");
	}
	public static void main(String[] args) {
		PopExec pe =new PopExec();
		pe.pop();
	}
	
}
