//Program to check whether a person can be donor or not
package org.tnsif.operator;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		while (true) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Age:\n--------------------------");
		int age=sc.nextInt();
		
		System.out.println("Enter your Weight:\n-------------------------");
		float weight=sc.nextFloat();
		
		if((age>=18) &&(weight>=50)) {
			System.out.println("You can donate blood");
		}
		else {
			System.out.println("Sorry you dont meet criteria for donation \n");
		}
		}

	}

}
