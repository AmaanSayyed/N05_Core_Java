package org.tnsif.thiskeyword;

public class ThisKeywordDemo1 {
	void print(ThisKeywordDemo1 t) {
		System.out.println("hey i am using this keyword");
	}
	void display() {
//		when you call any parameterized method inside non parameterized we get an error
//		to overcome this we have to use this keyword as an argument in method call
		print(this);
	}
	public static void main(String[] args) {
		ThisKeywordDemo1 t=new ThisKeywordDemo1();
		t.display();
	}
}
