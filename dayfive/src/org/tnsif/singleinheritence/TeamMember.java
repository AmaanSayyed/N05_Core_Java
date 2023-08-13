package org.tnsif.singleinheritence;

public class TeamMember extends TeamLead{
	private int size;
	private int duration;

	public TeamMember(int empid, String deptName, String name, String leadName, String projectName, int empId2,int size,int duration) {
		super(empid, deptName, name, leadName, projectName, empId2);
		this.size=size;
		this.duration=duration;
		
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}

	
}
