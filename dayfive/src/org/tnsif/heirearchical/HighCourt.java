package org.tnsif.heirearchical;
//childClass1
public class HighCourt extends SupremeCourt {
	private int noOfJudge;
	private String courtName;
	public int getNoOfJudge() {
		return noOfJudge;
	}
	public void setNoOfJudge(int noOfJudge) {
		this.noOfJudge = noOfJudge;
	}
	public String getCourtName() {
		return courtName;
	}
	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}
	public HighCourt(String judgeName, String courtLocation, int noOfCase,int noOfJudge, String courtName) {
		super(judgeName,courtLocation,noOfCase);
		this.noOfJudge = noOfJudge;
		this.courtName = courtName;
	}
	@Override
	public String toString() {
		return "HighCourt [noOfJudge=" + noOfJudge + ", courtName=" + courtName + ", " + super.toString()
				+ "]";
	}
	
}
