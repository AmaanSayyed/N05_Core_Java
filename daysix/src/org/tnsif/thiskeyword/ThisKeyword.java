		//final keyword in java is used to restrict data from user
		//it is used to declare constant and cannot change data value
		
//		final keyword->variable-cannot change value of that variable 
//					   method- cannot override that method
//					   class-cannot inherit that class

package org.tnsif.thiskeyword;

public class ThisKeyword {
	int a;
	int b;
	void setdata(int a,int b) {
//		a=a;//it wont initialize instance variable to parameters
//		b=b; //also a=x will assign the value
		this.a=a; //value of parameter is assigned to instance variable
		this.b=b;
	}
	void getdata() {
		System.out.println(a);
		System.out.println(b);
	}
	ThisKeyword(){
		System.out.println("Default constructor");
	}
	public ThisKeyword(int a ,int b){
		this.a=a;
		this.b=b;
		}
	
		void display() {
			System.out.println("Parameterized constructor"+"  "+a+"  "+b);
		}
	public static void main(String[] args) {
		ThisKeyword tk=new ThisKeyword(3,5);
		tk.display();
//		tk.setdata(3, 5);
//		tk.getdata();
	}
}
