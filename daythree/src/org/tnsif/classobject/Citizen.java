//Program to demonstrate default and parameterized constructor
package org.tnsif.classobject;

public class Citizen {
	//data member
	String citizenType;
	long aadharNumber;
	String gender;
	String city;
	public Citizen() {
		System.out.println("This is default construcor");
	}
	public Citizen(String citizenType, long aadharNumber, String gender, String city) {
		this.citizenType = citizenType;
		this.aadharNumber = aadharNumber;
		this.gender = gender;
		this.city = city;
		System.out.println("This is parameterized constructor");
		
	}
	@Override
	public String toString() {
		return "Citizen [citizenType=" + citizenType + ", aadharNumber=" + aadharNumber + ", gender=" + gender
				+ ", city=" + city + "]";
	}
	
	
	
	
}
