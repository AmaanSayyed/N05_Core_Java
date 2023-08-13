//Pratik is so much interested in gardening and hence he plants more trees in his gardens.
//He plants trees in a rectangular fashion with the order of rows and columns and number the trees 
//in a rowwise order.He planted the mango tree only in the first row first column and last column.Given the tree no.
// and rows and columns ur task is to find out whether the given tree is mango tree or not
//input n=5,t=11,11=mango?
package org.tnsif.challenges;

import java.util.Scanner;

public class mangoTreeExec {
	static void isMangoTree(int n,int t) {
		if((t%n==0) || (t%n==1) || (t<=n)) {
			System.out.println("Is a mango tree");
		}
		else {
			System.out.println("Not a mango tree");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();
		int t=sc.nextInt();
		isMangoTree(n, t);
	}
	
}
