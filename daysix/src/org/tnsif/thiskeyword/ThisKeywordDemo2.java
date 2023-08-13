package org.tnsif.thiskeyword;

public class ThisKeywordDemo2 {
	int a;
	public ThisKeywordDemo2() {
		this(10);
		System.out.println("This is default constructor");
	}
	public 	ThisKeywordDemo2(int a) {
		this.a=a;
		System.out.println("Parameterized constructor"+a+"value of a");
	}
	public static void main(String[] args) {
		ThisKeywordDemo2 tm=new ThisKeywordDemo2();
	}
}
