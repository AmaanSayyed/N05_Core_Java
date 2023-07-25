package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=sc.nextInt();
		System.out.println("Enter Weight");
		int weight=sc.nextInt();
		
		if(age>=12) {
			if(weight>=40) {
				System.out.println("Eligible");
				if(weight>110) {
					System.out.println("Add ropes");
				}
			}
			
			else {
				System.out.println("not eligible");
			}
		}
		else{
			System.out.println("not eligible");
		}
	}

}
