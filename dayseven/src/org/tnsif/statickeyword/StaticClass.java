package org.tnsif.statickeyword;

public class StaticClass {
	static int num1=67;
	static int num2=31;
	
	static float salary;
	static String companyName;
	//static block
	static {
		companyName="accenture";
		salary=15040.23f;
	}
	
	
	//method outside main function cannot be accessed if non static 
	public static void print() {
		System.out.println(num1+num2);
		System.out.println(salary+companyName);//if num is not static than cannot use inside static method
	}
	public static void main(String[] args) {
		print(); //no need to create object direct call can printed
	}
}
