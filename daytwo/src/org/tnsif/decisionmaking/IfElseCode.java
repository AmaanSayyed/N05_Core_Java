//Program to demonstrate if else
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password="amaan@1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter password");
		String input=sc.nextLine();
		
		
		if(input.equals(password)) {
			System.out.println("Welcome !");
		}
		else {
			System.out.println("Invalid password");
		}
	}

}
