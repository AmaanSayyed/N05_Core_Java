//Program to demonstrate on Encapsulation
//Encapsulation is used to achieve data hiding by using private members(data ,methods) binded in single class
package encapsulation;

public class HDFC {
	private Long accNo;
	private String accType;
	private int pinNo;
	private int cvvNo;
	
	//set to setValue and get to retriveValue
	
	public Long getAccNo() {
		return accNo;
	}
	@Override
	public String toString() {
		return "HDFC [accNo=" + accNo + ", accType=" + accType + ", pinNo=" + pinNo + ", cvvNo=" + cvvNo + "]";
	}
	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	public int getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}
}
