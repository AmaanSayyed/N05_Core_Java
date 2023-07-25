package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCadeCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("Select option \n 1.Add \t 2.Substract \t 3.Multiply \t 4.Divide");
		int option=sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("Sum is: "+(n1+n2));
			break;
		case 2:
			System.out.println("Difference is: "+(n1-n2));
			break;
		case 3:
			System.out.println("Product is: "+(n1*n2));
			break;
		case 4:
			System.out.println("Remainder is: "+(n1/n2));
			break;
		default:
			System.out.println("Enter valid input");
		}
		
			
	}

}
