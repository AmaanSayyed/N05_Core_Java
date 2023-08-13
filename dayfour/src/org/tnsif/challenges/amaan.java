package org.tnsif.challenges;

import java.util.Scanner;

/**There are n people standing in a circle waiting to be executed .The counting out begins at some point in the
circle and proceeds around the circle in a fixed direction .In each step a certain number of people are skipped
next person is executed.The elimination proceeds around the circle(which is becoming smaller and smaller as the 
executed people are removed),until only last person remains,who is given freedom.
Given the total number of person n and number k which indicated that [k-1 person] are skipped and the kth person 
is killed in a circle.
The task is to chose the person in the initial circle that survives**/

public class amaan {
	static int survive(int n,int k) {
		if(n==1) {
			return 1;
		}
		else {
			return (survive(n-1,k)+k-1)%n+1;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(survive(n, k));
	}
}
