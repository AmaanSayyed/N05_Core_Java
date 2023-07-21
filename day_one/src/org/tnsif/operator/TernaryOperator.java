package org.tnsif.operator;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println((n%2==0)?"Even":"odd");
		
	}

}
