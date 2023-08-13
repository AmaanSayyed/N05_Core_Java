package org.tnsif.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {
	//max function
	static void max(int [] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Max element is : "+max);
	}
	public static void main(String[] args) {
		//	Runtime array input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght of array");
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();			
		}
		
		max(arr);
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}
}
