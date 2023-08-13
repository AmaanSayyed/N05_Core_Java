package org.tnsif.heirearchical;

public class SupremeCourt {
	private String judgeName;
	private String courtLocation;
	private int noOfCase;
	public String getJudgeName() {
		return judgeName;
	}
	public void setJudgeName(String judgeName) {
		this.judgeName = judgeName;
	}
	public String getCourtLocation() {
		return courtLocation;
	}
	public void setCourtLocation(String courtLocation) {
		this.courtLocation = courtLocation;
	}
	public int getNoOfCase() {
		return noOfCase;
	}
	public void setNoOfCase(int noOfCase) {
		this.noOfCase = noOfCase;
	}
	public SupremeCourt() {
		super();
		System.out.println(" Supreme Default constructor");
	}
	public SupremeCourt(String judgeName, String courtLocation, int noOfCase) {
		super();
		this.judgeName = judgeName;
		this.courtLocation = courtLocation;
		this.noOfCase = noOfCase;
		System.out.println("SupremeThis is Parameterized");
	}
	@Override
	public String toString() {
		return "SupremeCourt [judgeName=" + judgeName + ", courtLocation=" + courtLocation + ", noOfCase=" + noOfCase
				+ "]";
	}
	
	
	
}
