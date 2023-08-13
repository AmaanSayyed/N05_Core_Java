package org.tnsif.thiskeyword;

class Country{
	String country="France";
}
class Capital extends Country{
	String city="Paris";
}

public class CountryExec {
	public static void main(String[] args) {
		Capital cp=new Capital();
		if(cp instanceof Country) {
			System.out.println("True");
			}
		else {
			System.out.println("False");
		}
	}
	
}

