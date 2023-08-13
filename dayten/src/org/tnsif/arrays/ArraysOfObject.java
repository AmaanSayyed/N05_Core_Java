package org.tnsif.arrays;

public class ArraysOfObject {
	public static void main(String[] args) {
		Employee arr[]=new Employee[2];
		
		arr[0]=new Employee(1, "Mike", 78.43);  
		arr[1]=new Employee(2, "Justin", 98.05);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
	}
		
		}
}
