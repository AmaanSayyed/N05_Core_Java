package org.tnsif.arrays;



public class Array1 {
	public static void main(String[] args) {
		
		//Declaration of array at compile-time
		int [] arr = {10,23,41,2,12};
		System.out.println(arr[2]);  //element at 2nd index
		System.out.print("[");
		for(int var:arr) {
			System.out.print(" "+var+" ");
		}
		System.out.print("]");
	}
	//max=arr[i]

}
