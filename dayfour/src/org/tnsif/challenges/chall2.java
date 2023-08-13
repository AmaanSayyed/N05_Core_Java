/**  Ask user for their birth year encoded as 2 digit[like "02"-2002 ]and for current year also encoded as 2 digit
  	[like "23"] write a program to find users current age in years
 **/
package org.tnsif.challenges;

import java.util.Scanner;

public class chall2 {
	static int ageCheck(int birth,int curr) {
		if(birth>curr) {
			return (100-birth)+curr;
		}
		else {
			return curr-birth;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int birth=sc.nextInt();
		int curr=sc.nextInt();
		System.out.println(ageCheck(birth, curr));
	}
}
