//Program to demonstrate user input
package org.tnsif.introduction;

import java.util.Scanner;

public class FirstCode {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		
		//to take input from user
		Scanner sc = new Scanner(System.in);
		
//		int n1=sc.nextInt();
//		
//		System.out.println(n1);
//		
//		System.out.println("Enter float value: ");
//		float n2=sc.nextFloat();
//		System.out.println(n2);
//		
//		System.out.println("Enter char value: ");
//		char ch=sc.next().charAt(0);
//		System.out.println(ch);
		
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		System.out.println(str);
		}

}
