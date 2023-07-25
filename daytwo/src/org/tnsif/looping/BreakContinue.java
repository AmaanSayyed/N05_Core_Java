package org.tnsif.looping;

public class BreakContinue {
	public static void main(String[] args) {
		int target=4;
		int n=20;
		int i=1;
		while(i<=20) {
			if(i==target) {
				System.out.println("Num found "+i);
				break;
			}
			i++;
		}
	}
}
