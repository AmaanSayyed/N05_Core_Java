//Program to demonstrate on Encapsulation
//Encapsulation is used to achieve data hiding by using private members(data ,methods) binded in single class

package encapsulation;

public class HDFCExec {
	public static void main(String[] args) {
		HDFC hf=new HDFC();
		hf.setAccNo(845196857485L);
		hf.setAccType("Saving");
		hf.setPinNo(8786);
		hf.setCvvNo(889);
		//System.out.println("Account No. :"+hf.getAccNo()+"\nAccount type :"+hf.getAccType()+"\nCVV No. :"+hf.getCvvNo()+"\nPin no.:"+hf.getPinNo());
		System.out.println(hf);
	}
}
