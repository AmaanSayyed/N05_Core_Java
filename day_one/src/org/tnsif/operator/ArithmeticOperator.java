//Program to use arithmetic operators
package org.tnsif.operator;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: \n");
		int n1=sc.nextInt();
		System.out.println("Enter num2: \n");
		int n2=sc.nextInt();
		
		System.out.println("Sum is " + (n1+n2) );
		System.out.println("Product is " + (n1*n2) );
		System.out.println("Remainder is " + (n1%n2) );
		
	}

}
