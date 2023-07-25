//program to demonstrate cascaded if else
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class CasIfElse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of 5 subjects");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		
		float total=(float)(m1+m2+m3+m4+m5);
		float percentage=(float)((total/500))*100;
		
		System.out.println(percentage);
		if(percentage>85 && percentage<=100) {
			System.out.println("Grade A");
		}
		else if(percentage>=70 && percentage<=85) {
			System.out.println("Grade B");
		}
		else if(percentage>=55 && percentage<70) {
			System.out.println("Grade C");
		}
		else if(percentage>=0 && percentage<55) {
			System.out.println("Failed");
		}
		else {
			System.out.println("Enter valid marks");
		}
	}
	
}
