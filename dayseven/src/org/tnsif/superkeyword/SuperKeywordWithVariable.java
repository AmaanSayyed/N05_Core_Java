//Super can be used to refer immediate parent class instance variable
//Super can be used to invoke parent class method
//super() can be used to invoke immediate parent class constructor
package org.tnsif.superkeyword;

class State{
	String statename="Punjab";

	public State() {
		System.out.println("Parent default constructor");
		
	}
	void display() {
		System.out.println("State name is: "+statename);
	}
	
	
}
class Capital extends State{
	
	String statename="Haryana";
	String capital="Chandigarh";
	
	public Capital() {
		super(); //calling parent class default constructor
		System.out.println("Child default constructor");
	}
	public void display() {
		super.display();//if the parent and child method name is same we can use super.methodname to call parent method
		System.out.println("State name is: "+statename+" Capital name is"+capital);
//		System.out.println(super.statename); to call parent class instance variable
		
	}
}
public class SuperKeywordWithVariable {
	public static void main(String[] args) {
	Capital c=new Capital();
	System.out.println(c.statename);
	c.display();
	}
}
