package org.tnsif.polymorphism;

import java.util.Scanner;

class Laptop{
	String gen1;
	void Spec(String gen1,String gen2) {
		System.out.println("specs: "+gen1);
	}
}
	class Acer extends Laptop{
		String gen2;
		void Spec(String gen1,String gen2) {
			super.Spec(gen1,gen2);
			System.out.println("Specs: "+gen2);
		}
	}

public class MethodOverExec {
	public static void main(String[] args) {
		Acer ac=new Acer();
		Scanner sc=new Scanner(System.in);
		String gen1=sc.nextLine();
		String gen2=sc.nextLine();
		ac.Spec(gen1,gen2);
	}
}
