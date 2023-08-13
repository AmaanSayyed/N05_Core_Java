package org.tnsif.singleinheritence;

public class Manager {
	private String deptName;
	private String name;
	private int empid;
	
	public Manager() {
		System.out.println("Default Contructor Manager");
	}
	public Manager(int empid, String name, String deptName) {
		super();
		this.deptName = deptName;
		this.name = name;
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + ", name=" + name + ", empid=" + empid + "]";
	}
	
}
