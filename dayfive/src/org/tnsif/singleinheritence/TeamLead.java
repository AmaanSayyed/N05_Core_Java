package org.tnsif.singleinheritence;

//child class2
//parent class2
public class TeamLead extends Manager {
	private String leadName;
	private String projectName;
	private int empId;
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", projectName=" + projectName + ", empid=" + empId + "]";
	}
	public TeamLead(int empid,String deptName,String name,String leadName, String projectName, int empId) {
		super(empid,deptName,name);
		this.leadName = leadName;
		this.projectName = projectName;
		this.empId = empId;
	}
	
}
