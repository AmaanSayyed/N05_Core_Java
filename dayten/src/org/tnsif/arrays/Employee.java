package org.tnsif.arrays;

public class Employee {
	private int ID;
	private String name;
	private double percentage;
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public Employee(int iD, String name, double percentage) {
		super();
		ID = iD;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", percentage=" + percentage + "]";
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public static void main(String[] args) {
		
	}
}
