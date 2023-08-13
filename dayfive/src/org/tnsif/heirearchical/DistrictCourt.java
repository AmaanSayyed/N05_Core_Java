package org.tnsif.heirearchical;

public class DistrictCourt extends SupremeCourt{
	private String courtType;
	private int session;
	public String getCourtType() {
		return courtType;
	}
	public void setCourtType(String courtType) {
		this.courtType = courtType;
	}
	public int getSession() {
		return session;
	}
	public void setSession(int session) {
		this.session = session;
	}
	public DistrictCourt(String judgeName, String courtLocation, int noOfCase,String courtType, int session) {
		super(judgeName,courtLocation,noOfCase);
		this.courtType = courtType;
		this.session = session;
	}
	@Override
	public String toString() {
		return "DistrictCourt [courtType=" + courtType + ", session=" + session + ", " + super.toString()
				+ "]";
	}
	
	

}
